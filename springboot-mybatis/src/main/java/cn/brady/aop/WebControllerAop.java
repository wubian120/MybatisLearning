package cn.brady.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@Component
@Aspect
public class WebControllerAop {

    @Pointcut("execution(* cn.brady.controller..*.*(..))")
    public void executeService(){



    }

    @Before("executeService()")
    public void doBeforeAdvice(JoinPoint joinPoint){
        System.out.println("前置通知");
        Object[] obj = joinPoint.getArgs();

        joinPoint.getThis();
        joinPoint.getTarget();

        Signature signature = joinPoint.getSignature();
        System.out.println(signature.getName());
        System.out.println(signature.getDeclaringTypeName());

        signature.getDeclaringType();
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();

        HttpServletRequest request =
                (HttpServletRequest) requestAttributes.resolveReference(RequestAttributes.REFERENCE_REQUEST);

        Enumeration<String> enumeration = request.getParameterNames();

        Map<String, String> paramsMap = new HashMap<>();
        while (enumeration.hasMoreElements()){
            String parameter = enumeration.nextElement();
            paramsMap.put(parameter, request.getParameter(parameter));

        }

        if(obj.length >0){
            System.out.println("请求参数为：" + paramsMap);

        }

    }

    @AfterReturning(value = "execution(* cn.brady.controller..*.*(..))",returning = "keys")
    public void doAfterReturningAdvice(JoinPoint joinPoint, Object keys){

        System.out.println("第一个后置返回通知的返回值： " + keys);
    }

    //
    @AfterReturning(value = "execution(* cn.brady.controller..*.*(..))",returning = "keys",argNames = "keys")
    public void doAfterReturningAdvice2(String keys){

        System.out.println("第二个后置返回通知的返回值：" + keys);
    }



    @AfterThrowing(value = "executeService()",throwing = "exception")
    public void doAfterThrowAdvice(JoinPoint joinPoint, Throwable exception){
        System.out.println(joinPoint.getSignature().getName());
        if(exception instanceof NullPointerException){
            System.out.println("发生了空指针异常.....");
        }

    }

    @After("executeService()")
    public void doAfterAdvice(JoinPoint joinPoint){
        System.out.println("后置最终通知执行了...");
    }
    @Around("execution(* cn.brady.controller..*.testAround*(..))")
    public Object doAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){

        System.out.println("环绕通知的目标方法为： " + proceedingJoinPoint.getSignature().getName());
        try{
            Object obj = proceedingJoinPoint.proceed();
            return obj;
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
        return null;
    }


}

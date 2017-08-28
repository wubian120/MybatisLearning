package cn.brady.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/aop")
public class AopController {


    @RequestMapping(value = "/throw",method = RequestMethod.GET)
    public String throwException(String key){

        throw  new NullPointerException();

    }

    @RequestMapping(value = "/arond",method = RequestMethod.GET)
    public String testAroundService(String key){
        return "环绕通知：" + key;
    }




}

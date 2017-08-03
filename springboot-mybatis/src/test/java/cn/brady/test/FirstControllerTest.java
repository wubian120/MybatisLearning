package cn.brady.test;

import cn.brady.Application;
import cn.brady.controller.FirstController;
import cn.brady.domain.User;
import cn.brady.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class FirstControllerTest {

    @Test
    public void FirstControllerT(){

        FirstController fc = new FirstController();
        System.out.println(fc.index());

    }

    @Autowired
    UserService us;

    @Test
    public void test1(){
        User user = new User();
        user.setName("1unit test");
        user.setMobile("12345671231");
        user.setPassword("9999999");

        Date today = new Date();
        user.setCreateTime(today);
        us.insertUser(user);
    }

}

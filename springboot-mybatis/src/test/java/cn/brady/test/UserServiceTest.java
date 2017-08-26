package cn.brady.test;

import cn.brady.Application;
import cn.brady.domain.User;
import cn.brady.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= Application.class,webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void testUser()throws Exception{

        User u = userService.getUserByName("mond");

    }


}

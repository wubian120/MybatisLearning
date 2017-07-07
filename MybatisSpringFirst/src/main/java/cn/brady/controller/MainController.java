package cn.brady.controller;

/**
 * Created by Brady on 2017/5/2.
 */

import cn.brady.dao.UserMapper;
import cn.brady.pojo.User;
import cn.brady.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;




    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(){
        return "Hello World...";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUsers(){

//        List<User> users = userService.getAll();

        List<User> users = userMapper.getAll();



        System.out.println(users.size());

        return "Hello World...";
    }


}

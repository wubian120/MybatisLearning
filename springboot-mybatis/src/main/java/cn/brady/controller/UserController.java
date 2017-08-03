package cn.brady.controller;

import cn.brady.domain.User;
import cn.brady.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/api/insertUser",method = RequestMethod.POST)
    public long insertUser(@RequestBody User user){

        return userService.insertUser(user);
    }


    @RequestMapping(value = "api/user",method = RequestMethod.GET)
    public User getUserById(@RequestParam("uid") long id){
        return userService.getUserById(id);
    }



}

package cn.brady.controller;

/**
 * Created by Brady on 2017/5/2.
 */


import cn.brady.dao.ItemMapper;
import cn.brady.dao.OrderDetailMapper;
import cn.brady.dao.UserMapper;
import cn.brady.pojo.OrderDetail;
import cn.brady.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class MainController {


    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private OrderDetailMapper odMapper;




    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(){
        return "Hello World..Mybatis.";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getUsers(){

//        List<User> users = userService.getAll();

        List<User> users = userMapper.getAllUsers();

        User u1 = userMapper.getUserById(1);

        System.out.println(" name: "+u1.getName()+" " + u1.getUid() + " time: " +u1.getCreateTime()+" ");


        System.out.println(users.size());

        List<OrderDetail> ods = odMapper.getAllDetail();

        System.out.println(ods.size());

        return "Hello World...";
    }


}

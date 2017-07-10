package cn.brady.controller;

/**
 * Created by Brady on 2017/5/2.
 */


import cn.brady.dao.*;

import cn.brady.pojo.Order;
import cn.brady.pojo.OrderDetail;
import cn.brady.pojo.OrdersCustom;
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

    @Autowired
    private OrdersCustomMapper ocMapper;

    @Autowired
    private OrderMapper orderMapper;




    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(){
        return "Hello World..Mybatis.";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getUsers()throws Exception{

//        List<User> users = userService.getAll();

        List<User> users = userMapper.getAllUsers();

        User u1 = userMapper.getUserById(1);

        System.out.println(" name: "+u1.getName()+" " + u1.getUid() + " time: " +u1.getCreateTime()+" ");


        System.out.println(users.size());

        List<OrderDetail> ods = odMapper.getAllDetail();

        System.out.println(ods.size());



        List<OrdersCustom> ocs = ocMapper.findOrdersUser();

        for(OrdersCustom oc : ocs){
            System.out.println(oc.getName()+ oc.getCreateTime()+ " order time"
            + oc.getCreateTime() +" order note " + oc.getNote());
        }

        List<Order> orders = orderMapper.findOrderUserResultMap();

        System.out.println("Using OrderMapper to get user...");
        for(Order order : orders){
            System.out.println(order.getUid()+" "+ order.getUser().getName()+" time: "+order.getCreateTime()+ " user time: "+order.getUser().getCreateTime() );
        }

        System.out.println(".....一对多.....");
        User user= userMapper.getOrdersByUserId(3);

        for(Order order : user.getOrders()){
            System.out.println(order.getCreateTime() + " note " + order.getNote());
        }

        System.out.println("..OrderDetail...一对多.....");
        List<OrderDetail> details = orderMapper.getOrderDetailsByOrderId(2);
        for(OrderDetail od : details){
            System.out.println("od order_id: " + od.getOrderId()+" od num: "+ od.getNum());
        }

        System.out.println(".....多对多.....");





        return "Hello World...";
    }


}

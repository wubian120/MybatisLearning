package cn.brady.dao;

import cn.brady.pojo.Order;
import cn.brady.pojo.User;

import java.util.List;

/**
 * Created by Brady on 2017/7/6.
 */
public interface UserMapper {

    List<User> getAllUsers();

    User getUserById(long uid);

    List<Order> getOrdersByUserId(long uid);

}

package cn.brady.dao;

import cn.brady.pojo.Order;
import cn.brady.pojo.User;

import java.util.List;

/**
 * Created by Brady on 2017/7/7.
 */
public interface OrderMapper {

    List<Order> getAllOrders();

    Order getOrderById(long uid);

    List<Order> findOrderUserResultMap() throws Exception;

}

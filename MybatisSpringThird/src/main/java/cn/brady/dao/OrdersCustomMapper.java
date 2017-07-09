package cn.brady.dao;

import cn.brady.pojo.OrdersCustom;

import java.util.List;

/**
 * Created by wubian on 2017/7/8.
 */
public interface OrdersCustomMapper {

    List<OrdersCustom> findOrdersUser() throws Exception;
}

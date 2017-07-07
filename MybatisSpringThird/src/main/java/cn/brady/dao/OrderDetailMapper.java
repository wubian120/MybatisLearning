package cn.brady.dao;

import cn.brady.pojo.OrderDetail;


import java.util.List;

/**
 * Created by Brady on 2017/7/7.
 */
public interface OrderDetailMapper {

    List<OrderDetail> getAllDetail();

    OrderDetail getOrderDetailById(long uid);

}

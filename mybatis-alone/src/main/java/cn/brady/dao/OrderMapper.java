package cn.brady.dao;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Brady on 2017/7/7.
 */
public interface OrderMapper {


    @Results(id="orderResults", value = {
        @Result(property = "oid", column = "oid"),
        @Result(property = "uid", column = "uid"),
        @Result(property = "createTime", column = "create_time"),
        @Result(property = "note", column = "note"),

    })

    @Select("SELECT `order`.oid, `order`.uid, `order`.create_time, `order`.note FROM `order`")
    List<Order> getAllOrders();


    @Select("SELECT `order`.oid, `order`.uid,`order`.create_time, `order`.note FROM `order` WHERE `order`.uid = #{uid}")
    @Results(id="orderResults")
    List<Order> getOrdersByUserId(long uid);





}

package cn.brady.dao;

import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Brady on 2017/4/28.
 */
public interface UserMapper {

    @Results(id="userResults",value = {
        @Result(property = "uid",       column = "uid"),
        @Result(property = "name",      column = "name"),
        @Result(property = "createTime",column = "create_time"),
        @Result(property = "password",  column = "password"),
        @Result(property = "orders",
                many = @Many(select ="cn.brady.dao.OrderMapper.getOrdersByUserId"))
    })

    @Select("Select * from user where uid = #{id}")
    User selectUserById(long id);

    @Select("Select * from user")
    List<User> getAll();

    @Insert("insert into user(uid, name, create_time, password) values(#{uid},#{name},#{createTime},#{password})")
    @Results(id="userResults")
    long insertUser(User u);

    @Update("UPDATE user set name=#{name}, password=#{password} WHERE uid=#{uid}")
    @Results(id="userResults")
    int updateByUser(User u);

    @Delete("DELETE FROM user WHERE uid=#{uid}")
    int deleteUserById(long id);


//    @Select("SELECT `order`.oid, `order`.uid,`order`.create_time, `order`.note FROM `order` WHERE `order`.uid = #{uid}")
//    @Results({
//            @Result(property = "oid", column = "oid"),
//            @Result(property = "uid", column = "uid"),
//            @Result(property = "createTime", column = "create_time"),
//            @Result(property = "note", column = "note")
//    })
//    List<Order> getOrdersByUserId(long uid);









}

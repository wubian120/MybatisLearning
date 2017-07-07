package cn.brady.dao;


import cn.brady.pojo.User;

import java.util.List;

/**
 * Created by Brady on 2017/5/3.
 */
public interface UserMapper {

    List<User> getAll();

    User getUserById(String id);

}

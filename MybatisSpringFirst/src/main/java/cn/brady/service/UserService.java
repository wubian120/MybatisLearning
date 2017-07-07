package cn.brady.service;

import cn.brady.pojo.User;

import java.util.List;

/**
 * Created by Brady on 2017/5/3.
 */
public interface UserService {

    List<User> getAll();

    User getUserById(String id);
}

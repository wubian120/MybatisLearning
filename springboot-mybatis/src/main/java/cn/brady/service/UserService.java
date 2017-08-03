package cn.brady.service;

import cn.brady.domain.User;

public interface UserService {


    long insertUser(User user);

    User getUserById(long id);
}

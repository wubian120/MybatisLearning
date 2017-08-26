package cn.brady.service.impl;

import cn.brady.dao.local.UserMapper;
import cn.brady.domain.User;
import cn.brady.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public long insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public User getUserById(long id) {
        return userMapper.getUserById(id);
    }

    @Override
    public User getUserByName(String name) {
        return userMapper.getUserByName(name);
    }
}

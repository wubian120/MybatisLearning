package cn.brady.service;

import cn.brady.dao.UserMapper;
import cn.brady.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Brady on 2017/5/3.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAll() {
        return userMapper.getAll();
    }

    public User getUserById(String id) {
        return userMapper.getUserById(id);
    }


}

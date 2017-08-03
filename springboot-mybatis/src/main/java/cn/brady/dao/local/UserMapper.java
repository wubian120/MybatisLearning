package cn.brady.dao.local;

import cn.brady.domain.User;

import java.util.List;

public interface UserMapper {

    List<User> getAllUsers();

    /**
     * 查
     * @param name
     * @return
     */
    User getUserByName(String name);

    /**
     * 增
     * @param user
     * @return
     */
    long insertUser(User user);

    /**
     * 改
     * @param user
     * @return
     */
    long updateUser(User user);

    /**
     * 删
     * @param name
     * @return
     */
    long deleteUserbyName(String name);


    User getUserById(long id);

}

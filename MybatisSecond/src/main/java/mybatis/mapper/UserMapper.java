package mybatis.mapper;

import mybatis.pojo.User;

import java.util.List;

/**
 * Created by Brady on 2017/5/3.
 */
public interface UserMapper {

    List<User> getAll();

    User getUserById(String id);

    int selectUserCount();

    void insertUserById(User user);

    void deleteUserById(String id);

    void updateUserById(User user);

}

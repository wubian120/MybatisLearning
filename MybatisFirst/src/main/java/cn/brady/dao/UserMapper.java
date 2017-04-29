package cn.brady.dao;

import cn.brady.dao.User;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Brady on 2017/4/28.
 */
public interface UserMapper {
    @Select("Select * from public.user where id = #{id}")
    User selectUserById(String id);
}

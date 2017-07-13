package cn.brady.application;

import cn.brady.dao.User;
import cn.brady.dao.UserMapper;
import cn.brady.util.DBUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Brady on 2017/7/13.
 */
public class MybatisDynamicSQL {

    public static void main(String[] args){

        String configFile = "mybatisConfig.xml";
        SqlSession session = null;

        try {
            session = DBUtil.fetchSqlSession(configFile);

            UserMapper mapper = DBUtil.getMapper(UserMapper.class);

            List<User> users = mapper.getAll();

            for(User user : users){
                System.out.println("User id: " + user.getId());
                System.out.println("user name: " + user.getName());
            }


        }catch (Exception e){
            e.printStackTrace();
        }




    }

}

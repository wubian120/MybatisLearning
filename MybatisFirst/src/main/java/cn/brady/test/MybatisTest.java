package cn.brady.test;

import cn.brady.dao.User;
import cn.brady.dao.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * Created by Brady on 2017/4/28.
 */
public class MybatisTest {

    public static void main(String[] args){
        String resource = "mybatisConfig.xml";

        InputStream is =  MybatisTest.class.getClassLoader().getResourceAsStream(resource);

        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);

        SqlSession session = sessionFactory.openSession();


        UserMapper mapper = session.getMapper(UserMapper.class);
        try{
            User user = mapper.selectUserById("2");
            List<User> users = null;//mapper.getAll();

            users = session.selectList("cn.brady.dao.UserMapper.getAll");

            System.out.println(users.size());

            System.out.println(user.getName() + " age: "+ user.getAge() +" id: " + user.getId());

        }catch (Exception e){
            e.printStackTrace();

        }










    }


}

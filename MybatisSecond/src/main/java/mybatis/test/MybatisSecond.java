package mybatis.test;



import mybatis.mapper.UserMapper;
import mybatis.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * Created by Brady on 2017/5/2.
 */
public class MybatisSecond {

    public static void main(String[] args) {
        String s1 = null;
        String resource = "mybatisConfig.xml";

        InputStream is = MybatisSecond.class.getClassLoader().getResourceAsStream(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sessionFactory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);

        try {
//            List<User> users =session.selectList("mybatis.mapper.UserMapper.getAll");
//            User user = mapper.selectUserById("2");

            int count = mapper.selectUserCount();
            System.out.println("select user count: " + count);

//            List<User> users = mapper.getAll();

            User user = mapper.getUserById("3");
//            System.out.println(users.size());

            System.out.println(user);
//            System.out.println(user.getName() + " age: "+ user.getAge() +" id: " + user.getId());

            User newUser = new User();
            newUser.setId("6");
            newUser.setAge(36);
            newUser.setName("John");

//            mapper.insertUserById(newUser);


            User u1 = mapper.getUserById("6");
            System.out.println(u1);

            User u2 = new User();
            u2.setId("1");
            u2.setName("Charles");
            u2.setAge(50);

            mapper.updateUserById(u2);





            mapper.deleteUserById("4");
            session.commit();


        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}

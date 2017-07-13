package cn.brady.application;

import cn.brady.dao.User;
import cn.brady.dao.UserMapper;
import cn.brady.util.DBUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Brady on 2017/7/13.
 */
public class MybatisCRUD {

    private static final String CONFIG = "mybatisConfig.xml";

    /**
     * example of  mybatis insert()
     *
     * @param config
     */
    public static void createNewUser(String config)throws Exception{

        User user = new User();
        user.setId(0);
        user.setName("name8888");

        Calendar calendar = Calendar.getInstance();
        user.setCreateTime(calendar.getTime());

        user.setPassword("1111111");

        try{
            DBUtil.openSession(config);
            UserMapper mapper = DBUtil.getMapper(UserMapper.class);

            long ll = mapper.insertUser(user);

            System.out.println("ll: " + ll);

            DBUtil.commit();
            DBUtil.closeSession();


        }catch (Exception e){
            e.printStackTrace();
        }


    }

    /**
     * this is the example user;
     *
     * User upUser = new User();
     * upUser.setId(2);
     * upUser.setName("upUser");
     * upUser.setPassword("111111");
     */
    public static void updateUser(User updateUser) throws Exception{

        DBUtil.openSession(MybatisCRUD.CONFIG);
        UserMapper mapper = DBUtil.getMapper(UserMapper.class);

        long index = mapper.updateByUser(updateUser);

        System.out.println("index: " + index);

        DBUtil.commit();
        DBUtil.closeSession();

    }

    public static void deleteUserById(long id) throws Exception{

        DBUtil.openSession(MybatisCRUD.CONFIG);
        UserMapper mapper = DBUtil.getMapper(UserMapper.class);

        long index = mapper.deleteUserById(id);

        System.out.println("index: " + index);

        DBUtil.commit();
        DBUtil.closeSession();
    }




    /**
     * example of update
     * MybatisCRUD.updateUser(upUser);
     *
     * example of insert
     * MybatisCRUD.createNewUser(MybatisCRUD.CONFIG);
     *
     * only effective when uid is not in order table.
     * long deleteId = 5;
     * deleteUserById(deleteId);
     *
     */
    public static void main(String[] args)throws Exception{

        User upUser = new User();
        upUser.setId(2);
        upUser.setName("upUser");
        upUser.setPassword("111111");

        long deleteId = 3;
        deleteUserById(deleteId);






    }

}

package cn.brady.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by Brady on 2017/7/13.
 */
public class DBUtil {

    private static SqlSession session;

    public static void openSession(String config) throws Exception{
        if(session != null){
            session.clearCache();
            session.close();
        }
        if(config == null || config.isEmpty()){
            System.out.println("config file is null or empty.");

        }
        InputStream is = DBUtil.class.getClassLoader().getResourceAsStream(config);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);

        session = sessionFactory.openSession();

    }

    public static SqlSession fetchSqlSession(String config)throws Exception{

        if(config == null || config.isEmpty()){
            System.out.println("config file is null or empty.");
            return null;
        }


        InputStream is = DBUtil.class.getClassLoader().getResourceAsStream(config);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);

        session = sessionFactory.openSession();

        return session;

    }

    public static <T> T getMapper(Class<T> c) throws InstantiationException, IllegalAccessException{
        T t = session.getMapper(c);
        return t;
    }


    public static void closeSession()throws Exception{
        System.out.println("close session...");
        if(session != null){
            session.close();
        }else {

            System.out.println("session has already null.");
        }
    }

    public static void commit()throws Exception{
        System.out.println("session commit...");
        if(session != null){
            session.commit();
        }else {
            System.out.println("session has already null.");
        }

    }




}

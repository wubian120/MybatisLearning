package cn.brady.test;

import java.sql.*;

/**
 * Created by wubian on 2017/7/8.
 */
public class ConnectionTest {

    public static final String url ="jdbc:mysql://localhost:3306/mysqldemo";
    public static final String driver ="com.mysql.jdbc.Driver";
    public static final String username ="root";
    public static final String password ="111111";

    public static void connect(String sql){

        if(sql == null || sql.isEmpty()){

        }
        Connection        conn = null;
        PreparedStatement ps = null;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url,username, password);
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()){

                String id = rs.getString(1);
                String name = rs.getString(2);
                System.out.println("id: "+id+" name :"+name);
            }

            rs.close();
            conn.close();



        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        String sql ="select * from user";
        ConnectionTest.connect(sql);

    }

}

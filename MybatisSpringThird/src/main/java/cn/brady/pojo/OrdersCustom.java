package cn.brady.pojo;

import java.util.Date;

/**
 * Created by wubian on 2017/7/8.
 */
public class OrdersCustom  extends Order{

    /*
     User properties
     User.name; User.uCreateTime; User.password
     */
    private String name;
    private Date   createTime;
    private String password;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public Date getCreateTime() {return createTime;}
    public void setCreateTime(Date createTime) {this.createTime = createTime;}

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
}

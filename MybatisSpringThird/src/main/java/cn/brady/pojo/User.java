package cn.brady.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Brady on 2017/7/6.
 */
public class User implements Serializable{

    private long uid;
    private String name;
    private Date createTime;
    private String password;

    private List<Order> orders;

    public long getUid() {
        return uid;
    }
    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public List<Order> getOrders() {return orders;}
    public void setOrders(List<Order> orders) {this.orders = orders;}
}

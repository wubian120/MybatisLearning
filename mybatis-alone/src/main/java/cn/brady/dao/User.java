package cn.brady.dao;




import java.util.Date;
import java.util.List;

/**
 * Created by Brady on 2017/4/27.
 */
public class User {

    private long    uid;
    private String name;
    private Date  createTime;
    private String password;

    private List<Order> orders;

    public long getId() {
        return uid;
    }
    public void setId(long id) {
        this.uid = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setCreateTime(Date create_time) {this.createTime = create_time;}
    public Date getCreateTime() {return createTime;}

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }


    @Override
    public String toString() {
        return "id: " + uid + " username: " + name ;
    }
}

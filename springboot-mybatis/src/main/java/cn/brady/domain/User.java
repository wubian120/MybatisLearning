package cn.brady.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Brady on 2017/7/6.
 */
public class User implements Serializable{

    private long uid;
    private String name;
    @JsonFormat(timezone = "GMT8",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    private String password;
    private String mobile;
    @JsonFormat(timezone = "GMT8",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatedTime;

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

    public String getMobile() { return mobile; }
    public void setMobile(String mobile) { this.mobile = mobile; }

    public Date getUpdatedTime() { return updatedTime; }
    public void setUpdatedTime(Date updatedTime) { this.updatedTime = updatedTime; }
}

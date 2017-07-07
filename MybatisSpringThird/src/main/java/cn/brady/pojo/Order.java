package cn.brady.pojo;

import java.util.Date;

/**
 * Created by Brady on 2017/7/6.
 */
public class Order {

    private long oid;
    private long uid;
    private Date createTime;
    private String note;

    public long getOid() {return oid;}
    public void setOid(long oid) {this.oid = oid;}

    public long getUid() {return uid;}
    public void setUid(long uid) {this.uid = uid;}

    public void setCreateTime(Date createTime) {this.createTime = createTime;}
    public Date getCreateTime() {return createTime;}

    public String getNote() {return note;}
    public void setNote(String note) {this.note = note;}
}

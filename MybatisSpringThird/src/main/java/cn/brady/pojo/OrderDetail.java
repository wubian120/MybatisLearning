package cn.brady.pojo;

/**
 * Created by Brady on 2017/7/6.
 */
public class OrderDetail {
    private long detailId;
    private long orderId;
    private long itemId;
    private int num;

    public void setDetailId(long detailId) {this.detailId = detailId;}
    public long getDetailId() {return detailId;}

    public long getOrderId() {return orderId;}
    public void setOrderId(long orderId) {this.orderId = orderId;}

    public long getItemId() {return itemId;}
    public void setItemId(long itemId) {this.itemId = itemId;}

    public int getNum() {return num;}
    public void setNum(int num) {this.num = num;}
}

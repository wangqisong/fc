package com.wqs.example.pojo;

import java.util.Date;

public class TOrder {
    private Integer id;
    private String orderNum;//订单编号
    private Integer ownerId;//下单人id
    private Integer orderStatus;//订单状态
    private Integer payStatus;//支付状态
    private String address;//收货地址
    private Date createDate;//创建时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //支付状态
    enum PayStatus{
        yesPay , //已支付
        noPay   //未支付

    }

    //订单状态
    enum OrderStatus{
        running,    //进行中
        finish      //已完成
    }


}

package com.hidialect.hidialect_ws.entity;

import java.util.Date;

public class Users {
    private Integer userNo;
    private String userNa;
    private String password;
    private String userImg;
    private String phone;
    private String QQNum;
    private String WeChatNum;
    private Byte sex;
    private Integer attentionNum;
    private Integer fansNum;
    private Integer money;
    private Date createTime;

    public Integer getUserNo() {
        return userNo;
    }

    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    public String getUserNa() {
        return userNa;
    }

    public void setUserNa(String userNa) {
        this.userNa = userNa;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQQNum() {
        return QQNum;
    }

    public void setQQNum(String QQNum) {
        this.QQNum = QQNum;
    }

    public String getWeChatNum() {
        return WeChatNum;
    }

    public void setWeChatNum(String weChatNum) {
        WeChatNum = weChatNum;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Integer getAttentionNum() {
        return attentionNum;
    }

    public void setAttentionNum(Integer attentionNum) {
        this.attentionNum = attentionNum;
    }

    public Integer getFansNum() {
        return fansNum;
    }

    public void setFansNum(Integer fansNum) {
        this.fansNum = fansNum;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

package com.hidialect.hidialect_ws.entity;

import java.util.Date;

public class UserLabel {
    private Integer id;
    private Integer vdoNo;
    private Integer userNo;
    private Byte isLke;
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVdoNo() {
        return vdoNo;
    }

    public void setVdoNo(Integer vdoNo) {
        this.vdoNo = vdoNo;
    }

    public Integer getUserNo() {
        return userNo;
    }

    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    public Byte getIsLke() {
        return isLke;
    }

    public void setIsLke(Byte isLke) {
        this.isLke = isLke;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

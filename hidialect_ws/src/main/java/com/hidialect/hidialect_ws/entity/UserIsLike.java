package com.hidialect.hidialect_ws.entity;

import java.util.Date;

public class UserIsLike {
    private Integer id;
    private Integer vdoId;
    private Integer userNo;
    private Byte isLke;
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVdoId() {
        return vdoId;
    }

    public void setVdoId(Integer vdoId) {
        this.vdoId = vdoId;
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

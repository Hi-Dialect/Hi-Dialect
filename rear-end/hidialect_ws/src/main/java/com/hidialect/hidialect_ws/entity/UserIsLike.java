package com.hidialect.hidialect_ws.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

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

    @JsonProperty(value = "id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVdoId() {
        return vdoId;
    }

    @JsonProperty(value = "vdoId")
    public void setVdoId(Integer vdoId) {
        this.vdoId = vdoId;
    }

    public Integer getUserNo() {
        return userNo;
    }

    @JsonProperty(value = "userNo")
    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    public Byte getIsLke() {
        return isLke;
    }

    @JsonProperty(value = "isLike")
    public void setIsLke(Byte isLke) {
        this.isLke = isLke;
    }

    public Date getCreateTime() {
        return createTime;
    }

    @JsonProperty(value = "createTime")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

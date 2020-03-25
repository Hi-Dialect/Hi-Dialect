package com.hidialect.hidialect_ws.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Comments {
    private Integer cmtId;
    private Integer vdoId;
    private Integer userNo;
    private String userNa;
    private String userImg;
    private String content;
    private Date createTime;

    public Integer getCmtId() {
        return cmtId;
    }

    @JsonProperty(value = "cmtId")
    public void setCmtId(Integer cmtId) {
        this.cmtId = cmtId;
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

    public String getUserNa() {
        return userNa;
    }

    @JsonProperty(value = "userNa")
    public void setUserNa(String userNa) {
        this.userNa = userNa;
    }

    public String getUserImg() {
        return userImg;
    }

    @JsonProperty(value = "userImg")
    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getContent() {
        return content;
    }

    @JsonProperty(value = "content")
    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    @JsonProperty(value = "createTime")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

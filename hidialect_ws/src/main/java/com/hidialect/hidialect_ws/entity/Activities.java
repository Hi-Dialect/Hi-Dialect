package com.hidialect.hidialect_ws.entity;

import java.util.Date;

public class Activities {
    private Integer actId;
    private String actNa;
    private String actRemark;
    private Date startTime;
    private Date endTime;
    private Byte actType;
    private Integer joinNum;
    private Date createTime;

    public Integer getActId() {
        return actId;
    }

    public void setActId(Integer actId) {
        this.actId = actId;
    }

    public String getActNa() {
        return actNa;
    }

    public void setActNa(String actNa) {
        this.actNa = actNa;
    }

    public String getActRemark() {
        return actRemark;
    }

    public void setActRemark(String actRemark) {
        this.actRemark = actRemark;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Byte getActType() {
        return actType;
    }

    public void setActType(Byte actType) {
        this.actType = actType;
    }

    public Integer getJoinNum() {
        return joinNum;
    }

    public void setJoinNum(Integer joinNum) {
        this.joinNum = joinNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

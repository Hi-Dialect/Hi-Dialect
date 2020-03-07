package com.hidialect.hidialect_ws.entity;

import java.util.Date;

public class UserAttention {
    private Integer id;
    private Integer fanNo;
    private Integer starNo;
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFanNo() {
        return fanNo;
    }

    public void setFanNo(Integer fanNo) {
        this.fanNo = fanNo;
    }

    public Integer getStarNo() {
        return starNo;
    }

    public void setStarNo(Integer starNo) {
        this.starNo = starNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

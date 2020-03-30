package com.hidialect.hidialect_ws.entity;

import java.util.Date;

public class Labels {
    private Integer labelId;
    private String labelNa;
    private Date createTime;

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    public String getLabelNa() {
        return labelNa;
    }

    public void setLabelNa(String labelNa) {
        this.labelNa = labelNa;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

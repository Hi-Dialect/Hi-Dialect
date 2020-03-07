package com.hidialect.hidialect_ws.entity;

import java.util.Date;

public class VideoLabel {
    private Integer id;
    private Integer vdoId;
    private Integer labeiId;
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

    public Integer getLabeiId() {
        return labeiId;
    }

    public void setLabeiId(Integer labeiId) {
        this.labeiId = labeiId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

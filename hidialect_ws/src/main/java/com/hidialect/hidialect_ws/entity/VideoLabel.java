package com.hidialect.hidialect_ws.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class VideoLabel {
    private Integer id;
    private Integer vdoId;
    private Integer labeiId;
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

    public Integer getLabeiId() {
        return labeiId;
    }

    @JsonProperty(value = "labelId")
    public void setLabeiId(Integer labeiId) {
        this.labeiId = labeiId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    @JsonProperty(value = "createTime")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

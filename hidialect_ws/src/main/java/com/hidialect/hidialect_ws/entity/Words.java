package com.hidialect.hidialect_ws.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Time;
import java.util.Date;

public class Words {
    private Integer wdId;
    private Integer vdoId;
    private Time startTime;
    private Time endTime;
    private String word;
    private Date createTime;

    public Integer getWdId() {
        return wdId;
    }

    @JsonProperty(value = "wdId")
    public void setWdId(Integer wdId) {
        this.wdId = wdId;
    }

    public Integer getVdoId() {
        return vdoId;
    }

    @JsonProperty(value = "vdoId")
    public void setVdoId(Integer vdoId) {
        this.vdoId = vdoId;
    }

    public Time getStartTime() {
        return startTime;
    }

    @JsonProperty(value = "startTime")
    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    @JsonProperty(value = "endTime")
    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public String getWord() {
        return word;
    }

    @JsonProperty(value = "word")
    public void setWord(String word) {
        this.word = word;
    }

    public Date getCreateTime() {
        return createTime;
    }

    @JsonProperty(value = "createTime")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

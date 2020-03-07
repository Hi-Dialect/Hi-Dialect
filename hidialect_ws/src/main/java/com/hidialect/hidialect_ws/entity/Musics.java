package com.hidialect.hidialect_ws.entity;

import java.util.Date;

public class Musics {
    private Integer mscId;
    private String mscNa;
    private String mscPath;
    private Byte standardType;
    private Integer vdoId;
    private Byte bgmType;
    private Byte mscType;
    private Date createTime;

    public Integer getMscId() {
        return mscId;
    }

    public void setMscId(Integer mscId) {
        this.mscId = mscId;
    }

    public String getMscNa() {
        return mscNa;
    }

    public void setMscNa(String mscNa) {
        this.mscNa = mscNa;
    }

    public String getMscPath() {
        return mscPath;
    }

    public void setMscPath(String mscPath) {
        this.mscPath = mscPath;
    }

    public Byte getStandardType() {
        return standardType;
    }

    public void setStandardType(Byte standardType) {
        this.standardType = standardType;
    }

    public Integer getVdoId() {
        return vdoId;
    }

    public void setVdoId(Integer vdoId) {
        this.vdoId = vdoId;
    }

    public Byte getBgmType() {
        return bgmType;
    }

    public void setBgmType(Byte bgmType) {
        this.bgmType = bgmType;
    }

    public Byte getMscType() {
        return mscType;
    }

    public void setMscType(Byte mscType) {
        this.mscType = mscType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

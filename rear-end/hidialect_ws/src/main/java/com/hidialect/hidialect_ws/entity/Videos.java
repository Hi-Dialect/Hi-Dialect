package com.hidialect.hidialect_ws.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Videos {
    private Integer vdoId;
    private String vdoNa;
    private Integer userNo;
    private String vdoPath;
    private String vdoImg;
    private Byte vdoType;
    private String vdoRemark;
    private Integer likeNum;
    private Integer dislikeNum;
    private Integer commentNum;
    private Integer watchNum;
    private Byte isPublic;
    private Date createTime;
    private String userNa;
    private String userImg;
    private Labels[] videoLabels;

    public Integer getVdoId() {
        return vdoId;
    }

    @JsonProperty(value = "vdoId")
    public void setVdoId(Integer vdoId) {
        this.vdoId = vdoId;
    }

    public String getVdoNa() {
        return vdoNa;
    }

    @JsonProperty(value = "vdoNa")
    public void setVdoNa(String vdoNa) {
        this.vdoNa = vdoNa;
    }

    public Integer getUserNo() {
        return userNo;
    }

    @JsonProperty(value = "userNo")
    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    public String getVdoPath() { return vdoPath; }

    @JsonProperty(value = "vdoPath")
    public void setVdoPath(String vdoPath) {
        this.vdoPath = vdoPath;
    }

    public String getVdoImg() {
        return vdoImg;
    }

    @JsonProperty(value = "vdoImg")
    public void setVdoImg(String vdoImg) {
        this.vdoImg = vdoImg;
    }

    public Byte getVdoType() {
        return vdoType;
    }

    @JsonProperty(value = "vdoType")
    public void setVdoType(Byte vdoType) {
        this.vdoType = vdoType;
    }

    public String getVdoRemark() {
        return vdoRemark;
    }

    @JsonProperty(value = "vdoRemark")
    public void setVdoRemark(String vdoRemark) {
        this.vdoRemark = vdoRemark;
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    @JsonProperty(value = "likeNum")
    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public Integer getDislikeNum() {
        return dislikeNum;
    }

    @JsonProperty(value = "dislikeNum")
    public void setDislikeNum(Integer dislikeNum) {
        this.dislikeNum = dislikeNum;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    @JsonProperty(value = "commentNum")
    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public Integer getWatchNum() {
        return watchNum;
    }

    @JsonProperty(value = "watchNum")
    public void setWatchNum(Integer watchNum) {
        this.watchNum = watchNum;
    }

    public Byte getIsPublic() {
        return isPublic;
    }

    @JsonProperty(value = "isPublic")
    public void setIsPublic(Byte isPublic) {
        this.isPublic = isPublic;
    }

    public Date getCreateTime() {
        return createTime;
    }

    @JsonProperty(value = "createTime")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserNa() { return userNa; }

    @JsonProperty(value = "userNa")
    public void setUserNa(String userNa) {
        this.userNa = userNa;
    }

    public String getUserImg() { return userImg; }

    @JsonProperty(value = "userImg")
    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public Labels[] getVideoLabels() { return videoLabels; }

    @JsonProperty(value = "videoLabels")
    public void setVideoLabels(Labels[] videoLabels) {
        this.videoLabels = videoLabels;
    }
}

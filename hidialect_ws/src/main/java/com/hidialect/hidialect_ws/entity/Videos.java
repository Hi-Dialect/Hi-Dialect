package com.hidialect.hidialect_ws.entity;

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

    public void setVdoId(Integer vdoId) {
        this.vdoId = vdoId;
    }

    public String getVdoNa() {
        return vdoNa;
    }

    public void setVdoNa(String vdoNa) {
        this.vdoNa = vdoNa;
    }

    public Integer getUserNo() {
        return userNo;
    }

    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    public String getVdoPath() {
        return vdoPath;
    }

    public void setVdoPath(String vdoPath) {
        this.vdoPath = vdoPath;
    }

    public String getVdoImg() {
        return vdoImg;
    }

    public void setVdoImg(String vdoImg) {
        this.vdoImg = vdoImg;
    }

    public Byte getVdoType() {
        return vdoType;
    }

    public void setVdoType(Byte vdoType) {
        this.vdoType = vdoType;
    }

    public String getVdoRemark() {
        return vdoRemark;
    }

    public void setVdoRemark(String vdoRemark) {
        this.vdoRemark = vdoRemark;
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public Integer getDislikeNum() {
        return dislikeNum;
    }

    public void setDislikeNum(Integer dislikeNum) {
        this.dislikeNum = dislikeNum;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public Integer getWatchNum() {
        return watchNum;
    }

    public void setWatchNum(Integer watchNum) {
        this.watchNum = watchNum;
    }

    public Byte getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Byte isPublic) {
        this.isPublic = isPublic;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserNa() { return userNa; }

    public void setUserNa(String userNa) {
        this.userNa = userNa;
    }

    public String getUserImg() { return userImg; }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public Labels[] getVideoLabels() { return videoLabels; }

    public void setVideoLabels(Labels[] videoLabels) {
        this.videoLabels = videoLabels;
    }
}

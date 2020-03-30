package com.hidialect.hidialect_ws.dao;

import com.hidialect.hidialect_ws.entity.UserAttention;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserAttentionDao {
    void addAttention(UserAttention userAttention);
    void cancelAtten(UserAttention userAttention);
    List<UserAttention> getUserAttentions(@Param("fanNo")Integer fanNo);
    List<UserAttention> getUserFans(@Param("starNo")Integer starNo);
}

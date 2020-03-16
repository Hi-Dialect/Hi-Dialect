package com.hidialect.hidialect_ws.dao;

import com.hidialect.hidialect_ws.entity.Videos;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IVideosDao {
    Videos[] getMadeByUserNo(@Param("userNo") Number userNo);
}

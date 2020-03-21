package com.hidialect.hidialect_ws.dao;

import com.hidialect.hidialect_ws.entity.Videos;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IVideosDao {
    Videos[] getWordsByVdoId(@Param("userNo") Number userNo);
}

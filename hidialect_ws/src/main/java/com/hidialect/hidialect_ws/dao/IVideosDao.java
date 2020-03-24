package com.hidialect.hidialect_ws.dao;

import com.hidialect.hidialect_ws.entity.Videos;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IVideosDao {
    Videos[] getLikeVdoByUserNo(@Param("userNo") int userNo);
    Videos[] getMadeByUserNo(@Param("userNo") int userNo);
    Videos[] search(@Param("searchWords") String searchWords, @Param("vdoType") String vdoType);
    Videos[] viewVdoByActId(@Param("actId") int actId);
    void deleteVdo(@Param("vdoId") int vdoId);
}

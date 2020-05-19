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
    Videos[] getPartVideos(@Param("userNo") int userNo);
    void addVdo(Videos video);
    void deleteVdo(@Param("vdoId") int vdoId);
    void commentNumSub1(@Param("vdoId") int vdoId);
    void commentNumAdd1(@Param("vdoId") int vdoId);
    void likeNumAdd1(@Param("vdoId") int vdoId);
    void dislikeNumAdd1(@Param("vdoId") int vdoId);
    void likeNumSub1(@Param("vdoId") int vdoId);
    void dislikeNumSub1(@Param("vdoId") int vdoId);
    Videos getByVdoID(@Param("vdoId")Integer vdoId);
}

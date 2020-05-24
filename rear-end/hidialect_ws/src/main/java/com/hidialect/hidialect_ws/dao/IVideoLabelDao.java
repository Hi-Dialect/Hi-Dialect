package com.hidialect.hidialect_ws.dao;

import com.hidialect.hidialect_ws.entity.Labels;
import com.hidialect.hidialect_ws.entity.VideoLabel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IVideoLabelDao {
    void deleteVideoLabel(VideoLabel vdoLabel);
    void addVideoLabel(@Param("vdoId")int vdoId, @Param("labelId")int labelId);
    VideoLabel[] searchVideoLabel(@Param("vdoId")int vdoId, @Param("labelId")int labelId);
    VideoLabel[] viewVdoBylabel(@Param("labelId")int labelId);
}

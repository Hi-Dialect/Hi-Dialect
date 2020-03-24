package com.hidialect.hidialect_ws.dao;

import com.hidialect.hidialect_ws.entity.Labels;
import com.hidialect.hidialect_ws.entity.VideoLabel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IVideoLabelDao {
    Labels[] getLabelsByVdoId(@Param("VdoId")int vdoId);
    void deleteVideoLabel(VideoLabel vdoLabel);
    void addVideoLabel(@Param("VdoId")int vdoId, @Param("VdoId")int labelId);
    Labels[] searchVideoLabel(@Param("VdoId")int vdoId, @Param("VdoId")int labelId);
}

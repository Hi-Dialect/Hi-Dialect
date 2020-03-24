package com.hidialect.hidialect_ws.dao;

import com.hidialect.hidialect_ws.entity.Labels;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ILabelsDao {
    Labels[] getLabelsByVdoId(@Param("vdoId")int vdoId);
}

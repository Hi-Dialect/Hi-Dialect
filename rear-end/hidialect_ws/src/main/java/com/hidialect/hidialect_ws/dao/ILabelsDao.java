package com.hidialect.hidialect_ws.dao;

import com.hidialect.hidialect_ws.entity.Labels;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ILabelsDao {
    void addLabel(Labels labels);
    List<Labels> getAllLabels();
    Labels[] getLabelsByVdoId(@Param("vdoId")int vdoId);
    Labels getByLabelId(@Param("labelId")Integer labelId);
}

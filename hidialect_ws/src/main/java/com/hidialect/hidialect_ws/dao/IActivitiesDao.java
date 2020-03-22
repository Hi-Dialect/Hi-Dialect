package com.hidialect.hidialect_ws.dao;

import com.hidialect.hidialect_ws.entity.Activities;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IActivitiesDao {
    Activities[] checkAct(@Param("userNo")int userNo);
    Activities[] getActByTypeTime(@Param("ActType")String ActType, @Param("startTime")String startTime);
    Activities[] getActivities();
    Activities getActivitymsgByActId(@Param("catId")int actId);
    Activities getActNaByVdoId(@Param("vdoId")int vdoId);
}

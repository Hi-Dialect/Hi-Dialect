package com.hidialect.hidialect_ws.dao;

import com.hidialect.hidialect_ws.entity.Activities;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface IActivitiesDao {
    Activities[] checkAct(@Param("userNo")int userNo);
    Activities[] getActByTypeTime(@Param("ActType")Byte ActType, @Param("startTime") Date startTime);
    Activities[] getActivities();
    Activities getActivitymsgByActId(@Param("actId")int actId);
    Activities getActNaByVdoId(@Param("vdoId")int vdoId);
}

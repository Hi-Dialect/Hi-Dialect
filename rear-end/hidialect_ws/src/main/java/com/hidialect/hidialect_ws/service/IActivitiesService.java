package com.hidialect.hidialect_ws.service;

import com.hidialect.hidialect_ws.entity.Activities;

import java.util.Date;

public interface IActivitiesService {
    Activities[] checkAct(int userNo);
    Activities[] getActByTypeTime(Byte ActType, Date startTime);
    Activities[] getActivities();
    Activities getActivitymsgByActId(int actId);
    Activities getActNaByVdoId(int vdoId);
}

package com.hidialect.hidialect_ws.service;

import com.hidialect.hidialect_ws.entity.Activities;

public interface IActivitiesService {
    Activities[] checkAct(int userNo);
    Activities[] getActByTypeTime(String ActType, String startTime);
    Activities[] getActivities();
    Activities getActivitymsgByActId(int actId);
    Activities getActNaByVdoId(int vdoId);
}

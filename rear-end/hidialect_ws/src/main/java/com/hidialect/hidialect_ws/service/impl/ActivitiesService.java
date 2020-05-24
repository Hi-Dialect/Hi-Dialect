package com.hidialect.hidialect_ws.service.impl;

import com.hidialect.hidialect_ws.dao.IActivitiesDao;
import com.hidialect.hidialect_ws.entity.Activities;
import com.hidialect.hidialect_ws.service.IActivitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ActivitiesService implements IActivitiesService {
    @Autowired
    private IActivitiesDao iActivitiesDao;

    @Override
    public Activities[] checkAct(int userNo) {
        return iActivitiesDao.checkAct(userNo);
    }

    @Override
    public Activities[] getActByTypeTime(Byte ActType, Date startTime) {
        return iActivitiesDao.getActByTypeTime(ActType, startTime);
    }

    @Override
    public Activities[] getActivities() {
        return iActivitiesDao.getActivities();
    }

    @Override
    public Activities getActivitymsgByActId(int actId) {
        return iActivitiesDao.getActivitymsgByActId(actId);
    }

    @Override
    public Activities getActNaByVdoId(int vdoId) {
        return iActivitiesDao.getActNaByVdoId(vdoId);
    }

}

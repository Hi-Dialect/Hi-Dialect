package com.hidialect.hidialect_ws.service.impl;

import com.hidialect.hidialect_ws.dao.IActivitiesDao;
import com.hidialect.hidialect_ws.service.IActivitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivitiesService implements IActivitiesService {
    @Autowired
    private IActivitiesDao iActivitiesDao;
}

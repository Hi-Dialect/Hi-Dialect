package com.hidialect.hidialect_ws.service.impl;

import com.hidialect.hidialect_ws.dao.IVideoActivityDao;
import com.hidialect.hidialect_ws.service.IVideoActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoActivityService implements IVideoActivityService {
    @Autowired
    private IVideoActivityDao iVideoActivityDao;
}

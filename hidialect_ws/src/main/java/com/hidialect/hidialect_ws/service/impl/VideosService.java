package com.hidialect.hidialect_ws.service.impl;

import com.hidialect.hidialect_ws.dao.IVideosDao;
import com.hidialect.hidialect_ws.entity.Videos;
import com.hidialect.hidialect_ws.service.IVideosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideosService implements IVideosService {
    @Autowired
    private IVideosDao iVideosDao;

    @Override
    public Videos[] getMadeByUserNo(Number userNo){
        return iVideosDao.getMadeByUserNo(userNo);
    }
}

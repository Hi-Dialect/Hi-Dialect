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
    public Videos[] getLikeVdoByUserNo(int userNo){
        return iVideosDao.getLikeVdoByUserNo(userNo);
    }

    @Override
    public Videos[] getMadeByUserNo(int userNo){
        return iVideosDao.getMadeByUserNo(userNo);
    }

    @Override
    public Videos[] search(String searchWords, String vdoType){
        return iVideosDao.search(searchWords, vdoType);
    }

    @Override
    public Videos[] viewVdoByActId(int actId){
        return iVideosDao.viewVdoByActId(actId);
    }
}

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
        searchWords = '%'+searchWords+'%';
        return iVideosDao.search(searchWords, vdoType);
    }

    @Override
    public Videos[] viewVdoByActId(int actId){
        return iVideosDao.viewVdoByActId(actId);
    }

    @Override
    public void deleteVdo(int vdoId) { iVideosDao.deleteVdo(vdoId); }

    @Override
    public void commentNumSub1(int vdoId) { iVideosDao.commentNumSub1(vdoId); }

    @Override
    public void commentNumAdd1(int vdoId) { iVideosDao.commentNumAdd1(vdoId); }

    @Override
    public void likeNumAdd1(int vdoId) { iVideosDao.likeNumAdd1(vdoId); }

    @Override
    public void dislikeNumAdd1(int vdoId) { iVideosDao.dislikeNumAdd1(vdoId); }

}

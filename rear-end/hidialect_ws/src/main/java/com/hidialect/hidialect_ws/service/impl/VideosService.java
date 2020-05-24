package com.hidialect.hidialect_ws.service.impl;

import com.hidialect.hidialect_ws.dao.IVideoLabelDao;
import com.hidialect.hidialect_ws.dao.IVideosDao;
import com.hidialect.hidialect_ws.entity.Labels;
import com.hidialect.hidialect_ws.entity.Videos;
import com.hidialect.hidialect_ws.service.IVideosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideosService implements IVideosService {
    @Autowired
    private IVideosDao iVideosDao;
    private IVideoLabelDao iVideoLabelDao;

    @Override
    public Videos[] getLikeVdoByUserNo(int userNo){
        return iVideosDao.getLikeVdoByUserNo(userNo);
    }

    @Override
    public Videos[] getMadeByUserNo(int userNo){
        return iVideosDao.getMadeByUserNo(userNo);
    }

    @Override
    public Videos[] search(String searchWords, Byte vdoType){
        searchWords = '%'+searchWords+'%';
        return iVideosDao.search(searchWords, vdoType);
    }

    @Override
    public Videos[] viewVdoByActId(int actId){ return iVideosDao.viewVdoByActId(actId); }

    @Override
    public Videos[] getPartVideos(int userNo){
        return iVideosDao.getPartVideos(userNo);
    }

    @Override
    public void addVdo(Videos video) {
        video.setLikeNum(0);
        video.setDislikeNum(0);
        video.setCommentNum(0);
        iVideosDao.addVdo(video);
        int vdoId = video.getVdoId();
        for(Labels label: video.getVideoLabels()) {
            iVideoLabelDao.addVideoLabel(vdoId, label.getLabelId());
        }
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

    @Override
    public void likeNumSub1(int vdoId) { iVideosDao.likeNumSub1(vdoId); }

    @Override
    public void dislikeNumSub1(int vdoId) { iVideosDao.dislikeNumSub1(vdoId); }

    @Override
    public Videos getByVdoID(Integer vdoId) {
        return iVideosDao.getByVdoID(vdoId);
    }

}

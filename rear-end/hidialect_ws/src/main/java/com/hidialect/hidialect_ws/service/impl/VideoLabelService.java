package com.hidialect.hidialect_ws.service.impl;

import com.hidialect.hidialect_ws.dao.ILabelsDao;
import com.hidialect.hidialect_ws.dao.IVideoLabelDao;
import com.hidialect.hidialect_ws.entity.Labels;
import com.hidialect.hidialect_ws.entity.VideoLabel;
import com.hidialect.hidialect_ws.service.IVideoLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoLabelService implements IVideoLabelService {
    @Autowired
    private IVideoLabelDao iVideoLabelDao;
    @Autowired
    private ILabelsDao iLabelsDao;

    @Override
    public Labels[] getLabelsByVdoId(int vdoId) {
        return iLabelsDao.getLabelsByVdoId(vdoId);
    }

    @Override
    public VideoLabel[] viewVdoBylabel(int labelId) {
        return iVideoLabelDao.viewVdoBylabel(labelId);
    }

    @Override
    public void deleteVideoLabel(VideoLabel videoLabel) {
        iVideoLabelDao.deleteVideoLabel(videoLabel);
    }

    @Override
    public void addVideoLabel(int vdoId, int labelId) {
        if(iVideoLabelDao.searchVideoLabel(vdoId, labelId).length==0) {
            iVideoLabelDao.addVideoLabel(vdoId, labelId);
        }
    }

}

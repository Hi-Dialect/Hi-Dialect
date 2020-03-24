package com.hidialect.hidialect_ws.service.impl;

import com.hidialect.hidialect_ws.dao.IVideoLabelDao;
import com.hidialect.hidialect_ws.entity.Labels;
import com.hidialect.hidialect_ws.service.IVideoLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoLabelService implements IVideoLabelService {
    @Autowired
    private IVideoLabelDao iVideoLabelDao;

    @Override
    public Labels[] getLabelsByVdoId(int vdoId) {
        return iVideoLabelDao.getLabelsByVdoId(vdoId);
    }
}

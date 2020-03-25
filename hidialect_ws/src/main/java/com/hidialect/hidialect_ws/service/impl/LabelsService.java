package com.hidialect.hidialect_ws.service.impl;

import com.hidialect.hidialect_ws.dao.ILabelsDao;
import com.hidialect.hidialect_ws.entity.Labels;
import com.hidialect.hidialect_ws.service.ILabelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelsService implements ILabelsService {
    @Autowired
    private ILabelsDao iLabelsDao;

    @Override
    public void addLabel(Labels labels) {
        iLabelsDao.addLabel(labels);
    }

    @Override
    public List<Labels> getAllLabels() {
        return iLabelsDao.getAllLabels();
    }

    @Override
    public Labels getByLabelId(Integer labelId) {
        return iLabelsDao.getByLabelId(labelId);
    }
}

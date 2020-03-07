package com.hidialect.hidialect_ws.service.impl;

import com.hidialect.hidialect_ws.dao.ILabelsDao;
import com.hidialect.hidialect_ws.service.ILabelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LabelsService implements ILabelsService {
    @Autowired
    private ILabelsDao iLabelsDao;
}

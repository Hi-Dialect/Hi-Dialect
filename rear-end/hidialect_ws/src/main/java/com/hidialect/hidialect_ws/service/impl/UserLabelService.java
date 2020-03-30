package com.hidialect.hidialect_ws.service.impl;

import com.hidialect.hidialect_ws.dao.IUserLabelDao;
import com.hidialect.hidialect_ws.entity.UserLabel;
import com.hidialect.hidialect_ws.service.IUserLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLabelService implements IUserLabelService {
    @Autowired
    private IUserLabelDao iUserLabelDao;

    @Override
    public void addUserLabel(UserLabel userLabel) {
        iUserLabelDao.addUserLabel(userLabel);
    }
}

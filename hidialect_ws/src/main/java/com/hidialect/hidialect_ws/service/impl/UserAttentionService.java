package com.hidialect.hidialect_ws.service.impl;

import com.hidialect.hidialect_ws.dao.IUserAttentionDao;
import com.hidialect.hidialect_ws.service.IUserAttentionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAttentionService implements IUserAttentionService {
    @Autowired
    private IUserAttentionDao iUserAttentionDao;
}

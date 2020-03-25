package com.hidialect.hidialect_ws.service.impl;

import com.hidialect.hidialect_ws.dao.IUserAttentionDao;
import com.hidialect.hidialect_ws.entity.UserAttention;
import com.hidialect.hidialect_ws.service.IUserAttentionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAttentionService implements IUserAttentionService {
    @Autowired
    private IUserAttentionDao iUserAttentionDao;

    @Override
    public void addAttention(UserAttention userAttention) {
        iUserAttentionDao.addAttention(userAttention);
    }

    @Override
    public void cancelAtten(UserAttention userAttention) {
        iUserAttentionDao.cancelAtten(userAttention);
    }

    @Override
    public List<UserAttention> getUserAttentions(Integer fanNo) {
        return iUserAttentionDao.getUserAttentions(fanNo);
    }

    @Override
    public List<UserAttention> getUserFans(Integer starNo) {
        return iUserAttentionDao.getUserFans(starNo);
    }
}

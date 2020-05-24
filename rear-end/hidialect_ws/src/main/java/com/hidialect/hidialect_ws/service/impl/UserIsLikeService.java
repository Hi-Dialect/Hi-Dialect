package com.hidialect.hidialect_ws.service.impl;

import com.hidialect.hidialect_ws.dao.IUserIsLikeDao;
import com.hidialect.hidialect_ws.entity.UserIsLike;
import com.hidialect.hidialect_ws.service.IUserIsLikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserIsLikeService implements IUserIsLikeService {
    @Autowired
    private IUserIsLikeDao iUserIsLikeDao;

    @Override
    public void addLike(UserIsLike userIsLike) { iUserIsLikeDao.addLike(userIsLike); }

    @Override
    public void deleteLike(UserIsLike userIsLike) { iUserIsLikeDao.deleteLike(userIsLike); }

    @Override
    public Integer getIsLike(UserIsLike userIsLike) { return iUserIsLikeDao.getIsLike(userIsLike)==null?0:1; }
}

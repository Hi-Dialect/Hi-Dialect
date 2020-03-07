package com.hidialect.hidialect_ws.service.impl;

import com.hidialect.hidialect_ws.dao.IUserIsLikeDao;
import com.hidialect.hidialect_ws.service.IUserIsLikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserIsLikeService implements IUserIsLikeService {
    @Autowired
    private IUserIsLikeDao iUserIsLikeDao;
}

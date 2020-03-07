package com.hidialect.hidialect_ws.service.impl;

import com.hidialect.hidialect_ws.dao.IUsersDao;
import com.hidialect.hidialect_ws.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService implements IUsersService {
    @Autowired
    private IUsersDao iUsersDao;
}

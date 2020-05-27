package com.hidialect.hidialect_ws.service.impl;

import com.hidialect.hidialect_ws.dao.IUsersDao;
import com.hidialect.hidialect_ws.entity.Users;
import com.hidialect.hidialect_ws.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService implements IUsersService {
    @Autowired
    private IUsersDao iUsersDao;

    @Override
    public void signin(Users user) {
        iUsersDao.signin(user);
    }

    @Override
    public void edit(Users user) {
        iUsersDao.edit(user);
    }

    @Override
    public Users pwdLogin(Integer userNo, String password) {
        return iUsersDao.pwdLogin(userNo,password);
    }

    @Override
    public Users getByuserNo(Integer userNo) { return iUsersDao.getByuserNo(userNo); }

    @Override
    public void changePwd(Integer userNo, String password) {
        iUsersDao.changePwd(userNo,password);
    }

    @Override
    public Users signinStatus(String phone) {
        return iUsersDao.signinStatus(phone);
    }
}

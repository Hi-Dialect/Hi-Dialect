package com.hidialect.hidialect_ws.service;

import com.hidialect.hidialect_ws.entity.Users;

public interface IUsersService {
    void signin(Users user);
    void edit(Users user);
    Users pwdLogin(Integer userNo, String password);
    Users getByuserNo(Integer userNo);
    void changePwd(Integer userNo,String password);
    Users signinStatus(String phone);
}

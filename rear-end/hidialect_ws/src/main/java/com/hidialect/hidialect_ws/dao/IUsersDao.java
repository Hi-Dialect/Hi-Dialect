package com.hidialect.hidialect_ws.dao;

import com.hidialect.hidialect_ws.entity.Users;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsersDao {
    void signin(Users user);
    void edit(Users user);
    Users pwdLogin(@Param("userNo")Integer userNo, @Param("password")String password);
    Users getByuserNo(@Param("userNo")Integer userNo);
    void changePwd(@Param("userNo")Integer userNo, @Param("password")String password);
    Users signinStatus(@Param("phone")String phone);
}

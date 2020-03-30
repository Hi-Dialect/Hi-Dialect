package com.hidialect.hidialect_ws.dao;

import com.hidialect.hidialect_ws.entity.UserLabel;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserLabelDao {
    void addUserLabel(UserLabel userLabel);
}

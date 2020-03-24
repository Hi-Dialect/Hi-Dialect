package com.hidialect.hidialect_ws.dao;

import com.hidialect.hidialect_ws.entity.UserIsLike;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserIsLikeDao {
    void addLike(UserIsLike usrIsLike);
}

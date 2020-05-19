package com.hidialect.hidialect_ws.service;

import com.hidialect.hidialect_ws.entity.UserIsLike;

public interface IUserIsLikeService {
    void addLike(UserIsLike userIsLike);
    void deleteLike(UserIsLike userIsLike);
    int getIsLike(UserIsLike userIsLike);
}

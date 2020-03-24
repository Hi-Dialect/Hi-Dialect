package com.hidialect.hidialect_ws.controller;

import com.hidialect.hidialect_ws.entity.UserIsLike;
import com.hidialect.hidialect_ws.service.IUserIsLikeService;
import com.hidialect.hidialect_ws.service.IVideosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/userislike")
public class UserIsLikeController {
    @Autowired
    private IUserIsLikeService iUserIsLikeService;
    private IVideosService iVideosService;

    @RequestMapping(value = "/addLike",method = RequestMethod.POST)
    private void addLike(UserIsLike userIsLike) {
        iUserIsLikeService.addLike(userIsLike);
        if(userIsLike.getIsLke()==1) {
            iVideosService.likeNumAdd1(userIsLike.getVdoId());
        } else {
            iVideosService.dislikeNumAdd1(userIsLike.getVdoId());
        }
    }
}

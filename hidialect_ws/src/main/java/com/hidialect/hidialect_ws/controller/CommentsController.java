package com.hidialect.hidialect_ws.controller;

import com.hidialect.hidialect_ws.entity.Comments;
import com.hidialect.hidialect_ws.service.ICommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/comment")
public class CommentsController {
    @Autowired
    private ICommentsService iCommentsService;
    /* 日期：20200321
     * 创建人：徐悦皓 */

    @RequestMapping(value = "/viewComment",method = RequestMethod.POST)
    private Comments[] viewComment(@RequestParam int vdoId){
        //return iCommentsService.viewComment(vdoId);
    }

}

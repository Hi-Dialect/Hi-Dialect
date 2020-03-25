package com.hidialect.hidialect_ws.controller;

import com.hidialect.hidialect_ws.entity.Comments;
import com.hidialect.hidialect_ws.service.ICommentsService;
import com.hidialect.hidialect_ws.service.IVideosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/comment")
public class CommentsController {
    @Autowired
    private ICommentsService iCommentsService;
    @Autowired
    private IVideosService iVideosService;
    /* 日期：20200321
     * 创建人：徐悦皓 */

    @RequestMapping(value = "/viewComment",method = RequestMethod.POST)
    private Comments[] viewComment(@RequestParam int vdoId){
        return iCommentsService.viewComment(vdoId);
    }

    @RequestMapping(value = "/deleteCom",method = RequestMethod.POST)
    private void deleteCom(@RequestParam int cmtId){
        int vdoId = iCommentsService.getCom(cmtId).getVdoId();
        iCommentsService.deleteCom(cmtId);
        iVideosService.commentNumSub1(vdoId);
    }

    @RequestMapping(value = "/addComment",method = RequestMethod.POST)
    private void addComment(@RequestBody Comments cmt){
        iCommentsService.addComment(cmt);
        iVideosService.commentNumAdd1(cmt.getVdoId());
    }

}

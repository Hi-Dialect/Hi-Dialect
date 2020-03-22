package com.hidialect.hidialect_ws.controller;

import com.hidialect.hidialect_ws.entity.Videos;
import com.hidialect.hidialect_ws.service.IVideosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/videos")
public class VideosController {
    @Autowired
    private IVideosService iVideosService;
    /* 日期：20200321
     * 创建人：徐悦皓 */

    //vdo的标签如何返回待商榷，暂时未实现返回标签

    @RequestMapping(value = "/getLikeVdoByUserNo",method = RequestMethod.POST)
    private Videos[] getLikeVdoByUserNo(@RequestParam int userNo){
        return iVideosService.getLikeVdoByUserNo(userNo);
    }

    @RequestMapping(value = "/getMadeByUserNo",method = RequestMethod.POST)
    private Videos[] getMadeByUserNo(@RequestParam int userNo){
        return iVideosService.getMadeByUserNo(userNo);
    }

    //待测试
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    private Videos[] search(@RequestParam String searchWords, @RequestParam String vdoType){
        return iVideosService.search(searchWords, vdoType);
    }

    @RequestMapping(value = "/viewVdoByActId",method = RequestMethod.POST)
    private Videos[] viewVdoByActId(@RequestParam int actId){
        return iVideosService.viewVdoByActId(actId);
    }

}

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
    /* 日期：20200316
     * 创建人：徐悦皓 */

    @RequestMapping(value = "/getWordsByVdoId",method = RequestMethod.POST)
    private Videos[] getMadeByUserNo(@RequestParam Number userNo){
        return iVideosService.getMadeByUserNo(userNo);
    }

}

package com.hidialect.hidialect_ws.controller;

import com.hidialect.hidialect_ws.entity.Musics;
import com.hidialect.hidialect_ws.service.IMusicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/musics")
public class MusicsController {
    @Autowired
    private IMusicsService iMusicsService;
    /* 日期：20200401
     * 创建人：陈雨豪 */
    @RequestMapping(value = "/getByVdoId",method = RequestMethod.POST)
    private Musics[] getByVdoId(@RequestParam int vdoId){
        return iMusicsService.getByVdoId(vdoId);
    }
    @RequestMapping(value = "/getByMscId",method = RequestMethod.POST)
    private Musics[] getByMscId(@RequestParam int mscId){
        return iMusicsService.getByMscId(mscId);
    }
    @RequestMapping(value = "/getWordsByVdoId",method = RequestMethod.POST)
    private Musics[] searchMusicByName(@RequestParam String mscNa){
        return iMusicsService.searchMusicByName(mscNa);
    }
    @RequestMapping(value = "/searchMusicByType",method = RequestMethod.POST)
    private Musics[] searchMusicByType(@RequestParam byte bgmType){
        return iMusicsService.searchMusicByType(bgmType);
    }
}

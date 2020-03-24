package com.hidialect.hidialect_ws.controller;

import com.hidialect.hidialect_ws.entity.Videos;
import com.hidialect.hidialect_ws.service.ILabelsService;
import com.hidialect.hidialect_ws.service.IVideoLabelService;
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
    private IVideoLabelService iVideoLabelService;
    /* 日期：20200321
     * 创建人：徐悦皓 */

    @RequestMapping(value = "/getLikeVdoByUserNo",method = RequestMethod.POST)
    private Videos[] getLikeVdoByUserNo(@RequestParam int userNo){
        Videos[] vdos = iVideosService.getLikeVdoByUserNo(userNo);
        for(int i=0; i<vdos.length; i++) {
            vdos[i].setVideoLabels(iVideoLabelService.getLabelsByVdoId(vdos[i].getVdoId()));
        }
        return vdos;
    }

    @RequestMapping(value = "/getMadeByUserNo",method = RequestMethod.POST)
    private Videos[] getMadeByUserNo(@RequestParam int userNo){
        Videos[] vdos = iVideosService.getMadeByUserNo(userNo);
        for(int i=0; i<vdos.length; i++) {
            vdos[i].setVideoLabels(iVideoLabelService.getLabelsByVdoId(vdos[i].getVdoId()));
        }
        return vdos;
    }

    //待测试
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    private Videos[] search(@RequestParam String searchWords, @RequestParam String vdoType){
        Videos[] vdos = iVideosService.search(searchWords, vdoType);
        for(int i=0; i<vdos.length; i++) {
            vdos[i].setVideoLabels(iVideoLabelService.getLabelsByVdoId(vdos[i].getVdoId()));
        }
        return vdos;
    }

    @RequestMapping(value = "/viewVdoByActId",method = RequestMethod.POST)
    private Videos[] viewVdoByActId(@RequestParam int actId){
        Videos[] vdos = iVideosService.viewVdoByActId(actId);
        for(int i=0; i<vdos.length; i++) {
            vdos[i].setVideoLabels(iVideoLabelService.getLabelsByVdoId(vdos[i].getVdoId()));
        }
        return vdos;
    }

    @RequestMapping(value = "/deleteVdo",method = RequestMethod.POST)
    private void deleteVdo(@RequestParam int vdoId) {
        iVideosService.deleteVdo(vdoId);
    }

    @RequestMapping(value = "/addVdo",method = RequestMethod.POST)
    private void addVdo(@RequestParam Videos video) {
        iVideosService.addVdo(video);
    }

    @RequestMapping(value = "/getPartVideos",method = RequestMethod.POST)
    private Videos[] getPartVideos(@RequestParam int userNo) {
        Videos[] vdos = iVideosService.getPartVideos(userNo);
        for(int i=0; i<vdos.length; i++) {
            vdos[i].setVideoLabels(iVideoLabelService.getLabelsByVdoId(vdos[i].getVdoId()));
        }
        return vdos;
    }

}

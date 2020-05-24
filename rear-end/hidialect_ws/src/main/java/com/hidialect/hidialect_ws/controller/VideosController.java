package com.hidialect.hidialect_ws.controller;

import com.hidialect.hidialect_ws.entity.Activities;
import com.hidialect.hidialect_ws.entity.Labels;
import com.hidialect.hidialect_ws.entity.Videos;
import com.hidialect.hidialect_ws.service.ILabelsService;
import com.hidialect.hidialect_ws.service.IVideoLabelService;
import com.hidialect.hidialect_ws.service.IVideosService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping(value = "/videos")
public class VideosController {
    @Autowired
    private IVideosService iVideosService;
    @Autowired
    private IVideoLabelService iVideoLabelService;
    private static Logger logger = LoggerFactory.getLogger(VideosController.class);
    /* 日期：20200321
     * 创建人：徐悦皓 */

    @RequestMapping("/hello")
    private String Hello() {
        return "Hello";
    }

    @RequestMapping(value = "/getLikeVdoByUserNo",method = RequestMethod.POST)
    private Videos[] getLikeVdoByUserNo(@RequestParam int userNo){
        Videos[] vdos = iVideosService.getLikeVdoByUserNo(userNo);
        for(int i=0; i<vdos.length; i++) {
            vdos[i].setVideoLabels(iVideoLabelService.getLabelsByVdoId(vdos[i].getVdoId()));
        }
        return vdos;
    }

    @RequestMapping(value = "/getMadeByUserNo",method = RequestMethod.POST)
    private Videos[] getMadeByUserNo(@RequestBody Videos _vdo){
        int userNo = _vdo.getUserNo();
        Videos[] vdos = iVideosService.getMadeByUserNo(userNo);
        for(int i=0; i<vdos.length; i++) {
            vdos[i].setVideoLabels(iVideoLabelService.getLabelsByVdoId(vdos[i].getVdoId()));
        }
        return vdos;
    }

    //待测试
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    private Videos[] search(@RequestParam String searchWords, @RequestParam Byte vdoType){
        Videos[] vdos = iVideosService.search(searchWords, vdoType);
        for(int i=0; i<vdos.length; i++) {
            vdos[i].setVideoLabels(iVideoLabelService.getLabelsByVdoId(vdos[i].getVdoId()));
        }
        return vdos;
    }

    @RequestMapping(value = "/viewVdoByActId",method = RequestMethod.POST)
    private Videos[] viewVdoByActId(@RequestParam int actId) {
        Videos[] vdos = iVideosService.viewVdoByActId(actId);
        for(int i=0; i<vdos.length; i++) {
            vdos[i].setVideoLabels(iVideoLabelService.getLabelsByVdoId(vdos[i].getVdoId()));
        }
        return vdos;
    }

    @RequestMapping(value = "/deleteVdo",method = RequestMethod.POST)
    private void deleteVdo(@RequestBody Videos _vdo) {
        iVideosService.deleteVdo(_vdo.getVdoId());
    }

    @RequestMapping(value = "/addVdo",method = RequestMethod.POST)
    private void addVdo(@RequestBody Videos vdo) {
        iVideosService.addVdo(vdo);
    }

    @RequestMapping(value = "/getPartVideos",method = RequestMethod.POST)
    private Videos[] getPartVideos(@RequestParam int userNo) {
        Videos[] vdos = iVideosService.getPartVideos(userNo);
        for(int i=0; i<vdos.length; i++) {
            System.out.println(vdos[i].getVdoId());
            vdos[i].setVideoLabels(iVideoLabelService.getLabelsByVdoId(vdos[i].getVdoId()));
        }
        return vdos;
    }
    @RequestMapping(value = "/getByVdoID",method = RequestMethod.POST)
    private Videos getByVdoID(@RequestBody Videos _vdo) {
        int vdoId = _vdo.getVdoId();
        Videos vdo =iVideosService.getByVdoID(vdoId);
        vdo.setVideoLabels(iVideoLabelService.getLabelsByVdoId(vdoId));
        return vdo;
    }

    @RequestMapping(value = "/importpic",method = RequestMethod.POST)
    public String importPic(@RequestParam MultipartFile file, @RequestParam String  productName) throws IOException {
        String Filepath="/var/www/html/img/vdos/";//注意更改文件存储位置
        File filepath = new File(Filepath);
        if (!filepath.exists()) {
            filepath.mkdirs();
        }
        File file1 = new File(Filepath+productName+".jpg");
        file.transferTo(file1);
        if(filepath.exists()){
            logger.info("上传成功");
        }else {
            filepath.mkdirs();
            logger.info("上传失败{}",filepath);
        }
        return Filepath+productName+".jpg";
    }

    @RequestMapping(value = "/importVdo",method = RequestMethod.POST)
    public String importVdo(@RequestParam MultipartFile file, @RequestParam String  productName) throws IOException {
        String Filepath="/var/www/html/img/vdos/";//注意更改文件存储位置
        File filepath = new File(Filepath);
        if (!filepath.exists()) {
            filepath.mkdirs();
        }
        File file1 = new File(Filepath+productName+".mp4");
        file.transferTo(file1);
        if(filepath.exists()){
            logger.info("上传成功");
        }else {
            filepath.mkdirs();
            logger.info("上传失败{}",filepath);
        }
        return Filepath+productName+".mp4";
    }
}

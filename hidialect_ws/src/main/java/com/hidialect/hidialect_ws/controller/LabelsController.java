package com.hidialect.hidialect_ws.controller;

import com.hidialect.hidialect_ws.entity.Labels;
import com.hidialect.hidialect_ws.service.ILabelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/labels")
public class LabelsController {
    @Autowired
    private ILabelsService iLabelsService;
    /* 日期：20200325
     * 创建人：陈雨豪 */
    @RequestMapping(value = "/addLabel",method = RequestMethod.POST)
    private void addLabel(@RequestParam String labelNa){
        Labels labels=new Labels();
        labels.setLabelNa(labelNa);
        iLabelsService.addLabel(labels);
    }
    @RequestMapping(value = "/getAllLabels",method = RequestMethod.GET)
    private List<Labels> getAllLabels(){
        return  iLabelsService.getAllLabels();
    }
}

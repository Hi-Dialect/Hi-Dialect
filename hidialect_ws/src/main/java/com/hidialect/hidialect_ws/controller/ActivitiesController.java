package com.hidialect.hidialect_ws.controller;

import com.hidialect.hidialect_ws.entity.Activities;
import com.hidialect.hidialect_ws.service.IActivitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/activity")
public class ActivitiesController {
    @Autowired
    private IActivitiesService iActivitiesService;
    /* 日期：20200321
     * 创建人：徐悦皓 */

    @RequestMapping(value = "/checkAct",method = RequestMethod.POST)
    private Activities[] checkAct(@RequestParam int userNo){
        //return iActivitiesService.checkAct(userNo);
    }

    @RequestMapping(value = "/getActByTypeTime",method = RequestMethod.POST)
    private Activities[] getActByTypeTime(@RequestParam String ActType, @RequestParam String startTime){
        //return iActivitiesService.getActByTypeTime(ActType, startTime);
    }

    @RequestMapping(value = "/getActivities",method = RequestMethod.GET)
    private Activities[] getActivities(){
        //return iActivitiesService.getActivities();
    }

    @RequestMapping(value = "/getActivitymsgByActId",method = RequestMethod.POST)
    private Activities getActivitymsgByActId(@RequestParam int actId){
        //return iActivitiesService.getActivitymsgByActId(actId);
    }

    @RequestMapping(value = "/getActNaByVdoId",method = RequestMethod.POST)
    private Activities getActNaByVdoId(@RequestParam int vdoId){
        //return iActivitiesService.getActNaByVdoId(vdoId);
    }


}

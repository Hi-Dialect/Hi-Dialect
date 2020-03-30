package com.hidialect.hidialect_ws.controller;

import com.hidialect.hidialect_ws.entity.UserLabel;
import com.hidialect.hidialect_ws.service.IUserLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/userlabel")
public class UserLabelController {
    @Autowired
    private IUserLabelService iUserLabelService;
    /* 日期：20200325
     * 创建人：陈雨豪 */
    @RequestMapping(value = "/addUserLabel",method = RequestMethod.POST)
    private void addUserLabel(@RequestParam Integer userNo,
                              @RequestParam Integer labelId){
        UserLabel userLabel=new UserLabel();
        userLabel.setLabelId(labelId);
        userLabel.setUserNo(userNo);
        iUserLabelService.addUserLabel(userLabel);
    }
}

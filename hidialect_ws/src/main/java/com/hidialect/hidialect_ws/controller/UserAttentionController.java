package com.hidialect.hidialect_ws.controller;

import com.hidialect.hidialect_ws.entity.UserAttention;
import com.hidialect.hidialect_ws.entity.Users;
import com.hidialect.hidialect_ws.service.IUserAttentionService;
import com.hidialect.hidialect_ws.service.IUsersService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/userattention")
public class UserAttentionController {
    @Autowired
    private IUserAttentionService iUserAttentionService;
    @Autowired
    private IUsersService iUsersService;
    /* 日期：20200325
     * 创建人：陈雨豪 */
    @RequestMapping(value = "/addAttention",method = RequestMethod.POST)
    private void addAttention(@RequestParam Integer fanNo,
                              @RequestParam Integer starNo){
        UserAttention userAttention=new UserAttention();
        userAttention.setFanNo(fanNo);
        userAttention.setStarNo(starNo);
        iUserAttentionService.addAttention(userAttention);
        Users star=iUsersService.getByuserNo(starNo);
        star.setFansNum(star.getFansNum()+1);
        iUsersService.edit(star);
        Users fans=iUsersService.getByuserNo(fanNo);
        fans.setAttentionNum(fans.getAttentionNum()+1);
        iUsersService.edit(fans);
    }
    @RequestMapping(value = "/cancelAtten",method = RequestMethod.POST)
    private void cancelAtten(@RequestParam Integer fanNo,
                              @RequestParam Integer starNo){
        UserAttention userAttention=new UserAttention();
        userAttention.setFanNo(fanNo);
        userAttention.setStarNo(starNo);
        iUserAttentionService.cancelAtten(userAttention);
        Users star=iUsersService.getByuserNo(starNo);
        star.setFansNum(star.getFansNum()-1);
        iUsersService.edit(star);
        Users fans=iUsersService.getByuserNo(fanNo);
        fans.setAttentionNum(fans.getAttentionNum()-1);
        iUsersService.edit(fans);
    }
    @RequestMapping(value = "/getUserAttentions",method = RequestMethod.POST)
    private List<UserAttention> getUserAttentions(Integer userNo){
        return iUserAttentionService.getUserAttentions(userNo);
    }
    @RequestMapping(value = "/getUserFans",method = RequestMethod.POST)
    private List<UserAttention> getUserFans(Integer userNo){
        return iUserAttentionService.getUserFans(userNo);
    }
}

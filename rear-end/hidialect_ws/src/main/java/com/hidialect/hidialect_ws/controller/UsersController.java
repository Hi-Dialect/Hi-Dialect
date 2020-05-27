package com.hidialect.hidialect_ws.controller;

import com.hidialect.hidialect_ws.entity.Users;
import com.hidialect.hidialect_ws.service.IUsersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping(value = "/users")
public class UsersController {
    @Autowired
    private IUsersService iUsersService;
    private static Logger logger = LoggerFactory.getLogger(UsersController.class);
    /* 日期：20200314
     * 创建人：陈雨豪 */
    @RequestMapping(value = "/loginUsers",method = RequestMethod.POST)
    private Users pwdLogin(@RequestParam Integer userNo, @RequestParam String password){
        return iUsersService.pwdLogin(userNo,password);
    }
    @RequestMapping(value = "/signinStatus",method = RequestMethod.POST)
    private Users signinStatus(@RequestParam String phone){
        return iUsersService.signinStatus(phone);
    }
    @RequestMapping(value = "/changePwd",method = RequestMethod.POST)
    private void changePwd(@RequestParam Integer userNo, @RequestParam String password){
        iUsersService.changePwd(userNo,password);
    }
    @RequestMapping(value = "/signin",method = RequestMethod.POST)
    private void signin(@RequestParam String userNa,
                        @RequestParam String password,
                        @RequestParam String phone,
                        @RequestParam String userImg,
                        @RequestParam String QQNum,
                        @RequestParam String WeChatNum,
                        @RequestParam byte sex){
        Users user=new Users();
        user.setUserNa(userNa);
        user.setPassword(password);
        user.setPhone(phone);
        user.setUserImg(userImg);
        user.setQQNum(QQNum);
        user.setWeChatNum(WeChatNum);
        user.setSex(sex);
        user.setAttentionNum(0);
        user.setFansNum(0);
        user.setMoney(0);
        iUsersService.signin(user);
    }
    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    private void edit(@RequestParam Integer userNo,
                      @RequestParam String userNa,
                      @RequestParam String phone,
                      @RequestParam String userImg,
                      @RequestParam String QQNum,
                      @RequestParam String WeChatNum,
                      @RequestParam byte sex){
        Users user=iUsersService.getByuserNo(userNo);
        user.setUserNa(userNa);
        user.setPhone(phone);
        user.setQQNum(QQNum);
        user.setUserImg(userImg);
        user.setWeChatNum(WeChatNum);
        user.setSex(sex);
        iUsersService.edit(user);
    }
    @RequestMapping(value = "/getUserInfo",method = RequestMethod.POST)
    private Users getUserInfo(@RequestParam Integer userNo){
        System.out.println(1);
        System.out.println(userNo);
        return iUsersService.getByuserNo(userNo);
    }
    //缺少退出登录

    @RequestMapping(value = "/importpic",method = RequestMethod.POST)
    public String importPic(@RequestParam MultipartFile file, @RequestParam String  productName) throws IOException {
        String Filepath="/var/www/html/img/users/";//注意更改文件存储位置
        //String Filepath="F:/____Files/learning/";
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
}

package com.zzd.mmc.core;

import com.zzd.mmc.core.bean.UserBean;
import com.zzd.mmc.core.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by zzd on 2017/3/28.
 */
@Controller
public class LoginController {

    @Autowired
    IUserService userService;
    /**
     * 访问系统首页
     * @return
     */
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String login(){
        System.out.println("你哈哦");
        //插入表中
        return "login";
    }

    @RequestMapping("add")
    public int add(UserBean bean){
        System.out.println("用户bean  = " + bean);
        int i =  userService.insertUser(bean);
        return i;
    }
}

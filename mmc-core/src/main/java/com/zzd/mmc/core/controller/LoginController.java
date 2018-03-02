package com.zzd.mmc.core.controller;


import com.zzd.mmc.core.bean.UserBean;
import com.zzd.mmc.core.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zzd on 2017/3/28.
 */
@Controller
public class LoginController {

    @Autowired
    public IUserService userService;
    /**
     * 访问系统首页
     * @return
     */
    @RequestMapping(value = "/")
    public String index(){
        System.out.println(":: ----- zzd.com ------ :: 进入登录页面 ");
        return "login";
    }

    /**
     * 添加用户
     * @param bean
     * @return
     */
    @RequestMapping("add")
    public String add(UserBean bean){
        System.out.println("用户bean  = " + bean);
        System.out.println(userService.selectUsers(bean));
        //userService.insertUser(bean);
        return "1";
    }
}

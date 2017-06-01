package com.zzd.mmc.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zzd on 2017/3/28.
 */
@Controller
public class LoginSystem {
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
    public String add(String userCode,String userPasswd){

        return "index";
    }
}

package com.zzd.mmc.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by master-pc on 2017/3/28.
 */
@Controller
public class Login {
    /**
     * 访问系统首页
     * @return
     */
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String login(){
        System.out.println("你哈哦");
        return "index";
    }

    @RequestMapping("add")
    public Map<String,String> add(String code){

        //数据库访问
        return new HashMap();
    }
}

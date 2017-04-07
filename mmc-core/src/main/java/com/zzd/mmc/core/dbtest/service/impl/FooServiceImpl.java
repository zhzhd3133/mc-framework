package com.zzd.mmc.core.dbtest.service.impl;

import com.zzd.mmc.core.dbtest.bean.User;
import com.zzd.mmc.core.dbtest.dao.UserMapper;

/**
 * Created by master on 2017/4/7.
 */
public class FooServiceImpl {


   private UserMapper userMapper;



    public User doSomeBusinessStuff(String userId){
        return userMapper.selectUsers(userId);
    }

}

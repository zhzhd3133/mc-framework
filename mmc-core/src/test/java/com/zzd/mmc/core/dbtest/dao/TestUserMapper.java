package com.zzd.mmc.core.dbtest.dao;


import com.zzd.mmc.core.bean.UserBean;
import com.zzd.mmc.core.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * Created by master on 2017/4/7.
 */

public class TestUserMapper extends SpringTest{
     @Autowired
     IUserService userService;

    @Test
    public void testSelectUsers() throws Exception {
        UserBean bean  = new UserBean();
        bean.setUserName("wangjinjun");
        List<UserBean> list = userService.selectUsers(bean);
        System.out.println(list);
    }

}
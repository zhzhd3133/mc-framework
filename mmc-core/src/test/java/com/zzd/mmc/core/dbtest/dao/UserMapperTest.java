package com.zzd.mmc.core.dbtest.dao;

import com.zzd.mmc.core.dbtest.bean.User;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by master on 2017/4/7.
 */
@Service
public class UserMapperTest extends SpringTest{
    @Autowired
    UserMapper userMapper;
    @Test
    public void testSelectUsers() throws Exception {
        User u = userMapper.selectUsers("yangliuqing");
        System.out.println(u);
    }

}
package com.zzd.mmc.core.dbtest.dao;

import com.zzd.mmc.core.dbtest.bean.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by master on 2017/4/7.
 */
public interface UserMapper {
    @Select("select * from sys_user where user_id = #{userId}")
    public User selectUsers(@Param("userId") String userId);
}

package com.zzd.mmc.core.service;

import com.zzd.mmc.core.bean.UserBean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by master-pc on 2017/6/2.
 */
public interface IUserService {
    /**
     * 定义插入用户
     * @param bean
     * @return
     */
    public int insertUser(UserBean bean);

    /**
     * 定义删除用户
     * @param userId
     * @return
     */
    public int deleteUser(String userId);

    /**
     * 定义查询用户
     * @param bean
     * @return
     */
    public List<UserBean> selectUsers(UserBean bean);
}

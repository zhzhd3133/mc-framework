package com.zzd.mmc.core.service;

import com.zzd.mmc.core.bean.UserBean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by master-pc on 2017/6/2.
 */
public interface IUserService {
    public  int insertUser(UserBean bean);

    public int deleteUser(String userId);

    public List<UserBean> selectUsers(UserBean bean);
}

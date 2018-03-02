package com.zzd.mmc.core.service.impl;

import com.zzd.mmc.core.bean.UserBean;
import com.zzd.mmc.core.dao.IUserDao;
import com.zzd.mmc.core.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by master-pc on 2017/6/2.
 */
@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    IUserDao userDao;

    @Override
    public int insertUser(UserBean bean) {
        return userDao.insertUser(bean);
    }

    @Override
    public int deleteUser(String userId) {
        return userDao.deleteUser(userId);
    }

    @Override
    public List<UserBean> selectUsers(UserBean bean) {
        return userDao.selectUsers(bean);
    }
}

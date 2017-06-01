package com.zzd.mmc.core.dao;

import com.zzd.mmc.core.bean.UserBean;
import java.util.List;

/**
 * Created by master-pc on 2017/6/1.
 */
public interface IUserDao {

    public  int insertUser(UserBean bean);

    public int deleteUser(String userId);

    public List<UserBean> selectUsers(UserBean bean);


}
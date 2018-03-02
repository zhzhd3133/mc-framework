package com.zzd.mmc.core.dao;

import com.zzd.mmc.core.bean.UserBean;
import java.util.List;

/**
 * 用户数据操作接口
 *  实例化是需要spring-mybatis 自动扫描的？？？？
 */

public interface IUserDao {
    /**
     * 插入用户
     * @param bean
     * @return
     */
    public  int insertUser(UserBean bean);

    /**
     * 删除用户
     * @param userId
     * @return
     */
    public int deleteUser(String userId);

    /**
     * 查询用户
     * @param bean
     * @return
     */
    public List<UserBean> selectUsers(UserBean bean);
}
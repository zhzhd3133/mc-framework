package com.zzd.mmc.core.bean;

/**
 * Created by master-pc on 2017/6/1.
 */
public class UserBean {
    boolean isEncryption = false;//是否加密
    private String userId;           //用户ID
    private String userName;     //用户名
    private String userCode;     //用户账号
    private String userPasswd;   //用户密码

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd;
    }

    public boolean isEncryption() {
        return isEncryption;
    }

    public void setEncryption(boolean encryption) {
        isEncryption = encryption;
    }

    @Override
    public String toString() {
        return "用户信息{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userCode='" + userCode + '\'' +
                '}';
    }

}

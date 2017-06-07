<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.zzd.mmc.core.dao.IUserDao">

    <!-- 实体属性与表字段对应 -->
    <resultMap id="userBeanMap" type="UserBean">
        <result property="userName" column="user_name"/>
        <result property="userCode" column="user_code"/>
        <result property="userId" column="user_id"/>
    </resultMap>

    <select id="insertUser"  parameterType="UserBean" resultMap="userBeanMap">
        SELECT * FROM SYS_USER
    </select>

    <insert id="insertUser" parameterType="UserBean">
        insert into sys_user (user_name,user_code,user_id)
        values (#{userName},#{userCode},#{userId})
    </insert>

    <delete id="deleteUser" parameterType="string">
        DELETE FROM sys_user where user_id = #{userId}
    </delete>

</mapper>

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.zzd.mmc.core.dao.IUserDao">

    <!-- 实体属性与表字段对应 -->
    <resultMap id="enumDicEntityMap" type="EnumDicEntity">

    </resultMap>

    <select id="insertUser"  parameterType="UserBean">

    </select>

    <insert id="insertUser" parameterType="UserBean">

    </insert>

    <delete id="deleteEnumsObjByObj" parameterType="EnumDicBean">
        delete from
        ${SCHEMA_BASE}.BASE_ENUM_DIC where PK_ID=#{pkId}
    </delete>

</mapper>

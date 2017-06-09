<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MMC管理平台</title>
</head>
<body>
    <h1>Master Manger Client</h1>
        <form action="add" method="post">
            账  号：<input type="text" name="userCode" value="" placeholder="请输入账号">
            用户名： <input type="text" name="userName" value="" placeholder="请输入用户名">
            用户ID：<input type="hidden" name="userId" value="10000">
            <input type="submit" name="userPasswd" value="登录"/>
        </form>
</body>
</html>

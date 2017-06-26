<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/6/21
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/login" method="post">
    <table>
        <th><h3>登陆</h3></th>
        <tr>
            <td>学号：</td>
            <td><input type="text" name="sno"/></td>
        </tr>
        <tr>
            <td>手机长号：</td>
            <td><input type="password" name="longTel"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="登陆"/></td>
            <td><input type="reset" value="重置"/></td>
        </tr>
    </table>
</form>
</body>
</html>

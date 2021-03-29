<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/30
  Time: 13:01
  To change this template use File | Settings | File Templates.
--%>
<%@page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th>ID</th>
        <th>角色名称</th>
        <th>角色描述</th>
    </tr>
    <c:forEach items="${rolelist}" var="role">
        <tr>
            <td>${role.id}</td>
            <td>${role.roleName}</td>
            <td>${role.roleDesc}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

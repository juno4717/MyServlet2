<%--
  Created by IntelliJ IDEA.
  User: juno
  Date: 2019/11/17
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<input type="text" value="123">
<c:forEach items="${userList}" var="ll">
    username:<input type="text" value="${ll.userName}"><br>
    password:<input type="text" value="${ll.password}"><br>
</c:forEach>
</body>
</html>

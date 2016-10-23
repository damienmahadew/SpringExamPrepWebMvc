<%--
  Created by IntelliJ IDEA.
  User: DAMIEN6
  Date: 23/10/2016
  Time: 1:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <c:url var="loginUrl" value="/login"/>
    <form:form action="${loginUrl}" method="post">
        <input type="text" name="username"/>
        <br/>
        <input type="password" name="password"/>
        <br/>
        <input type="submit" name="submit" value="LOGIN"/>
    </form:form>
</body>
</html>

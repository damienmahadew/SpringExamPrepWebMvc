<%--
  Created by IntelliJ IDEA.
  User: DAMIEN6
  Date: 23/10/2016
  Time: 10:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Page</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
    <%--Facelet tags for JSF are also available
        - Need to define and install them manually
        - Principal is available in SpEL: #{principal.username}--%>

</head>
<body>
    <h2>Displaying info for all user</h2>
    <c:forEach var="user" items="${users}" varStatus="userIndex">
        <p>${user.idNo} - ${user.name}</p>
    </c:forEach>

    <br/>
    You are logged in as: <security:authentication property="principal.username"/>
    <%--<security:authorize access="hasRole('ADMIN')">--%>
        <%--TOP-SECRET INFORMATION--%>
        <%--Click <a href="/user/deleteAll">here</a> to delete all records--%>
    <%--</security:authorize>--%>
    <%--Better practice to leave all permissions in spring config--%>
    <%--Note -- although it is red in intellij - it works--%>
    <security:authorize url='/user/deleteAll'>
        TOP-SECRET INFORMATION
        Click <a href="/user/deleteAll">here</a> to delete all records
    </security:authorize>
</body>
</html>

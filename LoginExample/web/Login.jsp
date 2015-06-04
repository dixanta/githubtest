<%-- 
    Document   : Login
    Created on : Jun 4, 2015, 6:13:27 PM
    Author     : forsell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <c:if test="${param.error!=null}">
            <div>Invalid UserName/Password Please Try Again</div>
        </c:if>
            
        <form action="LoginProcess" method="post">
            <input type="text" name="username" placeholder="UserName"/><br/>
            <input type="password" name="password" placeholder="Password"/><br/>
            <input type="submit" name="login"value="Login"/>
            
        </form>
    </body>
</html>

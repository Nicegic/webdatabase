<%-- 
    Document   : login
    Created on : 22.02.2016, 11:42:34
    Author     : Nicolas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Hallo, <%= request.getParameter("username")%> </h1>
        <form action="index.html">
            <button type="submit"><span>zurück</span></button>
        </form>
    </body>
</html>

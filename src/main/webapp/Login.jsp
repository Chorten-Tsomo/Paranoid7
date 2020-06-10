<%-- 
    Document   : Login
    Created on : 22 May 2020, 20:39:48
    Author     : tsomo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Form</title>
        <link rel="stylesheet" type="text/css" media="all" href="style.css">
    </head>
    <body>
        <div class="loginbox"> 
            <img src="user.png" class="avatar">
            <h1>LOG IN HERE</h1>
            <form action="LoginCheck" method="post">
		<p>Email</p>
                <input type="text" name="uemail" />
		<p>Password</p>
                <input type="password" name="upass" />
                <br>
                <br>
                <br>
                <input type="submit" value="Login" />
            </form> 
        </div>
    </body>
</html>

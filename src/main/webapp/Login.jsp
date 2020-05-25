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
    </head>
    <body>
        <form action="LoginCheck" method="post">
		<table style="with: 50%">
 
			<tr>
				<td>Email</td>
				<td><input type="email" name="uemail" /></td>
			</tr>
				<tr>
				<td>Password</td>
				<td><input type="password" name="upass" /></td>
			</tr>
		</table>
            <input type="submit" value="Login" /></form> 
    </body>
</html>

<%-- 
    Document   : login
    Created on : 9 Jun 2020, 18:39:59
    Author     : tsomo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Form</title>
        <script> 
function validate()
{ 
     var email = document.form.email.value; 
     var password = document.form.password.value;
 
     if (email==null || email=="")
     { 
     alert("Email cannot be blank"); 
     return false; 
     }
     else if(password==null || password=="")
     { 
     alert("Password cannot be blank"); 
     return false; 
     } 
}
</script> 
    </head>
    <body>
        <form name="form" action="<%=request.getContextPath()%>    /LoginServlet" method="post">
 
        <table align="center">
        <tr>
        <td>Username</td>
        <td><input type="email" name="uemail" /></td>
        </tr>
        <tr>
        <td>Password</td>
        <td><input type="password" name="upass" /></td>
        </tr>
        <tr>
        <td><span style="color:red"><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%></span></td>
        </tr>
        
        <tr>
        <td></td>
        <td><input type="submit" value="Login"></input><input type="reset" value="Reset"></input></td>
        </tr>
        </table>
        </form>
    </body>
</html>

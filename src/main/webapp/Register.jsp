<%-- 
    Document   : Register
    Created on : 22 May 2020, 10:15:09
    Author     : tsomo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration form</title>
    </head>
    <body>
        
        <h1>Register User!</h1>
        <p>Please fill in this form to create an account.</p>
        <form action="Register" method="post">
   <table style="with: 80%">
    <tr>
     <td>First Name</td>
     <td><input type="text" name="ufname" /></td>
    </tr>
    <tr>
     <td>Last Name</td>
     <td><input type="text" name="ulname" /></td>
    </tr>
    <tr>
     <td>Address</td>
     <td><input type="text" name="uaddress" /></td>
    </tr>
    <tr>
     <td>Phone Number</td>
     <td><input type="text" name="upnum" /></td>
    </tr>
    <tr>
     <td>Email</td>
     <td><input type="text" name="uemail" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="upass" /></td>
    </tr>
    <tr>
     <td>Confirm Password</td>
     <td><input type="password" name="ucpass" /></td>
    </tr>
    </table>
   <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
            <button type="submit" class="registerbtn">Register</button>
  </form>
    </body>
</html>

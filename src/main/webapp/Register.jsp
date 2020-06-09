<%-- 
    Document   : Register
    Created on : 9 Jun 2020, 18:38:50
    Author     : tsomo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Form</title>
        <script> 
function validate()
{ 
     var firstname = document.form.firstname.value;
     var lastname = document.form.lastname.value;
     var address = document.form.address.value; 
     var phonenum = document.form.phonenum.value;
     var email= document.form.email.value;
     var password= document.form.password.value;
     var confirmpassword= document.form.confirmpassword.value;
     
     if (firstname==null || firstname=="")
     { 
     alert("Firstname Name can't be blank"); 
     return false; 
     }
     else if (lastname==null || lastname=="")
     { 
     alert("Lastname can't be blank"); 
     return false; 
     }
     else if (address==null || address=="")
     { 
     alert("Address can't be blank"); 
     return false; 
     }
     else if (phonenum==null || phonenum=="")
     { 
     alert("Phonenum can't be blank"); 
     return false; 
     }
     else if (email==null || email=="")
     { 
     alert("Email can't be blank"); 
     return false; 
     }
     else if(password.length<6)
     { 
     alert("Password must be at least 6 characters long."); 
     return false; 
     } 
     else if (password!=confirmpassword)
     { 
     alert("Confirm Password should match with the Password"); 
     return false; 
     } 
 } 
</script> 
    </head>
    <body>
        <div class="registration">
        <h1>Register User!</h1>
        <p>Please fill in this form to create an account.</p>
        <form name="form" action="RegisterServlet" method="post" onsubmit="return validate()">
   <table>
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
    <tr>
         <td><%=(request.getAttribute("errMessage") == null) ? ""
         : request.getAttribute("errMessage")%></td>
         </tr>
    </table>
   <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
            <button type="submit" class="registerbtn">Register</button>
  </form>
        
        </body>
</html>

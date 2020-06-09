<%-- 
    Document   : Admin
    Created on : 9 Jun 2020, 18:37:38
    Author     : tsomo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin login</title>
        
    </head>
    <% //In case, if Admin session is not set, redirect to Login page
if((request.getSession(false).getAttribute("Admin")== null) )
{
%>
<jsp:forward page="/JSP/login.jsp"></jsp:forward>
<%} %>
    <body>
        <center><h2>Admin's Home</h2></center>
 
    Welcome <%=request.getAttribute("uemail") %>
 
    <div style="text-align: right"><a href="<%=request.getContextPath()%>/LogoutServlet">Logout</a></div>
        
    </body>
</html>
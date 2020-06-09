<%-- 
    Document   : Guest
    Created on : 9 Jun 2020, 18:38:22
    Author     : tsomo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Guest login page</title>
    </head>
    <% //In case, if Editor session is not set, redirect to Login page
if((request.getSession(false).getAttribute("Guest")== null) )
{
%>
<jsp:forward page="/JSP/login.jsp"></jsp:forward>
<%} %>
    <body>
        <center><h2>Editor's Home</h2></center>
 
Welcome <%=request.getAttribute("uemail") %>
 
<div style="text-align: right"><a href="<%=request.getContextPath()%>/LogoutServlet">Logout</a></div>
        
    </body>
</html>


<%@page import="shopingo.connention.DBConn"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
  
  <%@include file="includes/header.jsp"%>
    
   
    <title>Bootstrap demo</title>
    
  </head>
  <body>
    <%@include file="/includes/navbar.jsp"%>
    
    <% out.print(DBConn.getConnection()); %>
    
     <%@include file="includes/footer.jsp"%>
  </body>
</html>
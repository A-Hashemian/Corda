<%@page import="shopingo.connention.DBConn"%>
<%@page import="shopingo.model.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
User auth = (User) request.getSession().getAttribute("auth");
if (auth != null) {
    request.setAttribute("person", auth);
}
ProductDao pd = new ProductDao(DbCon.getConnection());
List<Product> products = pd.getAllProducts();
ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
if (cart_list != null) {
	request.setAttribute("cart_list", cart_list);
}
%>
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
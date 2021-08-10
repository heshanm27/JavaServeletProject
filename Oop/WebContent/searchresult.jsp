<%@page import="org.apache.taglibs.standard.tag.common.xml.ForEachTag"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList"%>
    <%@page import="com.item.Item"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

<!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

<!-- Compiled and minified JavaScript -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

 <!--Google Matrial Icons--> 
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
    rel="stylesheet"> 
    
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <%
  

	 int k;
  	ArrayList<Item> std = (ArrayList<Item>) request.getAttribute("itemDetails");
  
  	k=std.size();
  	out.println("<h1>"+k+"<h1>");
  for(Item s:std){%>
    
        
      <div class="col s12 m7">
    <h2 class="header"><%=s.getItemID()%></h2>
    <div class="card horizontal">
      <div class="card-stacked">
        <div class="card-content">
          <p><%=s.getItemName()%></p>
        </div>
        <div class="card-action">
          <a href="#"><%=s.getPrice()%></a>
          
         
        </div>
      </div>
    </div>
  </div>
      <%}
      %>
        



</body>
</html>
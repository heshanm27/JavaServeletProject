<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.util.ArrayList"%>
    <%@page import="com.item.Item"%>
    <%@page import="java.sql.Blob"%>
<%@page import="java.io.OutputStream"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

<!-- Compiled and minified JavaScript -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

 <!--Google Matrial Icons--> 
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
    rel="stylesheet"> 
    
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/tiny-slider/2.9.3/tiny-slider.css">
     
    <link rel="stylesheet" href="/OOP/cSS/index.css" type="text/css">


            
</head>
<body>


  <nav>
    <div class="nav-wrapper">
      <a href="item" class="brand-logo">Logo</a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
        <li><a href="sass.html">Sass</a></li>
        <li><a href="badges.html">Components</a></li>
        <li><a href="collapsible.html">JavaScript</a></li>
      </ul>
      
      
      <form action="#">
        <div class="input-field right" >
          <input id="search" type="search" required>
          <label class="label-icon" for="search"><i class="material-icons">search</i></label>
          <i class="material-icons" id="closeBtn">close</i>
        </div>
      </form>
    </div>
    
    </div>
  </nav>
  
  <button id="btn"></button>
  
  <div class="row owl">
   <% 

    
  	ArrayList<Item> st = (ArrayList<Item>) request.getAttribute("itemDetails");

  
  for(Item s:st){
  
  
	  
  
  %>
    
    
    	 
 				
     <div class="col l2 m6 s6">
     
     
       <div class="card" style="height: 600px">
        <div class="card-image">
     <img src="data:image/jpg;base64,<%=s.getBase64Image()%>" width="100%" height="100%">
        </div>
        <div class="card-content">   
      	<center><h4><%=s.getItemName()%></h4></center>
        
        </div>
        <div class="card-action">
          <center><h5><%=s.getPrice()%></h5></center>
          <a href="#">This is a link</a>
        </div>
      </div>
      
      </div>
     
     
   
      <%}
      %>
  </div>
  
  
  
  
    <div class="row">

 
   <% 

    
  	ArrayList<Item> std = (ArrayList<Item>) request.getAttribute("itemDetails");

  
  for(Item s:std){
  
  
	  
  
  %>
    
    
    	 
 				
     <div class="col l2 m6 s6">
     
     
       <div class="card" style="height: 600px">
        <div class="card-image">
     <img src="data:image/jpg;base64,<%=s.getBase64Image()%>" width="100%" height="100%">
        </div>
        <div class="card-content">   
      	<center><h4><%=s.getItemName()%></h4></center>
        
        </div>
        <div class="card-action">
          <center><h5><%=s.getPrice()%></h5></center>
          <a href="#">This is a link</a>
        </div>
      </div>
      
      </div>
     
     
   
      <%}
      %>
  </div>
  
  
  
 
  
  
        
<script src="https://cdnjs.cloudflare.com/ajax/libs/tiny-slider/2.9.2/min/tiny-slider.js"></script>
<script src="jquery.min.js"></script>
 <script type="text/javascript" src="/OOP/js/index.js"></script>
</body>
</html>
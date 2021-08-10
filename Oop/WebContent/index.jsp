<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.util.ArrayList"%>
    <%@page import="com.item.Item"%>
    <%@page import="java.sql.Blob"%>
<%@page import="java.io.OutputStream"%>
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
    
    <link rel="stylesheet" href="/Oop/css/index.css" type="text/css">


            
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
  
  
  
    <div class="row">

 
   <% 

    
  	ArrayList<Item> std = (ArrayList<Item>) request.getAttribute("itemDetails");

  
  for(Item s:std){
  
  
	  
  
  %>
    
    
    	 
 				
     <div class="col l2 m6 s6">
     
     
       <div class="card">
        <div class="card-image">
     <img src="data:image/jpg;base64,<%=s.getBase64Image()%>" width="240" height="300">
        </div>
        <div class="card-content">   
      	<center><h4><%=s.getItemName()%></h4></center>
          <p>I am a very simple card. I am good at containing small bits of information.
          I am convenient because I require little markup to use effectively.</p>
        
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
        
  
      <script type="text/javascript" src="/Oop/js/index.js"></script>
</body>
</html>
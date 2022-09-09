<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ page import="java.sql.*"%>
 

 <%@page import= "java.util.List"%>

 <%@page import="ps.*"%>
 
  <%@page import="ps.All_main_functions"%>

<%@ page import="java.io.*"%>
 <%@page import="java.util.ArrayList" %>
 
 <%@page import="ps.plant_details" %>
 
<%ArrayList plt =(ArrayList)request.getAttribute("plt"); %>

<!DOCTYPE html>
<html>
<head>



    <title>JSP - Hello World</title>
    
    
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">



</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="navbar-nav">
      <a class="nav-item nav-link active" href="#">Home <span class="sr-only">(current)</span></a>
      <a class="nav-item nav-link" href="#">Features</a>
      <a class="nav-item nav-link" href="#">Pricing</a>
      <a class="nav-item nav-link disabled" href="#">Disabled</a>
    </div>
  </div>
</nav>
<div class="card-group">
<% for(int count=0; count < 5; count++){ %>

<% plant_details lz = (plant_details)plt.get(count); %>


<div class="card" style="width: 18rem;">
  <img class="card-img-top" src="<%= lz.getImage() %>" alt="Card image cap" width="300" height="300">
  <div class="card-body">
    <h5 class="card-title"><%= lz.getName() %></h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
     <p> <form action="info" method="post">

<button class="btn btn-info" name="p_name" type="submit" value="<%= lz.getName() %>">MORE</button>

</form></p>

  </div>
</div>


<%}
		
		%>
	</div>
		
</body>
</html>

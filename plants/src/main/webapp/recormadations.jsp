
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
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

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
	<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Karma">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<style>

.card {
  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
  transition: 0.3s;
  width: 40%;
}
</style>


</head>

<body>

<% for(int count=0; count < 5; count++){ %>
	
	
	
	<% plant_details lz = (plant_details)plt.get(count); %>
	
	

<div class="card">
	
	
	


  <img src="<%= lz.getImage() %>" alt="Denim Jeans" style="width:100%">
  <h1><%= lz.getName() %></h1>
  
  
  
  <p> <form action="info" method="post">

<button class="btn btn-info" name="p_name" type="submit" value="<%= lz.getName() %>">MORE</button>

</form></p>



</div>

<%}
		
		%>
		
		  <br><br>

</body>
</html>

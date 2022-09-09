
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

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="./css_test/incss.css" />

<style>

body{
   background: #FF0 !important; // Just to see if it works.
}
</style>


</head>

<body>



<div id="chart"></div>
<!-- partial -->
  <script  src="assets/js/script.js"></script>


</body>
</html>

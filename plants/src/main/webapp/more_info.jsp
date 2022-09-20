
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ page import="java.sql.*"%>
 

 <%@page import= "java.util.List"%>

 <%@page import="ps.*"%>
 
  <%@page import="ps.All_main_functions"%>

<%@ page import="java.io.*"%>
 <%@page import="java.util.ArrayList" %>
 
 <%@page import="ps.plant_details" %>
 

 


<!DOCTYPE html>
<html>
<head>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="./css_test/incss.css" />

<style>


</style>


</head>

<body>

<table>
<thead>
  <tr>
    <th>name</th>
    <th>range min</th>
    <th>range max</th>
    <th>current value</th>
  </tr>
</thead>
<tbody>
  <tr>
    <td>humidity</td>
    <td>${himidity_low}</td>
    <td>${himidity_high}</td>
    <td>${humidity}</td>
  </tr>
  <tr>
    <td>temperature</td>
    <td>${temp_low}</td>
    <td>${temp_high}</td>
    <td>${temp}</td>
  </tr>
  <tr>
    <td>lux</td>
    <td>${lux_low}</td>
    <td>${lux_high}</td>
    <td>${lux}</td>
  </tr>
  <tr>
    <td>height</td>
    <td>${height_low}</td>
    <td>${height_high}</td>
    <td>${height}</td>
  </tr>
  <tr>
    <td>soil ec</td>
    <td>${soil_ec_low}</td>
    <td>${soil_ec_high}</td>
    <td>${soil_ec}</td>
  </tr>
  <tr>
    <td>soil moisture</td>
    <td>${soil_moisture_low}</td>
    <td>${soil_moisture_high}</td>
    <td>${soil_moisture}</td>
  </tr>
  <tr>
    <td>ph</td>
    <td>${ph_low}</td>
    <td>${ph_high}</td>
    <td>${ph}</td>
  </tr>
  <tr>
    <td>potassium</td>
    <td>${soil_potassium_low}</td>
    <td>${soil_potassium_high}</td>
    <td>${soil_potassium}</td>
  </tr>
  <tr>
    <td>nitrogen</td>
    <td>${soil_nitrogen_low}</td>
    <td>${soil_nitrogen_high}</td>
    <td>${soil_nitrogen}</td>
  </tr>
  <tr>
    <td>phosphers</td>
    <td>${soil_phoisphers_low}</td>
    <td>${soil_phoisphers_high}</td>
    <td>${soil_phoisphers}</td>
  </tr>
  <tr>
    <td>distance from equator </td>
    <td>${distance_from_eq_low}</td>
    <td>${distance_from_eq_high}</td>
    <td>${distance_from_eq}</td>
  </tr>
</tbody>
</table>

</body>
</html>

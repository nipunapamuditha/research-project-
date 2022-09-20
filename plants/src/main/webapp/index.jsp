			<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
			<!DOCTYPE html>
			<html>
			<head>
			
			<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css">
<script src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

			
			<meta charset="ISO-8859-1">
			<title>Insert title here</title>
			</head>
			<body>
			      
			<form action="log" method="post">
	 		  
			  <input type="submit" name="submit" value="use automated inputs">
			</form>
			
			<form action="manual_inputs.jsp">
    <input type="submit" value="to use manual inputs" />
</form>


<form action="add_crops.jsp">
    <input type="submit" value="add crops to database" />
</form>
			
			
			</body>
			</html>
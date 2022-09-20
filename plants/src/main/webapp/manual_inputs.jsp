<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>plese enter values without decimal points ex :- if ph is 6.5 insert it as 65</h1>

<form name="manual_inputs" method="post" action="manual_in_serv">
   
    humidity: <input type="text" name="humidity"/> <br/>
    temperature: <input type="text" name="temprature"/> <br/>
    
    lux: <input type="text" name="lux"/> <br/>
    altitude: <input type="text" name="altitude"/> <br/>
    
    soil eletrical conductivity: <input type="text" name="soil_eletrical_conductivity"/> <br/>
    soil moisture: <input type="text" name="soil_moisture"/> <br/>
    
    PH: <input type="text" name="PH"/> <br/>
    soil potassium: <input type="text" name="soil_potassium"/> <br/>
    
    soil nitrogen: <input type="text" name="soil_nitrogen"/> <br/>
    soil phospherus : <input type="text" name="phosphers"/> <br/>
    
    distance from equator: <input type="text" name="distance_from_equator"/> <br/>   <!--better if we can pull this up from a map gps sor something -->
  
    
    
    <input type="submit" value="enter" />
</form>


</body>
</html>
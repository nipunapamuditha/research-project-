<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css">
<script src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form name="add_crops" method="post" action="add_crops_serv">
   
    crop name: <input type="text" name="crop_name"/> <br/>
    
    
    
      <div data-role="rangeslider">
      
        <label for="humidity-min">humidity range:</label>
        <input type="range" name="humidity-min" id="humidity-min"  min="1" max="100">
        
        <label for="humidity-max">humidity range:</label>
        <input type="range" name="humidity-max" id="humidity-max"  min="1" max="100">
    
      </div>
      
      
     <div data-role="rangeslider">
      
        <label for="temprature-min">temprature range:</label>
        <input type="range" name="temprature-min" id="temprature-min"  min="1" max="100">
        
        <label for="temprature-max">temprature range:</label>
        <input type="range" name="temprature-max" id="temprature-max"  min="1" max="100">
    
      </div>
    
    
       <div data-role="rangeslider">
      
        <label for="lux-min">lux range:</label>
        <input type="range" name="lux-min" id="lux-min"  min="1" max="10000">
        
        <label for="lux-max">lux range:</label>
        <input type="range" name="lux-max" id="lux-max"  min="1" max="10000">
    
      </div>
      
      
      
      <div data-role="rangeslider">
      
        <label for="height-min">height range:</label>
        <input type="range" name="height-min" id="height-min"  min="1" max="8000">
        
        <label for="height-max">height range:</label>
        <input type="range" name="height-max" id="height-max"  min="1" max="8000">
    
      </div>
  
  
   <div data-role="rangeslider">
      
        <label for="soil_ec-min">soil_ec range:</label>
        <input type="range" name="soil_ec-min" id="soil_ec-min"  min="10" max="1000">
        
        <label for="soil_ec-max">soil_ec range:</label>
        <input type="range" name="soil_ec-max" id="soil_ec-max"  min="10" max="1000">
    
      </div>
      
      
      <div data-role="rangeslider">
      
        <label for="soil_moisture-min">soil_moisture range:</label>
        <input type="range" name="soil_moisture-min" id="soil_moisture-min"  min="1" max="100">
        
        <label for="soil_moisture-max">soil_moisture range:</label>
        <input type="range" name="soil_moisture-max" id="soil_moisture-max"  min="1" max="100">
    
      </div>
      
      <div data-role="rangeslider">
      
        <label for="ph-min">ph range:</label>
        <input type="range" name="ph-min" id="ph-min"  min="1" max="100">
        
        <label for="ph-max">ph range:</label>
        <input type="range" name="ph-max" id="ph-max"  min="1" max="100">
    
      </div>
    
    
       <div data-role="rangeslider">
      
        <label for="potassium-min">potassium range:</label>
        <input type="range" name="potassium-min" id="potassium-min"  min="1" max="100">
        
        <label for="potassium-max">potassium range:</label>
        <input type="range" name="potassium-max" id="potassium-max"  min="1" max="100">
    
      </div>
    
    
    <div data-role="rangeslider">
      
        <label for="nitrogen-min">nitrogen range:</label>
        <input type="range" name="nitrogen-min" id="nitrogen-min"  min="1" max="100">
        
        <label for="nitrogen-max">nitrogen range:</label>
        <input type="range" name="nitrogen-max" id="nitrogen-max"  min="1" max="100">
    
      </div>
      
         <div data-role="rangeslider">
      
        <label for="phosoheruss-min">phosoheruss range:</label>
        <input type="range" name="phosoheruss-min" id="phosoheruss-min"  min="1" max="100">
        
        <label for="phosoheruss-max">phosoheruss range:</label>
        <input type="range" name="phosoheruss-max" id="phosoheruss-max"  min="1" max="100">
    
      </div>
    
    
    <div data-role="rangeslider">
      
        <label for="distancefrom-eq-min">distancefrom-eq range:</label>
        <input type="range" name="distancefrom-eq-min" id="distancefrom-eq-min"  min="1" max="10000">
        
        <label for="distancefrom-eq-max">distancefrom-eq range:</label>
        <input type="range" name="distancefrom-eq-max" id="distancefrom-eq-max"  min="1" max="10000">
    
      </div>
    
     image url with jpj tag: <input type="text" name="image_url"/> <br/>
    
    <input type="submit" value="enter" />
</form>

</body>
</html>
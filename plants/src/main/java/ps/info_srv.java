package ps;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class info_srv
 */
@WebServlet("/info_srv")
public class info_srv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
		int humidity = 0;
		 int temp = 0;
		 int lux = 0;
		 int height = 0;
		 int soil_ec = 0;
		 int soil_moisture = 0;
		 int ph = 0;
		 int soil_potassium = 0;
		 int soil_nitrogen = 0;
		 int soil_phoisphers = 0;
		 int distance_from_eq = 0;
		 
		 int himidity_low =0;
		 int himidity_high =0;
		  
		 int temp_low=0;
		 int temp_high=0;
		  
		 int lux_low=0;
		 int lux_high=0;
		  
		  
		 int height_low=0;
		 int  height_high=0;
		  
		 int  soil_ec_low=0;
		 int soil_ec_high=0;
		  
		 int soil_moisture_low=0;
		 int  soil_moisture_high=0;
		  
		 int  ph_low=0;
		 int  ph_high=0;
		  
		 int soil_potassium_low=0;
		 int  soil_potassium_high=0;
		  
		 int  soil_nitrogen_low=0;
		 int  soil_nitrogen_high=0;
		  
		 int  soil_phoisphers_low=0;
		 int  soil_phoisphers_high=0;
		  
		 int  distance_from_eq_low=0;
		 int  distance_from_eq_high=0;
		 
		
		String plant_name = request.getParameter("p_name"); 
		System.out.println("plant name is fromserverlt info :--");
		System.out.println(plant_name);
		
		String username="root";
		String password="#Karunarathna2044";
		String url="jdbc:mysql://127.0.0.1:3306/plant_suggestion?autoReconnect=true&useSSL=false";
		String get_env = "select * from plant_suggestion.current_condition";
		String get_plant_requirements = "select * from plant_suggestion.plants where name ='"+plant_name+"'";
		
		try {
			
			System.out.println("try");
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con1=DriverManager.getConnection(url, username, password);
			Statement get_current_env_veriables= con1.createStatement();
			
			ResultSet env_veriables= get_current_env_veriables.executeQuery(get_env);
			
			if(env_veriables.next())
			{
				
				  
				  humidity=Integer.parseInt(env_veriables.getString(2));
				  temp=Integer.parseInt(env_veriables.getString(3));
				  lux=Integer.parseInt(env_veriables.getString(4));
				  height=Integer.parseInt(env_veriables.getString(5));
				  soil_ec=Integer.parseInt(env_veriables.getString(6));
				  soil_moisture=Integer.parseInt(env_veriables.getString(7));
				  ph=Integer.parseInt(env_veriables.getString(8));
				  soil_potassium=Integer.parseInt(env_veriables.getString(9));
				  soil_nitrogen=Integer.parseInt(env_veriables.getString(10));
				  soil_phoisphers=Integer.parseInt(env_veriables.getString(11));
				  distance_from_eq=Integer.parseInt(env_veriables.getString(12));
				 
				
			}
			
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Humidity on current conditions is");
		System.out.println(humidity);
		
		
try {
			
			System.out.println("try");
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con1=DriverManager.getConnection(url, username, password);
			Statement get_current_env_veriables= con1.createStatement();
			
			ResultSet plant_rc= get_current_env_veriables.executeQuery(get_plant_requirements);
			
			if(plant_rc.next())
			{
				
				//get plants required conditions to compare   
				himidity_low=Integer.parseInt(plant_rc.getString(3));
				  himidity_high=Integer.parseInt(plant_rc.getString(4));
				  temp_low=Integer.parseInt(plant_rc.getString(5));
				  temp_high=Integer.parseInt(plant_rc.getString(6));
				  lux_low=Integer.parseInt(plant_rc.getString(7));
				  lux_high=Integer.parseInt(plant_rc.getString(8));
				  height_low=Integer.parseInt(plant_rc.getString(9));
				  height_high=Integer.parseInt(plant_rc.getString(10));
				  soil_ec_low=Integer.parseInt(plant_rc.getString(11));
				  soil_ec_high=Integer.parseInt(plant_rc.getString(12));
				  soil_moisture_low=Integer.parseInt(plant_rc.getString(13));
				  soil_moisture_high=Integer.parseInt(plant_rc.getString(14));
				  ph_low=Integer.parseInt(plant_rc.getString(15));
				  ph_high=Integer.parseInt(plant_rc.getString(16));
				  soil_potassium_low=Integer.parseInt(plant_rc.getString(17));
				  soil_potassium_high=Integer.parseInt(plant_rc.getString(18));
				  soil_nitrogen_low=Integer.parseInt(plant_rc.getString(19));
				  soil_nitrogen_high=Integer.parseInt(plant_rc.getString(20));
				  soil_phoisphers_low=Integer.parseInt(plant_rc.getString(21));
				  soil_phoisphers_high=Integer.parseInt(plant_rc.getString(22));
				  distance_from_eq_low=Integer.parseInt(plant_rc.getString(23));
				  distance_from_eq_high=Integer.parseInt(plant_rc.getString(24));
			}
}catch(Exception e)
{
	e.printStackTrace();
}

System.out.println("observed ph levels are");
System.out.println(ph_low);
System.out.println("done");

request.setAttribute("humidity",humidity);
	request.setAttribute("temp",temp);	
	request.setAttribute("lux",lux);		
	request.setAttribute("height",height);		
	request.setAttribute("soil_ec",soil_ec);		
	request.setAttribute("soil_moisture",soil_moisture);		
	request.setAttribute("ph",ph);		
	request.setAttribute("soil_potassium",soil_potassium);		
	request.setAttribute("soil_nitrogen",soil_nitrogen);		
	request.setAttribute("soil_phoisphers",soil_phoisphers);		
	request.setAttribute("distance_from_eq",distance_from_eq);		
	request.setAttribute("himidity_low",himidity_low);		
	request.setAttribute("himidity_high",himidity_high);		
	request.setAttribute("temp_low",temp_low);		
	request.setAttribute("temp_high",temp_high);		
	request.setAttribute("lux_low",lux_low);		
	request.setAttribute("lux_high",lux_high);		
	request.setAttribute("height_low",height_low);		
	request.setAttribute("height_high",height_high);		
	request.setAttribute("soil_ec_low",soil_ec_low);		
	request.setAttribute("soil_ec_high",soil_ec_high);		
	request.setAttribute("soil_moisture_low",soil_moisture_low);		
	request.setAttribute("soil_moisture_high",soil_moisture_high);		
	request.setAttribute("ph_low",ph_low);		
	request.setAttribute("ph_high",ph_high);		
	request.setAttribute("soil_potassium_low",soil_potassium_low);		
	request.setAttribute("soil_potassium_high",soil_potassium_high);		
	request.setAttribute("soil_nitrogen_low",soil_nitrogen_low);		
	request.setAttribute("soil_nitrogen_high",soil_nitrogen_high);		
	request.setAttribute("soil_phoisphers_low",soil_phoisphers_low);		
	request.setAttribute("soil_phoisphers_high",soil_phoisphers_high);		
	request.setAttribute("distance_from_eq_low",distance_from_eq_low);		
	request.setAttribute("distance_from_eq_high",distance_from_eq_high);
	
	System.out.println("test bitch last phase");

		RequestDispatcher laplis=request.getRequestDispatcher("more_info.jsp");
		
		System.out.println("info page requested");
	    laplis.forward(request, response);
		
	      
	
	}

}

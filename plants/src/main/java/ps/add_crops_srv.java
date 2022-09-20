package ps;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class add_crops_srv
 */
@WebServlet("/add_crops_srv")
public class add_crops_srv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String crop_name= request.getParameter("crop_name");
		
		
		String humidity_min = request.getParameter("humidity-min");
		String humidity_max = request.getParameter("humidity-max");
		
		
		String temprature_min= request.getParameter("temprature-min");
		String temprature_max= request.getParameter("temprature-max");
		
		
		String lux_min= request.getParameter("lux-min");
		String lux_max= request.getParameter("lux-max");
		
		
		String height_min= request.getParameter("height-min");
		String height_max= request.getParameter("height-max");
		
		
		String soil_ec_min= request.getParameter("soil_ec-min");
		String soil_ec_max= request.getParameter("soil_ec-max");
		
		
		String soil_moisture_min= request.getParameter("soil_moisture-min");
		String soil_moisture_max= request.getParameter("soil_moisture-max");
		
		
		String soil_ph_min= request.getParameter("ph-min");
		String soil_ph_max= request.getParameter("ph-max");
		
		
		String soil_potassium_min= request.getParameter("potassium-min");
		String soil_potassium_max= request.getParameter("potassium-max");
		
		String soil_nitrogen_min= request.getParameter("nitrogen-min");
		String soil_nitrogen_max= request.getParameter("nitrogen-max");
		
		
		String soil_phospherous_min= request.getParameter("phosoheruss-min");
		String soil_phospherous_max= request.getParameter("phosoheruss-max");
		
		
		String distance_from_eq_min= request.getParameter("distancefrom-eq-min");
		String distance_from_eq_max= request.getParameter("distancefrom-eq-max");
		
		
		String image_url= request.getParameter("image_url");
		
		
		String username="root";
		String password="#Karunarathna2044";
		String url="jdbc:mysql://127.0.0.1:3306/plant_suggestion";
		
		String get_row= "SELECT COUNT(*) FROM plant_suggestion.plants";
		
		int crop_countz = 0;
		
		
try {
			
			System.out.println("try");
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con2=DriverManager.getConnection(url, username, password);
			Statement crop_count= con2.createStatement();
			
			
			ResultSet cntz=crop_count.executeQuery(get_row);
			if(cntz.next())
			{
				
				  
				crop_countz=cntz.getInt(1)+1;
				  
				
				  
			      
				 
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		String insert_data = "INSERT INTO plant_suggestion.plants VALUES ('"+crop_countz+"','"+crop_name+"','"+humidity_min+"','"+humidity_max+"','"+temprature_min+"','"+temprature_max+"','"+lux_min+"','"+lux_max+"','"+height_min+"','"+height_max+"','"+soil_ec_min+"','"+soil_ec_max+"','"+soil_moisture_min+"','"+soil_moisture_max+"','"+soil_ph_min+"','"+soil_ph_max+"','"+soil_potassium_min+"','"+soil_potassium_max+"','"+soil_nitrogen_min+"','"+soil_nitrogen_max+"','"+soil_phospherous_min+"','"+soil_phospherous_max+"','"+distance_from_eq_min+"','"+distance_from_eq_max+"','"+image_url+"') ;";  // insert manual entries 
		
			
try {
			
			System.out.println("try");
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con1=DriverManager.getConnection(url, username, password);
			Statement crop_insert= con1.createStatement();
			
			
			crop_insert.executeUpdate(insert_data);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		// experiment to page neviagte mates 
       request.getRequestDispatcher("done.jsp");
	}

}

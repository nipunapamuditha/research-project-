package ps;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class manual_inputs_srv
 */
@WebServlet("/manual_inputs_srv")
public class manual_inputs_srv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String humidity= request.getParameter("humidity");
		String temprature= request.getParameter("temprature");
		String lux= request.getParameter("lux");
		String height= request.getParameter("altitude");
		String soil_ec= request.getParameter("soil_eletrical_conductivity");
		String soil_moisture= request.getParameter("soil_moisture");
		String soil_ph= request.getParameter("PH");
		String soil_potassium= request.getParameter("soil_potassium");
		String soil_nitrogen= request.getParameter("soil_nitrogen");
		String soil_phospherous= request.getParameter("phosphers");
		String distance_from_eq= request.getParameter("distance_from_equator");
		
		String username="root";
		String password="#Karunarathna2044";
		String url="jdbc:mysql://127.0.0.1:3306/plant_suggestion";
		
		String delete_existing = "TRUNCATE TABLE plant_suggestion.current_condition;";   // remove existing values 
		String insert_data = "INSERT INTO plant_suggestion.current_condition VALUES ('1','"+humidity+"','"+temprature+"','"+lux+"','"+height+"','"+soil_ec+"','"+soil_moisture+"','"+soil_ph+"','"+soil_potassium+"','"+soil_nitrogen+"','"+soil_phospherous+"','"+distance_from_eq+"' );";  // insert manual entries 
		
		// experiment phase 
		
try {
			
			System.out.println("try");
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con1=DriverManager.getConnection(url, username, password);
			Statement manual_insert= con1.createStatement();
			
			manual_insert.executeUpdate(delete_existing);
			
			manual_insert.executeUpdate(insert_data);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	// rest is copied from the index to suggestions sections

		
All_main_functions.retrive_current_enviroment_and_soil_conditions();

List<plant_details> best5=All_main_functions.get_suggestions();

System.out.print("finisedh execulting the fucntion");

plant_details pl1,pl2,pl3,pl4,pl5;

pl1=best5.get(0);
pl2=best5.get(1);
pl3=best5.get(2);
pl4=best5.get(3);
pl5=best5.get(4);

pl1.print_details();
pl2.print_details();
pl3.print_details();


request.setAttribute("plant1",pl1);
request.setAttribute("plant2",pl2);
request.setAttribute("plant3",pl3);
request.setAttribute("plant4",pl4);
request.setAttribute("plant5",pl5);

request.setAttribute("plt",best5);
 
RequestDispatcher laplist=request.getRequestDispatcher("card.jsp");
laplist.forward(request, response);

		
	}

}

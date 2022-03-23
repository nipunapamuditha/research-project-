package ps;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;




public class All_main_functions {
	
	// vales of enviroemt 
	
	
	//get vales from database and create object which is current environment and  conditions 

	public static void retrive_current_enviroment_and_soil_conditions()
	{
		System.out.println("Im hear mates");
		
		//empty envirment values whicll will asigned values once data is recived from database 
		
		 int himidity = 0;
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
		 
		 //plant condition veriables for geting initial requirements 
		 
		 String crop_name;
		 
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
		 
		 //plant count veriable 
		 int plant_count = 0;

		// mysql login credentials 
		
		String username="root";
		String password="#Karunarathna2044";
		String url="jdbc:mysql://findlaptop.cjhrwevkqni3.us-east-2.rds.amazonaws.com:3306";
		String get_current_env = "select * from plant_suggestion.current_condition where ID=";
		
		try {
			
			System.out.println("try");
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con1=DriverManager.getConnection(url, username, password);
			Statement get_current_env_veriables= con1.createStatement();
			
			ResultSet env_veriables= get_current_env_veriables.executeQuery(get_current_env);
			
			if(env_veriables.next())
			{
				
				
				  himidity=Integer.parseInt(env_veriables.getString(2));
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
		
		current_soil_condition csc = new current_soil_condition(himidity, temp, lux, height, soil_ec, soil_moisture, ph, soil_potassium, soil_nitrogen, soil_phoisphers, distance_from_eq);
	
		//check weatehr data is retriving or not 
		System.out.print(lux);
		System.out.print(csc.distance_from_eq_0_1000);
		
	//puting plants required conditions in ranges which we created 
		
		String get_plants_required_conditions  = "select * from plant_suggestion.plants where WHERE ID='"+plant_count+"'";
		
		for ( plant_count = 0; plant_count < 30; plant_count++) {
			  
			
		
		try {
			
			System.out.println("try");
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con2=DriverManager.getConnection(url, username, password);
			Statement get_current_env_veriables= con2.createStatement();
			
			
			
			ResultSet plant_veriables= get_current_env_veriables.executeQuery(get_current_env);
			
			if(plant_veriables.next())
			{
				  crop_name=plant_veriables.getString(2);
				
				  himidity_low=Integer.parseInt(plant_veriables.getString(2));
				  himidity_high=Integer.parseInt(plant_veriables.getString(3));
				  
				  temp_low=Integer.parseInt(plant_veriables.getString(4));
				  temp_high=Integer.parseInt(plant_veriables.getString(5));
				  
				  lux_low=Integer.parseInt(plant_veriables.getString(6));
				  lux_high=Integer.parseInt(plant_veriables.getString(7));
				  
				  
				  height_low=Integer.parseInt(plant_veriables.getString(7));
				  height_high=Integer.parseInt(plant_veriables.getString(8));
				  
				  soil_ec_low=Integer.parseInt(plant_veriables.getString(9));
				  soil_ec_high=Integer.parseInt(plant_veriables.getString(10));
				  
				  soil_moisture_low=Integer.parseInt(plant_veriables.getString(11));
				  soil_moisture_high=Integer.parseInt(plant_veriables.getString(12));
				  
				  ph_low=Integer.parseInt(plant_veriables.getString(13));
				  ph_high=Integer.parseInt(plant_veriables.getString(14));
				  
				  soil_potassium_low=Integer.parseInt(plant_veriables.getString(15));
				  soil_potassium_high=Integer.parseInt(plant_veriables.getString(16));
				  
				  soil_nitrogen_low=Integer.parseInt(plant_veriables.getString(17));
				  soil_nitrogen_high=Integer.parseInt(plant_veriables.getString(18));
				  
				  soil_phoisphers_low=Integer.parseInt(plant_veriables.getString(19));
				  soil_phoisphers_high=Integer.parseInt(plant_veriables.getString(20));
				  
				  distance_from_eq_low=Integer.parseInt(plant_veriables.getString(21));
				  distance_from_eq_high=Integer.parseInt(plant_veriables.getString(22));

				 
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	
		}// for loop end coma
	}
}

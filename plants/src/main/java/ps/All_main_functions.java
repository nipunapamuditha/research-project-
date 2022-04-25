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
		 
		 //plant condition variables for getting initial requirements 
		 
		 String crop_name = null;
		 
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
		 
		 
		 //binary tables values 
		 
		int plant_humidity =0 ;
		int plant_temp =0 ;
		int plant_lux =0 ;
		int plant_height =0 ;
		int plant_soil_ec =0 ;
		int plant_moisture =0 ;
		int plant_ph =0 ;
		int plant_potassium =0 ;
		int plant_nitrogen =0 ;
		int plant_phosphers =0 ;
	
		int plant_dis_eq =0 ;
		 
		 //plant count veriable 
		 int plant_count = 0;
		 
		 int plant_score=0;

		// mysql login credentials 
		
		
		String username="root";
		String password="#Karunarathna2044";
		String url="jdbc:mysql://findlaptop.cjhrwevkqni3.us-east-2.rds.amazonaws.com:3306";
		String get_current_env = "select * from plant_suggestion.current_condition";
		
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
				 
				  System.out.println(himidity);
				  System.out.println("bedore this humidity");
			}
			
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		current_soil_condition csc  = new current_soil_condition(himidity, temp, lux, height, soil_ec, soil_moisture, ph, soil_potassium, soil_nitrogen, soil_phoisphers, distance_from_eq);
	
		//check weather data is retrieving or not 
		System.out.print(lux);
		System.out.print(csc.distance_from_eq_0_1000);
		
	//Putting plants required conditions in ranges which we created 
		
		
		
		
		
		
		
		
			  
			
		
		try {
			
			System.out.println("try"); 
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con2=DriverManager.getConnection(url, username, password);
			Statement get_pak= con2.createStatement();
			
			
			
			for ( plant_count = 1; plant_count < 4; plant_count++) {
			
				String get_plants_required_conditions  = "select * from plant_suggestion.plants where ID='"+plant_count+"'";
				plant_score =0;
				
				 plant_humidity =0 ;
				 plant_temp =0 ;
				 plant_lux =0 ;
				 plant_height =0 ;
				 plant_soil_ec =0 ;
				 plant_moisture =0 ;
				 plant_ph =0 ;
				 plant_potassium =0 ;
				 plant_nitrogen =0 ;
				 plant_phosphers =0 ;
				
				
			ResultSet plant_veriables= get_pak.executeQuery(get_plants_required_conditions);
			
			if(plant_veriables.next())
			{         
				System.out.println("waaaaa ttttaaaa ffaaaak ave naaaathooooooooo 1 ");
				  crop_name=plant_veriables.getString(1);
				  System.out.println("                  crop name 2          ");
				  System.out.println(crop_name);
				  System.out.println("   name over      waaaaa ttttaaaa ffaaaak ave naaaathooooooooo 2");
				
				  himidity_low=Integer.parseInt(plant_veriables.getString(2));
				  himidity_high=Integer.parseInt(plant_veriables.getString(3));
				  
				  System.out.println("himidity 2");
				  System.out.println(himidity_low);
				  System.out.println("himidity 3");
				  // update binary table 
				   
				  if((10 < himidity_low)&&(himidity_high < 35))
					{
					  plant_humidity =  8;                                   		
					}
					if((35 < himidity_low)&&(himidity_high < 55))
					{
						plant_humidity =   4;
					}
					if((55 < himidity_low)&&(himidity_high < 80))
					{
						plant_humidity =   2;
					}
					if((80 < himidity_low)&&(himidity_high < 100))
					{
						plant_humidity =   1;
					}
					
					
					//2nd
					if((10 < himidity_low)&&(himidity_high < 55))
					{
					  plant_humidity = 12;                                   		
					}
					if((10 < himidity_low)&&(himidity_high < 80))
					{
						plant_humidity = 14;
					}
					if((10 < himidity_low)&&(himidity_high < 100))
					{
						plant_humidity = 15;
					}
					
					//3rd
					if((35 < himidity_low)&&(himidity_high < 80))
					{
						plant_humidity = 6;
					}
					if((35 < himidity_low)&&(himidity_high < 100))
					{
						plant_humidity = 7;
					}
					
					if((55 < himidity_low)&&(himidity_high < 100))
					{
						plant_humidity = 3;
					}
					
					
				
					System.out.println("\n total humidity score is "+plant_humidity+"\n");
				  
				  temp_low=Integer.parseInt(plant_veriables.getString(4));
				  temp_high=Integer.parseInt(plant_veriables.getString(5));
				  
				//   update binary table  bitxx
				  
				  if((5 < temp_low)&&(temp_high < 15))
					{
					  plant_temp =  8;
					}
					if((15 < temp_low)&&(temp_high < 25))
					{
						plant_temp =  4;
					}
					if((25 < temp_low)&&(temp_high < 35))
					{
						plant_temp =  2;
					}
					if((35 < temp_low)&&(temp_high < 44))
					{
						plant_temp =  1;
					}
					
					//2nd
					 if((5 < temp_low)&&(temp_high < 25))
						{
						  plant_temp = 12;
						}
					 if((5 < temp_low)&&(temp_high < 35))
						{
						  plant_temp = 14;
						}
					 if((5 < temp_low)&&(temp_high < 44))
						{
						  plant_temp = 15;
						}
					 //3/rd
					 if((15 < temp_low)&&(temp_high < 35))
						{
							plant_temp =  6;
						}
					 if((15 < temp_low)&&(temp_high < 44))
						{
							plant_temp =  7;
						}
					 if((25 < temp_low)&&(temp_high < 44))
						{
							plant_temp =  3;
						}
				  
				  lux_low=Integer.parseInt(plant_veriables.getString(6));
				  lux_high=Integer.parseInt(plant_veriables.getString(7));
				  
				// update binary table 
				  
				  if((20 < lux_low)&&(lux_high < 30))
					{
					  plant_lux =  8;
					}
					if((30 < lux_low)&&(lux_high < 40))
					{
						plant_lux =  4;
					}
					if((40 < lux_low)&&(lux_high < 60))
					{
						plant_lux =  2;
					}
					if((60 < lux_low)&&(lux_high < 95))
					{
						plant_lux =  1;
					}
				  
					//2nd
					 if((20 < lux_low)&&(lux_high < 40))
						{
						  plant_lux =  12;
						}
					 if((20 < lux_low)&&(lux_high < 60))
						{
						  plant_lux =  14;
						}
					 if((20 < lux_low)&&(lux_high < 95))
						{
						  plant_lux =  15;
						}
					 
					 //3rd
					 if((30 < lux_low)&&(lux_high < 60))
						{
							plant_lux =  6;
						}
					 if((30 < lux_low)&&(lux_high < 95))
						{
							plant_lux =  7;
						}
				  //3th
					 
					 if((40 < lux_low)&&(lux_high < 95))
						{
							plant_lux =  3;
						}
					 
				  height_low=Integer.parseInt(plant_veriables.getString(7));
				  height_high=Integer.parseInt(plant_veriables.getString(8));
				  
				// update binary table 
				  
				  if((20 < height_low)&&(height_high < 30))
					{
					  plant_height =  8;
					}
					if((30 < height_low)&&(height_high < 40))
					{
						plant_height =  4;
					}
					if((40 < height_low)&&(height_high < 60))
					{
						plant_height =  2;
					}
					if((60 < height_low)&&(height_high < 95))
					{
						plant_height =  1;
					}

					 if((20 < height_low)&&(height_high < 40))
						{
						  plant_height =  12;
						}
					 if((20 < height_low)&&(height_high < 60))
						{
						  plant_height = 14;
						}
					 if((20 < height_low)&&(height_high < 95))
						{
						  plant_height =  15;
						}
				  
					 if((30 < height_low)&&(height_high < 60))
						{
							plant_height =  6;
						}
					 if((30 < height_low)&&(height_high < 95))
						{
							plant_height =  7;
						}
					 
					 if((40 < height_low)&&(height_high < 95))
						{
							plant_height =  3;
						}
					 
				  soil_ec_low=Integer.parseInt(plant_veriables.getString(9));
				  soil_ec_high=Integer.parseInt(plant_veriables.getString(10));
				  
				// update binary table 
				  if((110 < soil_ec_low)&&(soil_ec_high < 200))
					{
					  plant_soil_ec = 8;
					}
					if((200 < soil_ec_low)&&(soil_ec_high < 300))
					{
						plant_soil_ec = 4;
					}
					if((300 < soil_ec_low)&&(soil_ec_high < 400))
					{
						plant_soil_ec = 2;
					}
					if((400 < soil_ec_low)&&(soil_ec_high < 500))
					{
						plant_soil_ec = 1;
					}
					
					if((110 < soil_ec_low)&&(soil_ec_high < 300))
					{
					  plant_soil_ec = 12;
					}
					if((110 < soil_ec_low)&&(soil_ec_high < 400))
					{
					  plant_soil_ec = 14;
					}
					if((110 < soil_ec_low)&&(soil_ec_high < 500))
					{
					  plant_soil_ec = 15;
					}
					
					if((200 < soil_ec_low)&&(soil_ec_high < 400))
					{
						plant_soil_ec = 6;
					}
					if((200 < soil_ec_low)&&(soil_ec_high < 500))
					{
						plant_soil_ec = 7;
					}
					if((300 < soil_ec_low)&&(soil_ec_high < 500))
					{
						plant_soil_ec = 3;
					}
				  
				  
				  
				  soil_moisture_low=Integer.parseInt(plant_veriables.getString(11));
				  soil_moisture_high=Integer.parseInt(plant_veriables.getString(12));
				  
				  
				// update binary table 
				  
				  if((0 < soil_moisture_low)&&(soil_moisture_high < 10))
					{
					  plant_moisture =  8;
					}
					if((10 < soil_moisture_low)&&(soil_moisture_high < 25))
					{
						plant_moisture =  4;
					}
					if((25 < soil_moisture_low)&&(soil_moisture_high < 45))
					{
						plant_moisture =  2;
					}
					if((45 < soil_moisture_low)&&(soil_moisture_high < 75))
					{
						plant_moisture =  1;
					}
				  
					 if((0 < soil_moisture_low)&&(soil_moisture_high < 25))
						{
						  plant_moisture =  12;
						}
					 if((0 < soil_moisture_low)&&(soil_moisture_high < 45))
						{
						  plant_moisture =  14;
						}
					 if((0 < soil_moisture_low)&&(soil_moisture_high < 75))
						{
						  plant_moisture =  15;
						}
				  
					 if((10 < soil_moisture_low)&&(soil_moisture_high < 45))
						{
							plant_moisture =  6;
						}
					 if((10 < soil_moisture_low)&&(soil_moisture_high < 75))
						{
							plant_moisture =  7;
						}
					 
					 if((25 < soil_moisture_low)&&(soil_moisture_high < 75))
						{
							plant_moisture =  3;
						}
					 
					 
				  ph_low=Integer.parseInt(plant_veriables.getString(13));
				  ph_high=Integer.parseInt(plant_veriables.getString(14));
				  
				  
				// update binary table 
				  
				  if((0 < ph_low)&&(ph_high < 55))
					{
					  plant_ph =  8;
					}
					if((55 < ph_low)&&(ph_high < 65))
					{
						plant_ph =  4;
					}
					if((65 < ph_low)&&(ph_high < 75))
					{
						plant_ph = 2;
					}
					if((78 < ph_low)&&(ph_high < 85))
					{
						plant_ph = 1 ;
					}
					
					 if((0 < ph_low)&&(ph_high < 65))
						{
						  plant_ph =  12;
						}
					 if((0 < ph_low)&&(ph_high < 75))
						{
						  plant_ph =  14;
						}
					 if((0 < ph_low)&&(ph_high < 85))
						{
						  plant_ph =  15;
						}
					 
					 if((55 < ph_low)&&(ph_high < 75))
						{
							plant_ph =  6;
						}
					 if((55 < ph_low)&&(ph_high < 85))
						{
							plant_ph =  7;
						}
				
					 if((65 < ph_low)&&(ph_high < 85))
						{
							plant_ph = 3 ;
						}
				  
				  soil_potassium_low=Integer.parseInt(plant_veriables.getString(15));
				  soil_potassium_high=Integer.parseInt(plant_veriables.getString(16));
				  
				// update binary table 
				  
				  if((10 < soil_potassium_low)&&(soil_potassium_high < 20))
					{
					  plant_potassium =   8;
					}
					if((20 < soil_potassium_low)&&(soil_potassium_high < 40))
					{
						plant_potassium =  4;
					}
					if((40 < soil_potassium_low)&&(soil_potassium_high < 80))
					{
						plant_potassium = 2;
					}
					if((80 < soil_potassium_low)&&(soil_potassium_high < 120))
					{
						plant_potassium = 1 ;
						
					}
				  
					if((10 < soil_potassium_low)&&(soil_potassium_high < 40))
					{
					  plant_potassium =   12;
					}
					if((10 < soil_potassium_low)&&(soil_potassium_high < 80))
					{
					  plant_potassium =   14;
					}
					if((10 < soil_potassium_low)&&(soil_potassium_high < 120))
					{
					  plant_potassium =   15;
					}
					
					if((20 < soil_potassium_low)&&(soil_potassium_high < 80))
					{
						plant_potassium =  6;
					}
					if((20 < soil_potassium_low)&&(soil_potassium_high < 120))
					{
						plant_potassium =  7;
					}
					
					if((40 < soil_potassium_low)&&(soil_potassium_high < 120))
					{
						plant_potassium = 3;
					}
				  soil_nitrogen_low=Integer.parseInt(plant_veriables.getString(17));
				  soil_nitrogen_high=Integer.parseInt(plant_veriables.getString(18));
				  
				  if((10 < soil_nitrogen_low)&&(soil_nitrogen_high < 25))
					{
					  plant_nitrogen =  8  ;
					}
					if((25 < soil_nitrogen_low)&&(soil_nitrogen_high < 50))
					{
						plant_nitrogen =  4  ;
					}
					if((50 < soil_nitrogen_low)&&(soil_nitrogen_high < 75))
					{
						plant_nitrogen =  2  ;
					}
					if((75 < soil_nitrogen_low)&&(soil_nitrogen_high < 100))
					{
						plant_nitrogen =  1  ;
					} 
				  
					if((10 < soil_nitrogen_low)&&(soil_nitrogen_high < 50))
					{
					  plant_nitrogen =  12;
					}
					if((10 < soil_nitrogen_low)&&(soil_nitrogen_high < 75))
					{
					  plant_nitrogen =  14;
					}
					if((10 < soil_nitrogen_low)&&(soil_nitrogen_high < 100))
					{
					  plant_nitrogen =  15;
					}
					
					if((25 < soil_nitrogen_low)&&(soil_nitrogen_high < 75))
					{
						plant_nitrogen =  6  ;
					}
					if((25 < soil_nitrogen_low)&&(soil_nitrogen_high < 100))
					{
						plant_nitrogen =  7  ;
					}
					if((50 < soil_nitrogen_low)&&(soil_nitrogen_high < 100))
					{
						plant_nitrogen =  3  ;
					}
					
				  soil_phoisphers_low=Integer.parseInt(plant_veriables.getString(19));
				  soil_phoisphers_high=Integer.parseInt(plant_veriables.getString(20));
				  
				// update binary table 
				  
				  if((10 < soil_phoisphers_low)&&(soil_phoisphers_high < 25))
					{
					  plant_phosphers =  8 ;
					}
					if((25 < soil_phoisphers_low)&&(soil_phoisphers_high < 40))
					{
						plant_phosphers = 4 ;
					}
					if((40 < soil_phoisphers_low)&&(soil_phoisphers_high < 70))
					{
						plant_phosphers =  2 ;
					}
					if((70 < soil_phoisphers_low)&&(soil_phoisphers_high < 110))
					{
						plant_phosphers =  1 ;
					}
					
					 if((10 < soil_phoisphers_low)&&(soil_phoisphers_high < 40))
						{
						  plant_phosphers =  12 ;
						}
					 if((10 < soil_phoisphers_low)&&(soil_phoisphers_high < 75))
						{
						  plant_phosphers =  14 ;
						}
					 if((10 < soil_phoisphers_low)&&(soil_phoisphers_high < 110))
						{
						  plant_phosphers =  15 ;
						}
					
					 if((25 < soil_phoisphers_low)&&(soil_phoisphers_high < 75))
						{
							plant_phosphers = 6 ;
						}
					 if((25 < soil_phoisphers_low)&&(soil_phoisphers_high < 110))
						{
							plant_phosphers = 7 ;
						}
				  
					 if((40 < soil_phoisphers_low)&&(soil_phoisphers_high < 110))
						{
							plant_phosphers =  3 ;
						}
				  
				  distance_from_eq_low=Integer.parseInt(plant_veriables.getString(21));
				  distance_from_eq_high=Integer.parseInt(plant_veriables.getString(22));
				  
				 // add data to plants binary table 
				  
				  if((0 < distance_from_eq_low)&&(distance_from_eq_high < 1000))
					{
					  plant_dis_eq =  8 ;
					}
					if((1000 < distance_from_eq_low)&&(distance_from_eq_high < 2000))
					{
						plant_dis_eq =  4 ;
					}
					if((2000 < distance_from_eq_low)&&(distance_from_eq_high < 3000))
					{
						plant_dis_eq =  2 ;
					}
					if((3000 < distance_from_eq_low)&&(distance_from_eq_high < 4000))
					{
						plant_dis_eq =  1 ;
					}
					
					if((0 < distance_from_eq_low)&&(distance_from_eq_high < 2000))
					{
					  plant_dis_eq =  12 ;
					}
					if((0 < distance_from_eq_low)&&(distance_from_eq_high < 3000))
					{
					  plant_dis_eq =  14 ;
					}
					if((0 < distance_from_eq_low)&&(distance_from_eq_high < 4000))
					{
					  plant_dis_eq =  15 ;
					}
			       
					if((1000 < distance_from_eq_low)&&(distance_from_eq_high < 3000))
					{
						plant_dis_eq =  6 ;
					}
					if((1000 < distance_from_eq_low)&&(distance_from_eq_high < 4000))
					{
						plant_dis_eq =  7 ;
					}
					
					if((2000 < distance_from_eq_low)&&(distance_from_eq_high < 4000))
					{
						plant_dis_eq =  3 ;
					}
			
			//////////////////////////// Giving scores to plants //////////////////////////////////////////////////////
					
					
					// humidity score calculation 
					
					
					if(csc.himidity_10_35==1)
					{
						 if((plant_humidity == 8) || (plant_humidity == 12)|| (plant_humidity == 14)|| (plant_humidity == 15))
						 {
							 plant_score++;
						 }
					}
					
					if(csc.himidity_35_55==1)
					{
						if((plant_humidity == 4) || (plant_humidity == 6)|| (plant_humidity == 7)|| (plant_humidity == 12)|| (plant_humidity == 14)|| (plant_humidity == 15))
						 {
							plant_score++;
						 }
					}
					
					if(csc.himidity_55_80==1)
					{
						if((plant_humidity == 2) || (plant_humidity == 3)|| (plant_humidity == 6)|| (plant_humidity == 7)|| (plant_humidity == 14)|| (plant_humidity == 15))
						 {
							plant_score++; 
						 }
					}
					
					if(csc.himidity_80_100==1)
					{
						 if((plant_humidity == 1) || (plant_humidity == 3)|| (plant_humidity == 7)|| (plant_humidity == 15))
						 {
							 plant_score++;
						 }
					}
					
					
					
					
					
					/// temprature score calculation 
					
					if(csc.temp_5_15==1)
					{
						 if((plant_temp == 8) || (plant_temp == 12)|| (plant_temp == 14)|| (plant_temp == 15))
						 {
							 plant_score++;
						 }
					}
					
					if(csc.temp_15_25==1)
					{
						if((plant_temp == 4) || (plant_temp == 6)|| (plant_temp == 7)|| (plant_temp == 12)|| (plant_temp == 14)|| (plant_temp == 15))
						 {
							plant_score++;
						 }
					}
					
					if(csc.temp_25_35==1)
					{
						if((plant_temp == 2) || (plant_temp == 3)|| (plant_temp == 6)|| (plant_temp == 7)|| (plant_temp == 14)|| (plant_temp == 15))
						 {
							plant_score++; 
						 }
					}
					
					if(csc.temp_35_44==1)
					{
						 if((plant_temp == 1) || (plant_temp == 3)|| (plant_temp == 7)|| (plant_temp == 15))
						 {
							 plant_score++;
						 }
					}
			
					
					// calculate lux score 
					
					if(csc.lux_20_30==1)
					{
						 if((plant_lux == 8) || (plant_lux == 12)|| (plant_lux == 14)|| (plant_lux == 15))
						 {
							 plant_score++;
						 }
					}
					
					if(csc.lux_30_40==1)
					{
						if((plant_lux == 4) || (plant_lux == 6)|| (plant_lux == 7)|| (plant_lux == 12)|| (plant_lux == 14)|| (plant_lux == 15))
						 {
							plant_score++;
						 }
					}
					
					if(csc.lux_40_60==1)
					{
						if((plant_lux == 2) || (plant_lux == 3)|| (plant_lux == 6)|| (plant_lux == 7)|| (plant_lux == 14)|| (plant_lux == 15))
						 {
							plant_score++; 
						 }
					}
					
					if(csc.lux_60_95==1)
					{
						 if((plant_lux == 1) || (plant_lux == 3)|| (plant_lux == 7)|| (plant_lux == 15))
						 {
							 plant_score++;
						 }
					}
					
					
					// calculate plant height score 
					
					if(csc.height_5_20==1)
					{
						 if((plant_height == 8) || (plant_height == 12)|| (plant_height == 14)|| (plant_height == 15))
						 {
							 plant_score++;
						 }
					}
					
					if(csc.height_20_100==1)
					{
						if((plant_height == 4) || (plant_height == 6)|| (plant_height == 7)|| (plant_height == 12)|| (plant_height == 14)|| (plant_height == 15))
						 {
							plant_score++;
						 }
					}
					
					if(csc.height_100_500==1)
					{
						if((plant_height == 2) || (plant_height == 3)|| (plant_height == 6)|| (plant_height == 7)|| (plant_height == 14)|| (plant_height == 15))
						 {
							plant_score++; 
						 }
					}
					
					if(csc.height_500_2000==1)
					{
						 if((plant_height == 1) || (plant_height == 3)|| (plant_height == 7)|| (plant_height == 15))
						 {
							 plant_score++;
						 }
					}
					
					// soil EC csore calculation 
					
					if(csc.soil_ec_110_200==1)
					{
						 if((plant_soil_ec == 8) || (plant_soil_ec == 12)|| (plant_soil_ec == 14)|| (plant_soil_ec == 15))
						 {
							 plant_score++;
						 }
					}
					
					if(csc.soil_ec_200_300==1)
					{
						if((plant_soil_ec == 4) || (plant_soil_ec == 6)|| (plant_soil_ec == 7)|| (plant_soil_ec == 12)|| (plant_soil_ec == 14)|| (plant_soil_ec == 15))
						 {
							plant_score++;
						 }
					}
					
					if(csc.soil_ec_300_400==1)
					{
						if((plant_soil_ec == 2) || (plant_soil_ec == 3)|| (plant_soil_ec == 6)|| (plant_soil_ec == 7)|| (plant_soil_ec == 14)|| (plant_soil_ec == 15))
						 {
							plant_score++; 
						 }
					}
					
					if(csc.soil_ec_400_500==1)
					{
						 if((plant_soil_ec == 1) || (plant_soil_ec == 3)|| (plant_soil_ec == 7)|| (plant_soil_ec == 15))
						 {
							 plant_score++;
						 }
					}
					
					
					//calculate plant moisture score 
					
					if(csc.soil_moisture_0_10==1)
					{
						 if((plant_moisture == 8) || (plant_moisture == 12)|| (plant_moisture == 14)|| (plant_moisture == 15))
						 {
							 plant_score++;
						 }
					}
					
					if(csc.soil_moisture_10_25==1)
					{
						if((plant_moisture == 4) || (plant_moisture == 6)|| (plant_moisture == 7)|| (plant_moisture == 12)|| (plant_moisture == 14)|| (plant_moisture == 15))
						 {
							plant_score++;
						 }
					}
					
					if(csc.soil_moisture_25_45==1)
					{
						if((plant_moisture == 2) || (plant_moisture == 3)|| (plant_moisture == 6)|| (plant_moisture == 7)|| (plant_moisture == 14)|| (plant_moisture == 15))
						 {
							plant_score++; 
						 }
					}
					
					if(csc.soil_moisture_45_75==1)
					{
						 if((plant_moisture == 1) || (plant_moisture == 3)|| (plant_moisture == 7)|| (plant_moisture == 15))
						 {
							 plant_score++;
						 }
					}
					
					
					// soil PH levels 
					if(csc.ph_0_55==1)
					{
						 if((plant_ph == 8) || (plant_ph == 12)|| (plant_ph == 14)|| (plant_ph == 15))
						 {
							 plant_score++;
						 }
					}
					
					if(csc.ph_55_65==1)
					{
						if((plant_ph == 4) || (plant_ph == 6)|| (plant_ph == 7)|| (plant_ph == 12)|| (plant_ph == 14)|| (plant_ph == 15))
						 {
							plant_score++;
						 }
					}
					
					if(csc.ph_65_75==1)
					{
						if((plant_ph == 2) || (plant_ph == 3)|| (plant_ph == 6)|| (plant_ph == 7)|| (plant_ph == 14)|| (plant_ph == 15))
						 {
							plant_score++; 
						 }
					}
					
					if((csc.ph_78_85==1)||(csc.ph_85_100==1))
					{
						 if((plant_ph == 1) || (plant_ph == 3)|| (plant_ph == 7)|| (plant_ph == 15))
						 {
							 plant_score++;
						 }
					}
			
					// calculate soil potassium score 
					
					if(csc.soil_potassium_10_20==1)
					{
						 if((plant_potassium == 8) || (plant_potassium == 12)|| (plant_potassium == 14)|| (plant_potassium == 15))
						 {
							 plant_score++;
						 }
					}
					
					if(csc.soil_potassium_20_40==1)
					{
						if((plant_potassium == 4) || (plant_potassium == 6)|| (plant_potassium == 7)|| (plant_potassium == 12)|| (plant_potassium == 14)|| (plant_potassium == 15))
						 {
							plant_score++;
						 }
					}
					
					if(csc.soil_potassium_40_80==1)
					{
						if((plant_potassium == 2) || (plant_potassium == 3)|| (plant_potassium == 6)|| (plant_potassium == 7)|| (plant_potassium == 14)|| (plant_potassium == 15))
						 {
							plant_score++; 
						 }
					}
					
					if(csc.soil_potassium_80_120==1)
					{
						 if((plant_potassium == 1) || (plant_potassium == 3)|| (plant_potassium == 7)|| (plant_potassium == 15))
						 {
							 plant_score++;
						 }
					}
					
					
				// plant nitrogen score 
					
					if(csc.soil_nitrogen_10_25==1)
					{
						 if((plant_nitrogen == 8) || (plant_nitrogen == 12)|| (plant_nitrogen == 14)|| (plant_nitrogen == 15))
						 {
							 plant_score++;
						 }
					}
					
					if(csc.soil_nitrogen_25_50==1)
					{
						if((plant_nitrogen == 4) || (plant_nitrogen == 6)|| (plant_nitrogen == 7)|| (plant_nitrogen == 12)|| (plant_nitrogen == 14)|| (plant_nitrogen == 15))
						 {
							plant_score++;
						 }
					}
					
					if(csc.soil_nitrogen_50_75==1)
					{
						if((plant_nitrogen == 2) || (plant_nitrogen == 3)|| (plant_nitrogen == 6)|| (plant_nitrogen == 7)|| (plant_nitrogen == 14)|| (plant_nitrogen == 15))
						 {
							plant_score++; 
						 }
					}
					
					if(csc.soil_nitrogen_75_100==1)
					{
						 if((plant_nitrogen == 1) || (plant_nitrogen == 3)|| (plant_nitrogen == 7)|| (plant_nitrogen == 15))
						 {
							 plant_score++;
						 }
					}
					
			// plane posphorous score calculation
					
					if(csc.soil_phoisphers_10_25==1)
					{
						 if((plant_phosphers == 8) || (plant_phosphers == 12)|| (plant_phosphers == 14)|| (plant_phosphers == 15))
						 {
							 plant_score++;
						 }
					}
					
					if(csc.soil_phoisphers_25_40==1)
					{
						if((plant_phosphers == 4) || (plant_phosphers == 6)|| (plant_phosphers == 7)|| (plant_phosphers == 12)|| (plant_phosphers == 14)|| (plant_phosphers == 15))
						 {
							plant_score++;
						 }
					}
					
					if(csc.soil_phoisphers_40_70==1)
					{
						if((plant_phosphers == 2) || (plant_phosphers == 3)|| (plant_phosphers == 6)|| (plant_phosphers == 7)|| (plant_phosphers == 14)|| (plant_phosphers == 15))
						 {
							plant_score++; 
						 }
					}
					
					if(csc.soil_phoisphers_70_110==1)
					{
						 if((plant_phosphers == 1) || (plant_phosphers == 3)|| (plant_phosphers == 7)|| (plant_phosphers == 15))
						 {
							 plant_score++;
						 }
					}
					
					// disrance score calculator 
					
					if(csc.distance_from_eq_0_1000==1)
					{
						 if((plant_dis_eq == 8) || (plant_dis_eq == 12)|| (plant_dis_eq == 14)|| (plant_dis_eq == 15))
						 {
							 plant_score++;
						 }
					}
					
					if(csc.distance_from_eq_1000_2000==1)
					{
						if((plant_dis_eq == 4) || (plant_dis_eq == 6)|| (plant_dis_eq == 7)|| (plant_dis_eq == 12)|| (plant_dis_eq == 14)|| (plant_dis_eq == 15))
						 {
							plant_score++;
						 }
					}
					
					if(csc.distance_from_eq_2000_3000==1)
					{
						if((plant_dis_eq == 2) || (plant_dis_eq == 3)|| (plant_dis_eq == 6)|| (plant_dis_eq == 7)|| (plant_dis_eq == 14)|| (plant_dis_eq == 15))
						 {
							plant_score++; 
						 }
					}
					
					if(csc.distance_from_eq_3000_4000==1)
					{
						 if((plant_dis_eq == 1) || (plant_dis_eq == 3)|| (plant_dis_eq == 7)|| (plant_dis_eq == 15))
						 {
							 plant_score++;
						 }
					}
					
			////////////////////////////////giving scors finished //////////////////////////////////////////////////////
			} //if condition finish lkine 
			
			String plants_binary  = "INSERT INTO plant_suggestion.plants_binary VALUES ('"+crop_name+"','"+plant_humidity+"','"+plant_temp+"','"+plant_lux+"','"+plant_height+"','"+plant_soil_ec+"','"+plant_moisture+"','"+plant_ph+"','"+plant_potassium+"','"+plant_nitrogen+"','"+plant_phosphers+"','"+plant_dis_eq+"','"+plant_score+"')";
			Statement update_plant_binary= con2.createStatement();
			
			update_plant_binary.executeUpdate(plants_binary);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		

		
	}
		
	public static void compare_plants()
	{
		// get all the values from plants binary table and display them in percentages 
		
	}
	
	
	
}




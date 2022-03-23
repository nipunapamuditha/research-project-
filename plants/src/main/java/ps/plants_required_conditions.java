package ps;

public class plants_required_conditions {

	
	//ranges
	public int himidity_10_35;
	public int himidity_35_55;
	public int himidity_55_80;
	public int himidity_80_100;
	
	
	public int temp_5_15;
	public int temp_15_25;
	public int temp_25_35;
	public int temp_35_44;
	
	public int lux_20_30;
	public int lux_30_40;
	public int lux_40_60;
	public int lux_60_95;
	
	public int height_5_20;
	public int height_20_100;
	public int height_100_500;
	public int height_500_2000;
	
	public int soil_ec_110_200;
	public int soil_ec_200_300;
	public int soil_ec_300_400;
	public int soil_ec_400_500;
	
	public int soil_moisture_0_10;
	public int soil_moisture_10_25;
	public int soil_moisture_25_45;
	public int soil_moisture_45_75;
	
	public int ph_0_55;
	public int ph_55_65;
	public int ph_65_75;
	public int ph_78_85;
	public int ph_85_100;
	
	public int soil_potassium_10_20;
	public int soil_potassium_20_40;
	public int soil_potassium_40_80;
	public int soil_potassium_80_120;
	
	public int soil_nitrogen_10_25;
	public int soil_nitrogen_25_50;
	public int soil_nitrogen_50_75;
	public int soil_nitrogen_75_100;
	
	public int soil_phoisphers_10_25;
	public int soil_phoisphers_25_40;
	public int soil_phoisphers_40_70;
	public int soil_phoisphers_70_110;
	
	public int distance_from_eq_0_1000;
	public int distance_from_eq_1000_2000;
	public int distance_from_eq_2000_3000;
	public int distance_from_eq_3000_4000;
	
	
	//values
	
public  String crop_name;
	
public	 	 int himidity_low =0;
public		 int himidity_high =0;
	  
public		 int temp_low=0;
public		 int temp_high=0;
	  
public		 int lux_low=0;
public		 int lux_high=0;
	  
	  
public		 int height_low=0;
public		 int  height_high=0;
	  
public		 int  soil_ec_low=0;
public		 int soil_ec_high=0;
	  
public		 int soil_moisture_low=0;
public		 int  soil_moisture_high=0;
	  
public		 int  ph_low=0;
public		 int  ph_high=0;
	  
public		 int soil_potassium_low=0;
public		 int  soil_potassium_high=0;
	  
public		 int  soil_nitrogen_low=0;
public		 int  soil_nitrogen_high=0;
	  
public		 int  soil_phoisphers_low=0;
public		 int  soil_phoisphers_high=0;
	  
public		 int  distance_from_eq_low=0;
public		 int  distance_from_eq_high=0;

public int   plant_count =0;

// score given to individual plant based on environt 
public int score =0;


public plants_required_conditions(String crop_name, int himidity_low, int himidity_high, int temp_low, int temp_high,
		int lux_low, int lux_high, int height_low, int height_high, int soil_ec_low, int soil_ec_high,
		int soil_moisture_low, int soil_moisture_high, int ph_low, int ph_high, int soil_potassium_low,
		int soil_potassium_high, int soil_nitrogen_low, int soil_nitrogen_high, int soil_phoisphers_low,
		int soil_phoisphers_high, int distance_from_eq_low, int distance_from_eq_high, int plant_count, int score) {
	
	super();
	this.crop_name = crop_name;
	this.himidity_low = himidity_low;
	this.himidity_high = himidity_high;
	this.temp_low = temp_low;
	this.temp_high = temp_high;
	this.lux_low = lux_low;
	this.lux_high = lux_high;
	this.height_low = height_low;
	this.height_high = height_high;
	this.soil_ec_low = soil_ec_low;
	this.soil_ec_high = soil_ec_high;
	this.soil_moisture_low = soil_moisture_low;
	this.soil_moisture_high = soil_moisture_high;
	this.ph_low = ph_low;
	this.ph_high = ph_high;
	this.soil_potassium_low = soil_potassium_low;
	this.soil_potassium_high = soil_potassium_high;
	this.soil_nitrogen_low = soil_nitrogen_low;
	this.soil_nitrogen_high = soil_nitrogen_high;
	this.soil_phoisphers_low = soil_phoisphers_low;
	this.soil_phoisphers_high = soil_phoisphers_high;
	this.distance_from_eq_low = distance_from_eq_low;
	this.distance_from_eq_high = distance_from_eq_high;
	this.plant_count = plant_count;
	this.score=score;
}


}

package ps;

public class current_soil_condition {
	
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
	
	
	public int himidity;
	public int temp;
	public int lux;
	public int height;
	public int soil_ec;
	public int soil_moisture;
	public int ph;
	public int soil_potassium;
	public int soil_nitrogen;
	public int soil_phoisphers;
	public int distance_from_eq;
	
	
	//constructor 
	
	public current_soil_condition(int himidity, int temp, int lux, int height, int soil_ec, int soil_moisture, int ph,
			int soil_potassium, int soil_nitrogen, int soil_phoisphers, int distance_from_eq) {
		super();
		this.himidity = himidity;
		this.temp = temp;
		this.lux = lux;
		this.height = height;
		this.soil_ec = soil_ec;
		this.soil_moisture = soil_moisture;
		this.ph = ph;
		this.soil_potassium = soil_potassium;
		this.soil_nitrogen = soil_nitrogen;
		this.soil_phoisphers = soil_phoisphers;
		this.distance_from_eq = distance_from_eq;
		
		System.out.println("trying to print from constrictor of current conditions class ");
		//catogorize humidity 
		
		if((10 < himidity)&&(himidity <= 35))
		{
			 himidity_10_35=1;		
		}
		if((35 < himidity)&&(himidity <= 55))
		{
			 himidity_35_55=1;
		}
		if((55 < himidity)&&(himidity <= 80))
		{
			himidity_55_80=1;
		}
		if((80 < himidity)&&(himidity <= 100))
		{
			himidity_80_100=1;
		}
		
		// catogorize temperature 
		
		if((5 < temp)&&(temp <=15))
		{
			temp_5_15=1;
		}
		if((15 < temp)&&(temp <= 25))
		{
			temp_15_25=1;
		}
		if((25 < temp)&&(temp <= 35))
		{
			temp_25_35=1;
		}
		if((35 < temp)&&(temp <= 44))
		{
			temp_35_44=1;
		}
		
		
		//catogorize lux 
		
		if((20 < lux)&&(lux <= 30))
		{
			lux_20_30=1;
		}
		if((30 < lux)&&(lux <= 40))
		{
			lux_30_40=1;
		}
		if((40 < lux)&&(lux <= 60))
		{
			lux_40_60=1;
		}
		if((60 < lux)&&(lux <= 95))
		{
			lux_60_95=1;
		}
		
		//catogoruze altitude
		
		if((5 < height)&&(height <= 20))
		{
			height_5_20=1;
		}
		if((20 < height)&&(height <= 100))
		{
			height_20_100=1;
		}
		if((100 < height)&&(height <= 500))
		{
			height_100_500=1;
		}
		if((500 < height)&&(height <= 2000))
		{
			height_500_2000=1;
		}
		
		//catogrize soil eletrical conductivity 
		
		if((110 < soil_ec)&&(soil_ec <= 200))
		{
			soil_ec_110_200=1;
		}
		if((200 < soil_ec)&&(soil_ec <= 300))
		{
			soil_ec_200_300=1;
		}
		if((300 < soil_ec)&&(soil_ec <= 400))
		{
			soil_ec_300_400=1;
		}
		if((400 < soil_ec)&&(soil_ec <= 500))
		{
			soil_ec_400_500=1;
		}
		
		
		//catogrize soil moisture 
		
		
		if((0 < soil_moisture)&&(soil_moisture <= 10))
		{
			soil_moisture_0_10=1;
		}
		if((10 < soil_moisture)&&(soil_moisture <= 25))
		{
			soil_moisture_0_10=1;
		}
		if((25 < soil_moisture)&&(soil_moisture <= 45))
		{
			soil_moisture_0_10=1;
		}
		if((45 < soil_moisture)&&(soil_moisture <= 75))
		{
			soil_moisture_0_10=1;
		}
	
		// catogrize ph levels 
		
		if((0 < ph)&&(ph <= 55))
		{
			ph_0_55=1;
		}
		if((55 < ph)&&(ph <= 65))
		{
			ph_55_65=1;
		}
		if((65 < ph)&&(ph <= 75))
		{
			ph_65_75=1;
		}
		if((78 < ph)&&(ph <= 85))
		{
			ph_78_85=1;
		}
	
		// catogrize soil potassium 
		
		if((10 < soil_potassium)&&(soil_potassium <= 20))
		{
			soil_potassium_10_20=1;
		}
		if((20 < soil_potassium)&&(soil_potassium <= 40))
		{
			soil_potassium_20_40=1;
		}
		if((40 < soil_potassium)&&(soil_potassium <= 80))
		{
			soil_potassium_40_80=1;
		}
		if((80 < soil_potassium)&&(soil_potassium <= 120))
		{
			soil_potassium_80_120=1;
		}
		
		// soil nitrogen 
		
		if((10 < soil_nitrogen)&&(soil_nitrogen <= 25))
		{
			soil_nitrogen_10_25=1;
		}
		if((25 < soil_nitrogen)&&(soil_nitrogen <= 50))
		{
			soil_nitrogen_25_50=1;
		}
		if((50 < soil_nitrogen)&&(soil_nitrogen <= 75))
		{
			soil_nitrogen_50_75=1;
		}
		if((75 < soil_nitrogen)&&(soil_nitrogen <= 100))
		{
			soil_nitrogen_75_100=1;
		}
		
		
		//Categorize phosphers 
		

		if((10 < soil_phoisphers)&&(soil_phoisphers <= 25))
		{
			soil_phoisphers_10_25=1;
		}
		if((25 < soil_phoisphers)&&(soil_phoisphers <= 40))
		{
			soil_phoisphers_25_40=1;
		}
		if((40 < soil_phoisphers)&&(soil_phoisphers <= 70))
		{
			soil_phoisphers_40_70=1;
		}
		if((70 < soil_phoisphers)&&(soil_phoisphers <= 110))
		{
			soil_phoisphers_70_110=1;
		}
		
		// distance from equator ./.;l
		
		if((0 < distance_from_eq)&&(distance_from_eq <= 1000))
		{
			distance_from_eq_0_1000=1;
		}
		if((1000 < distance_from_eq)&&(distance_from_eq <= 2000))
		{
			distance_from_eq_1000_2000=1;
		}
		if((2000 < distance_from_eq)&&(distance_from_eq <= 3000))
		{
			distance_from_eq_2000_3000=1;
		}
		if((3000 < distance_from_eq)&&(distance_from_eq <= 4000))
		{
			distance_from_eq_3000_4000=1;
		}
		
		
	}
	
	
	

}

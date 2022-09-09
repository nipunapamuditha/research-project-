package ps;

public class plant_details {

	public String name;
	public String image;
	public int score; 
	public String anything;
	
	public plant_details(String name, String image, int score, String anything) {
		super();
		this.name = name;
		this.image = image;
		this.score = score;
		this.anything = anything;
	}

	public String getName() {
		return name;
	}



	public String getImage() {
		return image;
	}


	public int getScore() {
		return score;
	}



	public String getAnything() {
		return anything;
	}

	public void print_details()
	{
		System.out.println("plant details are");
		System.out.println(name);
		System.out.println(score);
		System.out.println("end of details \n");
	}
	
	
	

}

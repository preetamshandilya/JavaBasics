package cars;

public class car1 {
	private String name;
	private String model;
	private String color;
	private boolean street_leagal;
	private int top_speed;
	private String engine_type;
	
	// constructor
	
	public car1(String name, String model,String color,int top_speed,String engine_type) {
		this.name=name;
		this.model=model;
		this.color=color;
		this.top_speed=top_speed;
		this.engine_type=engine_type;
	}
	
	// getters and setters
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	//1
	
	
	
	public String getmodel() {
		return model;
	}
	
	public void setmodel(String model) {
		this.model=model;
	}
	//2
	
	
	
	public String getcolor() {
		return color;
	}
	
	public void setcolor(String color) {
		this.color=color;
	}
	//3
	
	
	
	public int gettop_speed() {
		return top_speed;
	}
	
	public void settop_speed(int top_speed) {
		this.top_speed=top_speed;
	}
	//4
	
	
	
	public String getengine_type() {
		return engine_type;
	}
	
	public void setengine_type(String engine_type) {
		this.engine_type=engine_type;
	}
	//5
	
	
	
	 public void printInfo() {
	      System.out.println("Name: " + name);
	      System.out.println("Model: " + model);
	      System.out.println("Color: " + color);
	      System.out.println("Top Speed(Kms/Hrs): " + top_speed);
	      System.out.println("Engine Type: " + engine_type);
	   }
	 
	 
	 
	 public boolean street_leagal() {
	      return top_speed < 450;
	   }

}







package cars;

public class car1 {
	private String name;  
	private String model;
	private String color;
	private boolean engine_running=false;
	private boolean driver_active=false;
	private int speed=0;
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
	
	// getters and setters --->>>> allow access of private variable
	
	public String getname() {  // getters returns current value of variables
		return name;
	}
	
	public void setname(String name) { // setters modifies it
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
	 
	 public void start_engine() {
		     engine_running=true;
			 driver_active=true;
			 System.out.println("Engine Started!");
		 
	 }
	 
	 public void accelerate(int pace_changed) {
		 if(!engine_running) {
			 System.out.println("Engine not started : can't accelerate!");
			 
		 }
		 
		 else
			 speed+=pace_changed;
		     System.out.println("Accelerating");
		     System.out.println("Current speed is " +speed+ " Kms/Hrs");
		     
		     
	 }
	 
	 public void brake(int pace_changed) {
		 if(!engine_running) {
			 System.out.println("car is not in a motion");
		 }
		 
		 else
			 speed-=pace_changed;
		 	 System.out.println("Brake applied");
		 	 System.out.println("Speed is reduced to " +speed+ " Kms/Hrs");
	 }
	 
	 
	 public boolean driver_status() {
		return driver_active;
	 }
	 
	 
	 public void stop_engine() {
		 	 engine_running=false || speed ==0; 
			 
			 driver_active=false;
			 System.out.println("Engine Stoped");
		 
	 }
	 

}







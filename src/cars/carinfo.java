package cars;

public class carinfo {

	public static void main(String[] args) {
        car1[] cars = new car1[5];
		
		cars[0]=new car1("Bugatti Chiron ","Super Sport", "Black",490,"8.0-liter quad-turbocharged W16 engine");
		
		cars[1]=new car1("Koenigsegg","Jesko Absolut","White",531,"5.0-liter twin-turbocharged V8 engine");
		
		cars[2]=new car1("Hennessey","Venom F5","Dual Tone Black and Orange",500,"6.6-liter twin-turbocharged V8 engine");
		
		cars[3]=new car1("McLaren","SpeedTail","Silver",402,"4.0-liter twin-turbocharged V8 engine and electric motor");
		
		cars[4]=new car1("Porsche","911 GT2 RS","Black",340,"3.8-liter twin-turbocharged flat-six engine");
	
	
	
	for (int i = 0; i < cars.length; i++) {
        cars[i].printInfo();
        System.out.println();
        
        if (cars[i].street_leagal()) {
           System.out.println("You can drive this monster on street mate!");
        } else {
           System.out.println("You can't drive this shit on street mate! ");
        }
        System.out.println();
        
        
        cars[i].start_engine();
        System.out.println("Driver's status : " +cars[i].driver_status());
        
        System.out.println();
        cars[i].accelerate(240);
        System.out.println();
        cars[i].brake(100);
        
        System.out.println();
        
        cars[i].stop_engine();
        System.out.println("Driver's status : " +cars[i].driver_status());
        
        
        
        System.out.println();
        System.out.println();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println();
        System.out.println();
     }
	
	
  }


	}



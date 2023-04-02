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
        if (cars[i].street_leagal()) {
           System.out.println("This car is drivable on street.");
        } else {
           System.out.println("This car is not drivable on street.");
        }
        System.out.println();
     }
  }


	}



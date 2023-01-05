package ie.atu.ooc1labs.lab6classes;

public class Main {
	public static void main(String[] args) {

	
		// Create a new Car object
		Car carObject1 = new Car("Ford", 2.0f, false);
		Car carObject2 = new Car("Nissan", 1.8f, true);
		Car carObject3 = new Car("Kia");
		
//		carObject1.setMake("Ford");
//		carObject1.setEngineSizeLitres(2.0f);
//		carObject1.setEngineRunning(false);
		
//		carObject2.setMake("Nissan");
//		carObject2.setEngineSizeLitres(1.8f);
//		carObject2.setEngineRunning(true);
		
		System.out.println(   carObject1.getMake()     );
		System.out.println(   carObject1.getEngineSizeLitres()     );
		System.out.println(   carObject1.getEngineRunning()     );
		
		System.out.println(   carObject2.getMake()     );
		System.out.println(   carObject2.getEngineSizeLitres()     );
		System.out.println(   carObject2.getEngineRunning()     );
		
		System.out.println(   carObject3.getMake()    );
		
		
		carObject1.carGreatMessage();
		System.out.println(  carObject1.upgradeEngine(3.0f)   );
		System.out.println(  carObject1.getEngineSizeLitres() );
		
		
//		Car carObject3 = new Car("Merc", 2.5f, true);
//		Car carObject4 = new Car("Nissan");
//
//		carObject1.setMake("Ford");
//		carObject1.setEngineSizeLitres(2.2f);
//		carObject1.setEngineRunning(true);
//		carObject1.carGreatMessage();
//		System.out.println("Old engine size = " + carObject1.upgradeEngine(3.0f));
//
//		carObject2.setMake("Kia");
//		carObject2.setEngineSizeLitres(1.8f);
//		carObject2.setEngineRunning(false);
//		carObject2.carGreatMessage();
//
//		System.out.println(carObject1.getMake());
//		System.out.println(carObject1.getEngineSizeLitres());
//		System.out.println(carObject1.getEngineRunning());
//
//		System.out.println(carObject2.getMake());
//		System.out.println(carObject2.getEngineSizeLitres());
//		System.out.println(carObject2.getEngineRunning());
//		
//		System.out.println(carObject3.getMake());
//		System.out.println(carObject3.getEngineSizeLitres());
//		System.out.println(carObject3.getEngineRunning());
//		
//		System.out.println(carObject4.getMake());
//		System.out.println(carObject4.getEngineSizeLitres());
//		System.out.println(carObject4.getEngineRunning());
	}
}

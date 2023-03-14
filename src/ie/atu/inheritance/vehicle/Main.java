package ie.atu.inheritance.vehicle;

public class Main {

	public static void main(String[] args) {
		// Create a Car object
		Car carObject0 = new Car();
		carObject0.setColour("Blue");
		carObject0.setMake("Nissan");
		Car carObject1 = new Car("Red","Ford");
					
		Hatchback hatchbackObject0 = new Hatchback();
		hatchbackObject0.setColour("Orange");
		hatchbackObject0.setMake("VolksWagen");
		hatchbackObject0.setHatchDoorColour("Yellow");
		
		Hatchback hatchbackObject1 = new Hatchback("Purple","Audi","Black");
		
		Motorbike motorbikeObject0 = new Motorbike();
		Motorbike motorbikeObject1 = new Motorbike("Black", 123456);
		
		System.out.println( "Car 0 colours is "  +  carObject0.getColour()    );
		System.out.println( "Car 0 make is "  +  carObject0.getMake()   );

		System.out.println("Hatchback 0 = " + hatchbackObject0.getColour() + 
				" " + hatchbackObject0.getMake() +
				" " + hatchbackObject0.getHatchDoorColour());
		
		System.out.println("Hatchback 1 = " + hatchbackObject1.getColour() + 
				" " + hatchbackObject1.getMake() +
				" " + hatchbackObject1.getHatchDoorColour());
		
		System.out.println("Motorbike 0 : " + motorbikeObject0.getColour() + " " 
		+  motorbikeObject0.getHandleBarID());
		System.out.println("Motorbike 1 : " + motorbikeObject1.getColour() + " " 
		+  motorbikeObject1.getHandleBarID());

	}
}

package ie.atu.polymorphism.overloading.house;

public class Main {

	public static void main(String[] args) {
		
		House houseObject1 = new House();
		houseObject1.info();
		
		// Overloaded constructor:
		House houseObject2 = new House(132); // 132 rooms
	    houseObject2.info();
	    
	    // Overloaded Method
	    houseObject2.info("The White House");
	    
	}

}

package ie.gmit.javalabs.lab9polymorphism.overloading.house;

public class HouseDriver {

	public static void main(String[] args) {
		
		House houseObject1 = new House();
		houseObject1.info();
		
		// Overloaded constructor:
		House houseObject2 = new House(10);
	    houseObject2.info();
	    
	    // Overloaded Method
	    houseObject2.info("Áras an Uachtaráin");
	    
	}

}

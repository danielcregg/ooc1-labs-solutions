package ie.atu.ooc1labs.encapsulation;

public class Main {
	public static void main(String[] args) {
		
		// Create a Dog object
		Dog dogObject1 = new Dog("Rex", 10, "Poodle");
		
		// Setting Dog instance variables
		//dogObject1.setName("Rex");
		//dogObject1.setAge(10);
		
		System.out.println(     dogObject1.getName()   );
		System.out.println(     dogObject1.getAge()    );
		System.out.println(     dogObject1.getBreed()  );
	
	}
}

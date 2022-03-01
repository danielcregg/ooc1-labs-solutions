package ie.gmit.ooc1labs.lab6classes;

public class PersonRunner {

	public static void main(String[] args) {
				
		// Create new person object
		Person personObject1 = new Person();
		
		System.out.println(     personObject1.getWeightKg()     );
		
		Person personObject2 = new Person(81.11f);
		
		Person personObject3 = new Person("Daniel", 87.6f);
		
		System.out.println("Person 3 is " + personObject3.getName()  );
		System.out.println("His weight is " + personObject3.getWeightKg()  );
		
		personObject3.eat(12.5f);
		personObject3.eat(6.3f);
		personObject3.eat(17.7f);
		personObject3.eat(19.999f);
		
		System.out.println("His new weight is " + personObject3.getWeightKg()  );
		
		personObject3.exercise(2);
		personObject3.exercise(5);
		
		System.out.println("His new weight is " + personObject3.getWeightKg()  );
		
		
		System.out.println(     personObject2.getWeightKg()     );
		
		
//		Person personObject2 = new Person(12.765f);
//		Person personObject3 = new Person("John", 87.765f);
//		
//		System.out.println(personObject1.getWeight());
//		personObject1.setWeight(100);
//		personObject1.setName("Billy");
//		System.out.println(personObject1.getWeight());
//		System.out.println(personObject1.getName());
//		// Person 2
//		System.out.println(personObject2.getWeight());
//		
//		// Person 3
//		System.out.println("Person 3 is called " + personObject3.getName());
	} // End Main

} // End Class

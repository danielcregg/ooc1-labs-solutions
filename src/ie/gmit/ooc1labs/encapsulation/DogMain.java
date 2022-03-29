package ie.gmit.ooc1labs.encapsulation;

public class DogMain {

	public static void main(String[] args) {
		// Creating two new dog objects
		Dog dog1 = new Dog();
		Dog dog2 = new Dog("Timmy", 4, "Pitbill");
		Dog dog3 = new Dog("William", 5, "Pug");
		
		System.out.println(       dog1.getName()      );
		System.out.println(       dog1.getAge()       );
		
		System.out.println(       dog2.getName()      );
		System.out.println(       dog2.getAge()       );
		
		// Setting dog1's name to Rex
		dog1.setName("Rex");
		dog1.setAge(29);
		System.out.println(       dog1.getName()      );
		System.out.println(       dog1.getAge()      );
		
		// Setting dog2's name to Bingo
		dog2.setName("Bingo");
		dog2.setAge(10);
		System.out.println(       dog2.getName()      );
		System.out.println(       dog2.getAge()      );
		
		
		dog2.setName("Ted");
		dog2.setAge(21);
		System.out.println(       dog2.getName()      );
		System.out.println(       dog2.getAge()      );
		
		
//		dog1. = "Rex";
//		dog1.age = 2;
//		dog2.name = "Bingo";
//		dog2.age = 10;
		
//		System.out.println( "My first dogs is called : " +   dog1.name     );  
//		System.out.println( "My first dogs age is : "  +  dog1.age    ); 
//		System.out.println( "My second dogs is called : " +      dog2.name     );  
//		System.out.println( "My second dogs age is : "  +  dog2.age    ); 
//		
//		dog2.name = "73yd3h983h37hd7389wdh7h3772dh73h27d7h327rh7ehd";
//		dog2.age = -123213213;
//		
//		
//		System.out.println( "My second dogs is called : " +      dog2.name     );  
//		System.out.println( "My second dogs age is : "  +  dog2.age    ); 
//		
//		
		
		
		
//		Dog dog1 = new Dog("Bobby", 10);
//		Dog dog2 = new Dog();
//																		//System.out.println(dog1); // invokes myObject.toString() - composed of the name of the class, an @ symbol and the hashcode of the object in hexadecimal. 
//		
//		System.out.println(dog1.getName());
//		System.out.println(dog1.getAge());
//		System.out.println(dog2.getName());
//		System.out.println(dog2.getAge());
//		
//		dog1.setName("Lassie9");
//		dog1.setAge(31);
//		System.out.println(dog1.getName());
//		System.out.println(dog1.getAge());
//		
//		
//		
//		
////		dog2.name = "122fdsfdsfdsfds";
////		dog2.age = -13;
////		System.out.println(dog2.name);
////		System.out.println(dog2.age);
//		
	} // End Main Method

} // End Class

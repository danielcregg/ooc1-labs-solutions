package ie.atu.encapsulation;

public class Dog {
	
	// Instance Variables
	private String name;
	private int age;
	private String breed;
	
	// Constructors
	public Dog() {
	}
	
	public Dog(String name, int age, String breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

	// Getters
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	// Setter
	public void setName(String name) {
		if (name == "Bingo") {
			System.out.println("Illegal dog name");
		} else {
			this.name = name;
		}
	}
	
	public void setAge(int age) {
		if(age > 30 || age < 0 ) {
			System.out.println("This age is not possible");
		} else {
			this.age = age;
		}
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	
	
	
	
	
	
	
//	// Constructor
//	public Dog(){
//		name = "A dog has no name";
//		age = 1;
//	}
//	
//	// Constructor
//	public Dog(String name, int age){
//		this.name = name;
//		this.age = age;
//	}
//	
	
	// Constructor
//	public Dog(){
//		name = "Rex";
//		age = 1;
//	} 
//	
//	// Parameterized Constructor
//	public Dog(String name, int age){
//		this.name = name;
//		this.age = age;
//	} 
//	
	
	
//	// Here are my getters and setters
//	// Getters
//	public String getName() {
//		return name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	
	
	
	
	
	
	
//	// Setters
//	public void setName(String name) {
//		if (name.length() > 25 || name == null || name == "" 
//				|| name.matches(".*\\d+.*")) {
//			System.out.println("ERROR: Name incorrect.");
//		} else {
//			this.name = name;
//		}
//	}
//	
//	public void setAge(int age) {
//		// Age Validation
//		if (age < 0 || age > 30) {
//			System.out.println("ERROR: Invalid Age. Must be > 0 or < 30");
//		} else {
//			this.age = age;
//		}
//	}
//	
//	
//	
//	
//	
//	
	
	//str.matches(".*\\d+.*");
	
//	  @Override
//	  public String toString() {
//	    return "Woof!";
//	  }
}

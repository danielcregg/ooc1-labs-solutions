package ie.gmit.ooc1labs.encapsulation;

public class Dog {
	
	// Instance Variables
	private String name;
	private int age;
	
	// Constructor
	public Dog(){
		name = "A dog has no name";
		age = 1;
	}
	
	// Constructor
	public Dog(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
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
	
	
	// Here are my getters and setters
	// Getters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	
	
	
	
	
	
	
	// Setters
	public void setName(String name) {
		if (name.length() > 25 || name == null || name == "" 
				|| name.matches(".*\\d+.*")) {
			System.out.println("ERROR: Name incorrect.");
		} else {
			this.name = name;
		}
	}
	
	public void setAge(int age) {
		// Age Validation
		if (age < 0 || age > 30) {
			System.out.println("ERROR: Invalid Age. Must be > 0 or < 30");
		} else {
			this.age = age;
		}
	}
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

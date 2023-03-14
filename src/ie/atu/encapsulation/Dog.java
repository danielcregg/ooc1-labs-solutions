package ie.atu.encapsulation;

public class Dog {
	
	// Instance Variables
	private long mui; // Microchip Unique Identifier - 15 digit number
	private String name;
	private int ageYears;
	
	
	// Default Constructor
	public Dog() {
	}
	
	// Parameterised Constructor
	public Dog(long MUI, String name, int ageYears) {
		this.mui = mui;
		this.name = name;
		this.ageYears = ageYears;
	}

	// Getters and Setter
	public void setName(String name) {
		if (name == "Bingo") {
			System.out.println("Illegal dog name");
		} else {
			this.name = name;
		}
	}
	
	public long getMui() {
		return mui;
	}

	public void setMui(long mui) {
		this.mui = mui;
	}

	public int getAgeYears() {
		return ageYears;
	}

	public void setAgeYears(int ageYears) {
		this.ageYears = ageYears;
	}

	public String getName() {
		return name;
	}

	public void setAge(int ageYears) {
		if(ageYears > 30 || ageYears < 0 ) {
			System.out.println("This age is not possible");
		} else {
			this.ageYears = ageYears;
		}
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

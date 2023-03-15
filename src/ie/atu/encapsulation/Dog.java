package ie.atu.encapsulation;

public class Dog {
	
	// Instance Variables
	private long mui; // Microchip Unique Identifier - 15 digit number
	private String name;
	private int ageYears;
	
	// Constructor with mui. Force user to choose a unique MUI
	public Dog(long mui) {
		this.mui = mui;
	}

	// Constructor with mui and Name
	public Dog(long mui, String name) {
		this.mui = mui;
		this.name = name;
	}

	// Parameterized Constructor
	public Dog(long mui, String name, int ageYears) {
		this.mui = mui;
		this.name = name;
		this.ageYears = ageYears;
	}

	// Getters and Setter
	public long getMui() {
		return mui;
	}

	public void setMui(long mui) {
		// MUI Validation - MUI must be equal to 15 digits and not contain all zeros
		if (String.valueOf(mui).length() != 15 || mui == 0) {
			System.out.println("ERROR: MUI must be 15 digits and not all zeros.");
		} else {
			this.mui = mui;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		// Name Validation - Name cannot be null, empty, more than 25 characters, or contain numbers
		if (name == null || name == "" || name.length() > 25 || name.matches(".*\\d+.*")) {
			System.out.println("ERROR: Name incorrect.");
		} else {
			this.name = name;
		}
	}

	public int getAgeYears() {
		return ageYears;
	}

	public void setAgeYears(int ageYears) {
		// Age Validation - Dog age cannot be less than 0 or greater than 30
		if (ageYears < 0 || ageYears > 30) {
			System.out.println("ERROR: Invalid Age. Must be > 0 or < 30");
		} else {
			this.ageYears = ageYears;
		}
	}

	// toString() Method
	@Override
	public String toString(){
		return "Dog [mui=" + mui + ", name=" + name + ", ageYears=" + ageYears + "]";
	}
}

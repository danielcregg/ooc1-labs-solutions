package ie.atu.ooc1labs.lab6classes;

public class House {
	
	private String name;
	private int number;
	
	// Default Constructor
	public House() {
	}
	
	// Parameterized Constructor
	public House(String name) {
		this.name = name;
	}
	
	// Parameterized Constructor
	public House(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
		
}

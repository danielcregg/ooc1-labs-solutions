package ie.atu.ooc1labs.inheritance.animal;

public class Animal {

	// Fields or Instance Variables
	private boolean vegetarian;
	private String eats;
	private int noOfLegs;

	// Default Constructor
	public Animal() {
		//vegetarian = false;
		//String eats = null;
		//noOfLegs = 0;
	}

	// Paramiterised Constructor
	public Animal(boolean veg, String food, int legs){
		this.vegetarian = veg;
		this.eats = food;
		this.noOfLegs = legs;
	}

	// Getters and Setters
	public boolean getVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public String getEats() {
		return eats;
	}

	public void setEats(String eats) {
		this.eats = eats;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

}

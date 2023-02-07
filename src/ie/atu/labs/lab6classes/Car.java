package ie.atu.labs.lab6classes;

public class Car {

	// Instance Variables
	private String make;
	private float engineSizeLitres;
	private boolean engineRunning;

	// Default Constructor
	public Car() {
		this.make = null;
		this.engineSizeLitres = 0.0f;
		this.engineRunning = false;
	}
	
	// Parameterized Constructor
	public Car(String make) {
		this.make = make;
	}
	
	// Parameterized Constructor
	public Car(String make, float enginesizeLitres, boolean engineRunning) {
		this.make = make;
		this.engineSizeLitres = enginesizeLitres;
		this.engineRunning = engineRunning;
	}
	
	// Getters and Setters
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public float getEngineSizeLitres() {
		return engineSizeLitres;
	}

	public void setEngineSizeLitres(float engineSizeLitres) {
		this.engineSizeLitres = engineSizeLitres;
	}

	public boolean getEngineRunning() {
		return engineRunning;
	}

	public void setEngineRunning(boolean engineRunning) {
		this.engineRunning = engineRunning;
	}
	
	
	public void carGreatMessage() {
		System.out.println("This " + make + " car is great!");
	}
	
	public float upgradeEngine(float engineSizeLitres) {
		// Store old engine size
		float oldEngineSizeLitres = this.engineSizeLitres;
		// Update new engine size
		this.engineSizeLitres = engineSizeLitres;
		return oldEngineSizeLitres;
	}
	
} // End class

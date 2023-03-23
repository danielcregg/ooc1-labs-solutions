package ie.atu.classesandobjects.car;

class Car {

	// Instance Variables
	String make; // e.g. "Ford"
	float priceEur; // e.g. 20000.00
	int speedKph; // e.g. 120
	
	// Default Constructor
	public Car() {
		// System.out.println("I am the Default Constructor");
		// All instance variables are set to their default values
		//make = null;
		//priceEur = 0.0f;
		//speedKph = 0;
	}

	// Parameterized Constructor
	public Car(String make, float priceEur, int speedKph) {
		System.out.println("I am the Parameterized Constructor");
		this.make = make;
		this.priceEur = priceEur;
		this.speedKph = speedKph;
	}

	// Getters and Setters
	// Make Getter
	public String getMake() {
		return make;
	}

	// Price Getter
	public float getPriceEur() {
		return priceEur;
	}

	// Speed Getter
	public int getSpeedKph() {
		return speedKph;
	}

	// Make Setter
	public void setMake(String make) {
		this.make = make;
	}

	// Price Setter
	public void setPriceEur(float priceEur) {
		this.priceEur = priceEur;
	}

	// Speed Setter
	public void setSpeedKph(int speedKph) {
		this.speedKph = speedKph;
	}

	// Accelerate method // New speed = Old speed + accelerationInMetersPerSecondPerSecond * timeInSeconds
	public void accelerate(int accelerationInMetersPerSecondPerSecond, int timeInSeconds) {
		System.out.println("This car is accelerating!");
		// New speed = Old speed + accelerationInMetersPerSecondPerSecond * time
		this.speedKph = this.speedKph + accelerationInMetersPerSecondPerSecond * timeInSeconds;
	}
	
	// Brake method
	public void brake(int decelerationInMetersPerSecondPerSecond, int timeInSeconds) {
		System.out.println("This car is braking!");
		// New speed = Old speed + accelerationInMetersPerSecondPerSecond * time
		// Car speed cannot be negative
		if (this.speedKph - decelerationInMetersPerSecondPerSecond * timeInSeconds < 0) {
			this.speedKph = 0;
		} else {
			this.speedKph = this.speedKph - decelerationInMetersPerSecondPerSecond * timeInSeconds;
		}
	}

	// The toString method by default prints the hashcode of the object. It is common practice 
	// to override this method to print the instance variables of the object.
	public String toString() {
		return "Make: " + make + ", Price: €" + priceEur + ", Speed: " + speedKph + "kph";
	}

} // End class
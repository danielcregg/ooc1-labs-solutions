package ie.atu.inheritance.work;

public class Retiree extends Person{

	// Instance Variable
	private float statePension;
	
	// Constructor
	public Retiree(int age, float lumpSum) {
		super(age);
		this.statePension = lumpSum;
	}
	
	// Getter
	public float getLumpSum() {
		return statePension;
	}
	
	// Setter
	public void setLumpSum(float statePension) {
		this.statePension = statePension;
	}
	
}

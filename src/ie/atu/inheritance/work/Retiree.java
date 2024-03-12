package ie.atu.inheritance.work;

public class Retiree extends Person {

	// Instance Variable
	private float statePension;
	
	// Constructor
	public Retiree(int age, float statePension) {
		super(age);
		this.statePension = statePension;
	}
	
	// Getter
	public float getStatePension() {
		return statePension;
	}
	
	// Setter
	public void setStatePension(float statePension) {
		this.statePension = statePension;
	}
	
}

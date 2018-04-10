package ie.gmit.javalabs.lab10abstraction.account.demoClass;

public abstract class AbstractClass {
	
	private int age;
	
	public AbstractClass(int age) {
		System.out.println("Constructing an AbstractClass Object");
		this.age = age;
	}
	
	// Concrete getters and setters Methods - Contain Body
	public int getAge() {
		return this.age;
	}	
	
	public void setAge(int age) {
		this.age = age;
	}


	// Abstract Method - No Body
	public abstract double printPi();
	
}

package ie.gmit.javalabs.lab10abstraction.account.demoClass;

public abstract class AbstractClass {
	
	private int age;
	
	public AbstractClass(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	// Abstract Method - No Body
	public abstract double printPi();
	
}

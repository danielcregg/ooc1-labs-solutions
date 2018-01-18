package ie.gmit.javalabs.lab10abstraction.demoClass;

public class AbstractSubClass extends AbstractClass {
	
	public AbstractSubClass(int age) {
		super(age);
	}
	
	@Override
	public double getShorty() {
		return 0.0;
	}
}

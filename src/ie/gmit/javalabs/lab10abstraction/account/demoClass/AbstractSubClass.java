package ie.gmit.javalabs.lab10abstraction.account.demoClass;

public class AbstractSubClass extends AbstractClass {
	
	public AbstractSubClass(int age) {
		super(age);
	}
	
	@Override
	public double printPi() {
		return 3.14;
	}
}

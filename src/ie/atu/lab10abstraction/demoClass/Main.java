package ie.atu.lab10abstraction.demoClass;

public class Main {

	public static void main(String[] args) {
	
		// AbstractClass abstractClassObj1 = new AbstractClass(5);
		
		AbstractSubClass ascObj1 = new AbstractSubClass(5);
		System.out.println(ascObj1.getAge());
		System.out.println(ascObj1.returnPi());
	}
}

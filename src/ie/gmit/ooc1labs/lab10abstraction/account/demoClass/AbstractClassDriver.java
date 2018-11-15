package ie.gmit.ooc1labs.lab10abstraction.account.demoClass;

public class AbstractClassDriver {

	public static void main(String[] args) {
	
		// AbstractClass abstractClassObj1 = new AbstractClass(5);
		
		AbstractSubClass ascObj1 = new AbstractSubClass(5);
		System.out.println(ascObj1.getAge());
		System.out.println(ascObj1.returnPi());
	}
}

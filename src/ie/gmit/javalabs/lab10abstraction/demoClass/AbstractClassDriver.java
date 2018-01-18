package ie.gmit.javalabs.lab10abstraction.demoClass;

public class AbstractClassDriver {

	public static void main(String[] args) {
	//	AbstractClass ab1 = new AbstractClass();
		AbstractSubClass asc1 = new AbstractSubClass(5);
		System.out.println(asc1.getAge());
		System.out.println(asc1.getShorty());
	}

}

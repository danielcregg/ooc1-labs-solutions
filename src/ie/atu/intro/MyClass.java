package ie.atu.intro;

public class MyClass {

	public static void main(String[] args) {
		// System.out.println("Hi Mom");
		
		myMethod("Daniel", 100);
		myMethod("Tom", 50);
		myMethod("Sarah", 21);
		myMethod("jimmy", 11);
	
		
	}

	static void myMethod(String fname, int age) {
		System.out.println("Hello " + fname + " my age is " + age + ".");
	}

}

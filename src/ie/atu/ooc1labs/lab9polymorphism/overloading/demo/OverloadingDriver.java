package ie.atu.ooc1labs.lab9polymorphism.overloading.demo;

public class OverloadingDriver {

	public static void main(String[] args) {
		
		Overloading demo = new Overloading();
		
        demo.methodName(10);
        demo.methodName("Overloading Exmple");
        demo.methodName(10, "Overloading Example");

	}

}

package ie.atu.ooc1labs.lab6classes;

public class MyMainClass {

	public static void main(String[] args) {

		System.out.println("Hello");
		
		// Create new object using MyClass type
		MyClass myObject = new MyClass();
		
		// Access instance variable of myObject
		System.out.println(myObject.getX());
		// Ser variable
		myObject.setX(10);
		// Access updated instance variable of myObject
		System.out.println(myObject.getX());
		
		//Access Modifiers
		//this
		//constructor

	}

}

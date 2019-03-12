package ie.gmit.ooc1labs.lab8inheritance.superClass;

public class Driver {

	public static void main(String[] args) {
				
		// Creating new Subclass object
		// new is keyword to create new object
		// new needs constructor of object class
		Subclass subclass1 = new Subclass();
		subclass1.setVar(10);
		System.out.println(subclass1.getVar());

	}

}

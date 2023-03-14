package ie.atu.inheritance.superClass;

public class Main {

	public static void main(String[] args) {
				
		// Creating new Subclass object
		// new is keyword to create new object
		// new needs constructor of object class
		Subclass subclassObject1 = new Subclass();
		subclassObject1.setVar(10);
		System.out.println(subclassObject1.getVar());

	}

}

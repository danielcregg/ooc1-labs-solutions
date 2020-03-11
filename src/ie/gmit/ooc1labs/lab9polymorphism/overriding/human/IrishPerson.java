package ie.gmit.ooc1labs.lab9polymorphism.overriding.human;

public class IrishPerson extends Human {
	
	@Override
	public void speak() {
		System.out.println("Dia Dhuit");
	}
	
	public void irishPersonMethod() {
		System.out.println("This is the Irish Person method!");
	}
	
}


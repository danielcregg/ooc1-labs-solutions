package ie.atu.ooc1labs.lab9polymorphism.overloading;

public class Main {

	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		machine1.printer(10);
		machine1.printer(false);
		machine1.printer(10, true, 'c', 3.14156793d);
	
	
	} // End Main
	
} // End Class

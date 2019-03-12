package ie.gmit.ooc1labs.lab6classes;

public class Main {

	public static void main(String[] args) {
		
		// New Object of type House
		House house1 = new House();
		House house2 = new House("Black House");
		House house3 = new House("Downing Street", 10);
		
		System.out.println(house1.getName());
		
		System.out.println("The animal speaks.");
		
		house1.setName("White House");
		System.out.println(house1.getName());
		System.out.println(house2.getName());
		System.out.println(house3.getName());
		System.out.println(house3.getNumber());
	}

}

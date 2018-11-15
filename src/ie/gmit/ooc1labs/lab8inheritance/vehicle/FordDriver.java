package ie.gmit.ooc1labs.lab8inheritance.vehicle;

public class FordDriver {

	public static void main(String[] args) {
		Ford myFord = new Ford("White", "Ford", "Mustang");
		System.out.println("My Car is " + myFord.getColour()+" it is a "+
				myFord.getMake()+" "+
				myFord.getModel());
	}

}

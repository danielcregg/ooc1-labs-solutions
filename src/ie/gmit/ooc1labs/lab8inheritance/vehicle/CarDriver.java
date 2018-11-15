package ie.gmit.ooc1labs.lab8inheritance.vehicle;

public class CarDriver {

	public static void main(String[] args) {
		Car myCar = new Car("Red","Ford");
		//myCar.setmake("Ford");
		//myCar.setColour("Blue");
		System.out.println(myCar.getColour()+","+myCar.getMake());
		//System.out.println(myCar.getMake());
//		Vehicle yourCar = new Car();
//		yourCar.setColour("Blue");
//		System.out.println(yourCar.getColour());
		
	}
}

package ie.atu.inheritance.beverage;

public class Main {

	public static void main(String[] args) {
		Coffee java = new Coffee();
		Wine cabSav = new Wine();

		java.temperature = 90;
		cabSav.temperature = 9;

		System.out.println(java.isAcceptableTemperature());
		System.out.println(cabSav.isAcceptableTemperature());

		java.getColour();

	}

}

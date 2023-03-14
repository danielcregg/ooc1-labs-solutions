package ie.atu.inheritance.beckhams;

public class BeckhamDriver {

	public static void main(String[] args) {
		Brooklyn brooklyn1 = new Brooklyn();
		// brooklyn1.setEyeColour("blue");
		// brooklyn1.getEyeColour();
		// System.out.println(brooklyn1.getEyeColour());
		System.out.println("Brooklyn inherited his " + brooklyn1.getEyeColour() + " eyes from David");
	}

}

package ie.atu.controlflow.decisionmaking;

public class IfStatement {
	public static void main(String[] args) {

		int jimsAge = 40;
		int tomsAge = 30;
		
		int jimsHeightCm = 185;
		int tomsHeightCm = 183;
		
		if (jimsAge < tomsAge) {
			if (jimsHeightCm < tomsHeightCm) {
				System.out.println("Jim is younger and smaller than Tom");
			}
		} else if(jimsAge == tomsAge) {
			if (jimsHeightCm == tomsHeightCm) {
				System.out.println("Jim is the same age and same height as Tom");
			}
		} else {
			System.out.println("Jim is older and taller than Tom");
		}
		
		

		
	} // End main
} // End class

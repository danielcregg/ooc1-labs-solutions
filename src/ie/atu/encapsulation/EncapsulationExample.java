package ie.atu.encapsulation;

public class EncapsulationExample {
	public static void main(String args[]) {
		// Create object
		EmployeeCount ecObj = new EmployeeCount();

		// Set Variable
		ecObj.setNoOfEmployees(-100);

		// Get Variable
		System.out.println("No Of Employees: " + ecObj.getNoOfEmployees());

	} // End Main
}

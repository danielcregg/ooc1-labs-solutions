package ie.atu.encapsulation;

public class EmployeeCount {
	private int numOfEmployees;

	public void setNoOfEmployees(int count) {
		if (count < 0) {
			System.out.println("Invalid no of employees");
		} else {
			numOfEmployees = count;
		}
	}

	public int getNoOfEmployees() {
		return numOfEmployees;
	}
}

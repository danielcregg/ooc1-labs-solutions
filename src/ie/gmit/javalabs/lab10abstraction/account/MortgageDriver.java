package ie.gmit.javalabs.lab10abstraction.account;

public class MortgageDriver {

	public static void main(String[] args) {
		Mortgage m1 = new Mortgage("M123456", 300000.00f, 300000.00f, 30, 3.5f);
		
		System.out.println(m1.findMonthlyRepayment());
		
	}

}

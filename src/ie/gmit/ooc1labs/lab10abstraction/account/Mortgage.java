package ie.gmit.ooc1labs.lab10abstraction.account;

public class Mortgage extends Account {
	
	float principal;
	int term;
	float interestRate;
	
	public Mortgage(String accNo, float balance, float principal, int term, float interestRate) {
		super(accNo, balance);
		this.principal = principal;
		this.term = term;
		// Convert interest rate into a decimal
	    // eg. 3.5% = 0.035
	    this.interestRate = interestRate;
	}
	
	public double findMonthlyRepayment() {
	    // Monthly interest rate 
	    // is the yearly rate divided by 12
		// Convert interest rate into a decimal
	    // eg. 3.5% = 0.035
	    double monthlyRate = (this.interestRate / 100) / 12.0;
	    // The length of the term in months 
	    // is the number of years times 12
	    int termInMonths = this.term * 12;
	    // Calculate the monthly payment
	    // Typically this formula is provided so 
	    // we won't go into the details
	    // The Math.pow() method is used calculate values raised to a power
		return (this.principal * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -termInMonths));
		
	}
}
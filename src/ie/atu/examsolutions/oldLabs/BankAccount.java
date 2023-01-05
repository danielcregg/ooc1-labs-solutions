package ie.atu.examsolutions.oldLabs;

// Class of a bank account
public class BankAccount {

	// Class Attribute to hold a/c balance and number
	private float balance;
	private int accNumber;
	private static float interestRate;
	
	//Constructor to create a bank account and initialize the attributes of the new object
	public BankAccount(float intialbalance, int intialAccNumber, float initialInterestRate)
	{
	  balance = intialbalance;
	  accNumber = intialAccNumber;
	  interestRate = initialInterestRate;
	}
	
	// Public method which adds the amount passed to the balance
	// Returns new balance
	public float makeLodgement(float amount)
	{
		accNumber = accNumber + 1 - 1; // Just did this to get rid of not used warning ... can remove this line
		balance = balance + amount;
		return balance;
	}
	
	// Public method which adds the amount passed to the balance
	// Returns new balance
	public float makeWithdrawal(float amount)
	{
		balance = balance - amount;
		return balance;
	}
	
	// Public method which returns the balance
	// Returns new balance
	public float getBalance()
	{
		return balance;
	}
	
	// Public method which returns the balance
	// Returns new balance
	public float getBalanceWithInterest()
	{
		return balance * (1 + (interestRate/100));
	}
	
}

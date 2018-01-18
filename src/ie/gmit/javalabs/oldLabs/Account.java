package ie.gmit.javalabs.oldLabs;

public class Account {

	// Class Attributes
	private double balance;
	private String name;
	private long accNumber;

	// Constructor #1
	// Set as the class attributes to value passes in the method
	public Account (double initBal, String owner, long number)
	{
	    balance = initBal;
	    setName(owner);
	    accNumber = number;
	}
	
	// Constructor #2
	// Set as the balance and name class attributes to value passes in the method	
	// The account number is set to random number between 1 and 1,000,000
	public Account (double initBal, String owner)
	{
	    balance = initBal;
	    setName(owner);
	    // 					Min    + (int)(Math.random() * ((Max    - Min)    + 1));
	    accNumber = (long) (100000 + (int)(Math.random() * ((999999 - 100000) + 1)));
	}
	
	// Lodgement Method #1
	// Simply adds the amount passed as parameter to the balance.	
	public void Lodgement (double Lodgement)
	{
		balance += Lodgement;
	}

	// Lodgement Method #2
	// Adds the difference between the amounts passed as parameters to the balance.
	public void Lodgement (double Lodgement, double fee)
	{
		balance = balance + Lodgement - fee;
	}
	
	// Getter methods used to test
	public long getAccountNumber(){
		return accNumber;
	}
	
	public double getBalance(){
		return balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

/*
http://stackoverflow.com/questions/363681/generating-random-integers-in-a-specific-range

Min + (int)(Math.random() * ((Max - Min) + 1))
The Java Math library function Math.random() generates a double value in the range [0,1). Notice this range does not include the 1.

In order to get a specific range of values first, you need to multiply by the magnitude of the range of values you want covered.

Math.random() * ( Max - Min )
This returns a value in the range [0,Max-Min), where 'Max-Min' is not included.

For example, if you want [5,10], you need to cover five integer values so you use

Math.random() * 5
This would return a value in the range [0,5), where 5 is not included.

Now you need to shift this range up to the range that you are targeting. You do this by adding the Min value.

Min + (Math.random() * (Max - Min))
You now will get a value in the range [Min,Max). 
*/
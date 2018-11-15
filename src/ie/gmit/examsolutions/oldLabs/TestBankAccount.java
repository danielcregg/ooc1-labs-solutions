package ie.gmit.examsolutions.oldLabs;

import java.util.Scanner;


public class TestBankAccount {

	public static void main(String[] args) {
				
		float initalbalance;
		int accountNumber;
		float initialIntRate;
		float amount;
		
		/// Create an input object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Thank you for setting up an account today");
		
		// Get values need to create Account object
		System.out.println("Enter the Account Number");
		accountNumber = input.nextInt();
		System.out.println("Your account number is " + accountNumber);
		
		System.out.println("Enter New Account Balance");
		initalbalance = input.nextFloat();
		
		System.out.println("Enter yearly Interest Rate");
		initialIntRate = input.nextFloat();
		
		// Make a new Bank Account object
		BankAccount account1 = new BankAccount(initalbalance,accountNumber, initialIntRate);
		
		
		//// Ask the user to enter what they want to do 
		System.out.println("Enter 1 to make a lodgement");
		System.out.println("Enter 2 to make a withdrawal");
		System.out.println("Enter 3 to get the balance");
		System.out.println("Enter 4 to get the balance with the interest after 1 year");
		
		// Get the user choice
		int choice = input.nextInt();
		
				// Make Lodgement
				if(choice==1)
				{
					// Get Lodgement Amount
					System.out.println("Enter Amount in €");
			
					amount = input.nextFloat();
			
					// Call lodgement method
					account1.makeLodgement(amount);
			
					// Display new balance
					System.out.println("New Balance is: €"+ account1.getBalance());
			
			
				}
		
				// Make Withdrawal
				else if(choice==2)
				{
					// Get Withdrawal Amount
					System.out.println("Enter Amount in €");
			
					amount = input.nextFloat();
			
					/// This condition is optional it was not specified whether an overdraft was allowed
					if(account1.getBalance()>=amount)
					{
						    // Call Withdrawal method
							account1.makeWithdrawal(amount);
							System.out.println("New Balance is: €"+ account1.getBalance());
					}
					
					else
					{
						System.out.println("Insuffucient Funds");
					}
				}
		
				// Display Balance
				else if(choice==3)
				{
					System.out.println("The Account Balance is: €"+account1.getBalance());
			
				}
				// Display Balance with Interest
				else if(choice==4)
				{
					System.out.printf("The Account Balance with interest after one year will be: €" + "%.2f", account1.getBalanceWithInterest());
				}
				//Invalid choice
				else
				{
					System.out.println("Invalid Entry");
				}
		
		
		System.out.println("\nThank You");
		
		// Close the input stream
		input.close();
		
	}

}

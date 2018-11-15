package ie.gmit.examsolutions.oldLabs;


public class TestAccount {

	public static void main(String[] args) {
		
		// Create two accounts using different Lodgement constructors
		Account account1 = new Account(1.00, "Daniel Cregg", 123456);
		Account account2 = new Account(2.00, "James Bond");
		
		account1.Lodgement(1.51);
		account2.Lodgement(2.50, 3.50);
		
		// Use Getter to test if Constructor and Lodgement methods worked 
		System.out.println("Account Number = " + account1.getAccountNumber());
		System.out.println("Account Number = " + account2.getAccountNumber());
		System.out.println("Balance = €" + account1.getBalance());
		System.out.println("Balance = €" + account2.getBalance());
	}
}

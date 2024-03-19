package ie.atu.polymorphism.overloading.bank;

public class BankAccount {
    
    // Instance variable
    private double balance;

    // Constructor
    public BankAccount() {
        this.balance = 0.0;
    }

    // Method to deposit money by providing the amount directly
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance is " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to deposit money by providing a cheque
    public void deposit(Cheque cheque) {
        if (cheque != null && cheque.getAmount() > 0) {
            balance += cheque.getAmount();
            System.out.println("Deposited check of amount " + cheque.getAmount() + ". New balance is " + balance);
        } else {
            System.out.println("Invalid check");
        }
    }
}



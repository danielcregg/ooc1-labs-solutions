package ie.atu.polymorphism.overloading.bank;

// Main class
public class Main {
    public static void main(String[] args) {
        
        // Create a bank account
        BankAccount account = new BankAccount();
        // Deposit money into the account
        account.deposit(100.0); // Deposited 100.0. New balance is 100.0
        
        // Create a cheque
        Cheque cheque1 = new Cheque(200.0);
        // Deposit the cheque into the account
        account.deposit(cheque1); // Deposited cheque of amount 200.0. New balance is 300.0
    }
}
package ie.atu.polymorphism.overloading.bank;

// Main class
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(100.0); // Deposited 100.0. New balance is 100.0

        Cheque cheque1 = new Cheque(200.0);
        account.deposit(cheque1); // Deposited cheque of amount 200.0. New balance is 300.0
    }
}
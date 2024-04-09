package ie.atu.abstraction.realinterface;

public interface Rental {
    // Constant
    double SALES_TAX = 0.21; // 21% sales tax in Ireland

    // Method signature
    double calculateRentalCost(int daysRented);

    // Default method
    default void startEngine() {
        System.out.println("Starting the engine...");
    }

    // Static method
    static double applySalesTax(double cost) {
        return cost + (cost * SALES_TAX);
    }
}

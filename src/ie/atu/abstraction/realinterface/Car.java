package ie.atu.abstraction.realinterface;

public class Car implements Rental {
    private double dailyRentalRate;

    public Car(double dailyRentalRate) {
        this.dailyRentalRate = dailyRentalRate;
    }

    @Override
    public double calculateRentalCost(int daysRented) {
        double cost = daysRented * dailyRentalRate;
        return Rental.applySalesTax(cost); // Call the static method
    }
}

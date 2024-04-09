package ie.atu.abstraction.realinterface;

public class Main {

    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car(50.0);
        // Calculate the rental cost
        double cost = car.calculateRentalCost(5);
        // Print the total rental cost
        System.out.println("Total rental cost: €" + cost);
    }
}

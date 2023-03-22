package ie.atu.inheritance.animal;

public class Rabbit extends Herbivore {
    
    // Instance Variables
    private String colour;

    // Constructor
    public Rabbit(double weightKg, String favouitePlant, String colour) {
        super(weightKg, favouitePlant);
        this.colour = colour;
    }

    // Getters and Setters
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}

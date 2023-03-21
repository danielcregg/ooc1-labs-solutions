package ie.atu.inheritance.animal;

public class Herbivore extends Animal {
    
    // Instance Variables
    private String favouitePlant;

    // Constructor
    public Herbivore(double weightKg, String favouitePlant) {
        super(weightKg);
        this.favouitePlant = favouitePlant;
    }

    // Getters and Setters
    public String getFavouitePlant() {
        return favouitePlant;
    }

    public void setFavouitePlant(String favouitePlant) {
        this.favouitePlant = favouitePlant;
    }
    
}
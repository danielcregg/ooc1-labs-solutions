package ie.atu.inheritance.animal;

public class Carnivore extends Animal {
    
    // Instance Varibales
    private String favouriteMeat;

    // Constructor
    public Carnivore (double weightKg, String favouriteMeat) {
        super(weightKg);
        this.favouriteMeat = favouriteMeat;
    }

    // Getters and Setters
    public String getFavouriteMeat() {
        return favouriteMeat;
    }

    public void setFavouriteMeat(String favouriteMeat) {
        this.favouriteMeat = favouriteMeat;
    }
        
}

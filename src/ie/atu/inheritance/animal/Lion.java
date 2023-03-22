package ie.atu.inheritance.animal;

public class Lion extends Carnivore {
    
    // Instance Variables
    private String favouritePrey;

    // Constructor
    public Lion(double weightKg, String favouriteMeat, String favouritePrey) {
        super(weightKg, favouriteMeat);
        this.favouritePrey = favouritePrey;
    }

    // Getters and Setters
    public String getFavouritePrey() {
        return favouritePrey;
    }

    public void setFavouritePrey(String favouritePrey) {
        this.favouritePrey = favouritePrey;
    }
}

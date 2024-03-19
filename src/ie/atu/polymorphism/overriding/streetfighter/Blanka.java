package ie.atu.polymorphism.overriding.streetfighter;

public class Blanka extends Fighter {

    // Demo dynamic method dispatch (runtime polymorphism aka method overriding)
    public void specialMove() {
        System.out.println("Electric Thunder!");
    }

    // Demo dynamic method dispatch (runtime polymorphism aka method overriding)
    public void attack(Blanka blanka) {
        blanka.specialMove();
    }
}

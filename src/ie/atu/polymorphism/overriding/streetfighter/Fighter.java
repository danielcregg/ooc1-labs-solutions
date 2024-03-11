package ie.atu.polymorphism.overriding.streetfighter;

public class Fighter {
    
    // Demo dynamic method dispatch (runtime polymorphism aka method overriding)
    public void specialMove() {
        System.out.println("Fighter's special move");
    }

    // Demo dynamic method dispatch (runtime polymorphism aka method overriding)
    public void attack(Fighter fighter) {
        fighter.specialMove();
    }

}

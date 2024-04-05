package ie.atu.polymorphism.overriding.streetfighter;

public class Ryu extends Fighter {

    @Override
    public void specialMove() {
        System.out.println("Hadouken!");
    }
}

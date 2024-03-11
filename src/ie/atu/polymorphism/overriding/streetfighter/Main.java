package ie.atu.polymorphism.overriding.streetfighter;

public class Main {

    public static void main(String[] args) {

        // Create a Fighter objects
        Fighter fighter = new Fighter();
        Fighter ryu = new Ryu();
        Fighter chunLi = new ChunLi();

        // Call the attack method on the Fighter object
        fighter.attack(fighter);
        fighter.attack(ryu);
        fighter.attack(chunLi);

    }

}

package ie.atu.polymorphism.overriding.streetfighter;

public class Main {

    public static void main(String[] args) {

        // Create Fighter objects
        Fighter ryu = new Ryu();
        Fighter chunLi = new ChunLi();
        Fighter blanka = new Blanka(); 

        // Show all fighters special moves
        Fighter fighters[] = { ryu, chunLi, blanka };
        for (Fighter fighter : fighters) {
            fighter.specialMove();
        }

        // Call the attack method on the Fighter object
        attack(ryu);
        attack(chunLi);
        attack(blanka);

    } // end main method

    // Demo dynamic method dispatch (runtime polymorphism aka method overriding)
    public static void attack(Fighter fighter) {
        fighter.specialMove();
    }

} // end class

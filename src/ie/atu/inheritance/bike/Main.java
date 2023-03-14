package ie.atu.inheritance.bike;

import java.util.ArrayList;

/**
 * Main
 */
public class Main {

    public static void main(String args[]) {

        // using subclass reference( )
        MountainBike mb1 = new MountainBike(3, 100, 25);
        System.out.println("Seat height of mb1 is " + mb1.seatHeight);

        // using superclass reference
        Bicycle mb2 = new MountainBike(4, 200, 20);
        // The following statement is invalid because Bicycle does not define
        // aseatHeight.
        // System.out.println("seat height of mb2 is " + mb2.seatHeight);

        // In case of overridden methods always subclass method will be executed
        System.out.println(mb1.toString());
        System.out.println(mb2.toString());

        // The following statement is invalid because Bicycle does not define
        // setHeight() method.
        // mb2.setHeight(21);

        // declaring MountainBike reference
        MountainBike mb3;

        // assigning mb3 to mb2 using typecasting.
        mb3 = (MountainBike) mb2;
        mb3.setHeight(21);
        System.out.println("Seat height of mb3 bicycle  is " + mb3.seatHeight);

        ArrayList<Bicycle> al = new ArrayList<Bicycle>(2);

        Bicycle mb4 = new MountainBike(6, 300, 25);
        Bicycle mb5 = new MountainBike(8, 400, 30);
        
        // adding String object to al
        al.add(mb4);

        // adding Integer object to al
        al.add(mb5);

        // getting all elements using Object reference
        for (Bicycle bike : al) {
            System.out.println(bike);
        }

    }
}
package ie.atu.classesandobjects.dog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.println("Enter age  dog");
        int holder = in.nextInt();
        //Create two dogs to keep track of
        Dog dog1 = new Dog("Rex");

        //get the dogs age
        dog1.getAge();
        dog1.setAge(holder);
        System.out.print("dog's age: " + dog1.getAge());

        in.close(); // Close scanner object
    }
}



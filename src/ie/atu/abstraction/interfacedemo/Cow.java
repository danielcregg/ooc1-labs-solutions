package ie.atu.abstraction.interfacedemo;

public class Cow implements Animal {
    
    // Implementing the interface methods
    @Override
    public void makeSound() {
        System.out.println("Moo");
    }
    
}

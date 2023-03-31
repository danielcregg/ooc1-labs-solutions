package ie.atu.abstraction.interfacedemo;

// An interface is a completely "abstract class" that is used 
// to group related methods with empty bodies.
// To access the interface, it must be "implemented"
// Here is an example of an interface:
public interface Animal {

	// Instance variables of an interface are by default public, static and final.
	// This means that the value of the variable cannot be changed once it is 
	// initialized, and it is shared among all instances of classes that implement
	// the interface.
	public static final boolean canMove = true;

	// All interface methods are by default abstract and public
	// Interface methods do not have a body - the body is provided by the "implement" class 
	public void makeSound();

}

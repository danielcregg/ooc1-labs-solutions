package ie.atu.abstraction.abstractmethod;

public class ConcreteSubClass extends AbstractClass {

	// Any class inheriting the an abstract class must either override the 
	// abstract methods or declare itself as abstract. 

	@Override
	public void AbstractMethod() {
		System.out.println("I am the implemented abstract method.");
	}
	
}

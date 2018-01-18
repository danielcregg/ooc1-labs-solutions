package ie.gmit.javalabs.lab8inheritance.human;

public class Human {
	
	private double weight;
	
	public Human(double weight){
		// this  is a keyword in Java. 
		// It can be used inside a Method or constructor of  Class.
		// this works as a reference to the current Object whose Method or constructor is being invoked.
		// The this keyword can be used to refer to any member of the current object from within an instance Method or 
		// a constructor.
		this.weight = weight;
	}
	
	public double eat(double weightGain){
		weight = weight + weightGain;
		System.out.println("You have eaten and you now weigh " + weight + " kilos.");
		return weight;
	}
	
}

package ie.atu.polymorphism.overriding.human;

public class Main {
	public static void main(String[] args) {

		Human humanObj1 = new Human();
		IrishPerson IrishPersonObj1 = new IrishPerson();
		FrenchPerson FrenchPersonObj1 = new FrenchPerson();
		
		humanObj1.greet();
		IrishPersonObj1.greet();
		FrenchPersonObj1.greet();
		
		Human humanObj2 = new Human();
		Human IrishPersonObj2 = new IrishPerson();
		Human FrenchPersonObj2 = new FrenchPerson();

		humanObj2.greet();
		IrishPersonObj2.greet();
		FrenchPersonObj2.greet();
		
		Human HumansList[] = { humanObj1, IrishPersonObj1, FrenchPersonObj1 };

		for(Human human: HumansList) {
			human.greet();
		}

		// Here we demonstrate polymorphism. The method showPassport() is overridden in the subclasses. 
		// Run-time polymorphism is achieved by calling the method showPassport() on the object of the subclass.
		checkPassport(humanObj1);
		checkPassport(IrishPersonObj1);
		checkPassport(FrenchPersonObj1);

	} // end main method

	public static void checkPassport(Human human) {
		human.showPassport();
	}

} // end class

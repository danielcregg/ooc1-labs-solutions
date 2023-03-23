package ie.atu.polymorphism.overriding.human;

public class Main {
	public static void main(String[] args) {

		Human humanObj1 = new Human();
		IrishPerson IrishPersonObj1 = new IrishPerson();
		FrenchPerson FrenchPersonObj1 = new FrenchPerson();

//		Human humanObj1 = new Human();
//		Human IrishPersonObj1 = new IrishPerson();
//		Human FrenchPersonObj1 = new FrenchPerson();

		humanObj1.greet();
		IrishPersonObj1.greet();
		FrenchPersonObj1.greet();

//		Human HumansList[] = { humanObj1, IrishPersonObj1, FrenchPersonObj1 };

//		for(Human human: HumansList) {
//			human.greet();
//		}

//		humanObj1.showIrishPassport(); -- ERROR: Not reachable

//		for(Human human: HumansList) {
//			human.greet();
//			if (human instanceof IrishPerson) {
//				IrishPerson irishPersonObj1 =  (IrishPerson) human;
//				irishPersonObj1.showIrishPassport();
//			}
//		}
		
		
		// Super keyword in Method Overriding
//		IrishPersonObj1.humanGreet();
		

	} // end main method
} // end class

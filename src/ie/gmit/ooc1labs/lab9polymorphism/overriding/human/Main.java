package ie.gmit.ooc1labs.lab9polymorphism.overriding.human;


public class Main {
	public static void main(String[] args) {
		Human humanObj1 = new Human();
		Human humanObj2 = new IrishPerson();
		Human humanObj3 = new FrenchPerson();

		humanObj1.greet();
		humanObj2.greet();
		humanObj3.greet();
		
//		Human HumansList[]= {humanObj1, humanObj2, humanObj2};

//		for(Human human: HumansList) {
//			human.greet();
//		}

//		humanObj1.irishPersonMethod(); -- ERROR: Not reachable

//		for(Human human: HumansList) {
//			human.greet();
//			if (human instanceof IrishPerson) {
//				IrishPerson irishPersonObj1 =  (IrishPerson) human;
//				irishPersonObj1.irishPersonMethod();
//			}
//		}	

	}
}

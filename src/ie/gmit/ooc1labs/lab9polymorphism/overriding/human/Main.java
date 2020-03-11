package ie.gmit.ooc1labs.lab9polymorphism.overriding.human;

//import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Human humanObj1 = new Human();
		Human humanObj2 = new IrishPerson();
		Human humanObj3 = new FrenchPerson();

		humanObj1.speak();
		humanObj2.speak();
		humanObj3.speak();

//		ArrayList<Human> HumansList = new ArrayList<>();
//		
//		HumansList.add(humanObj1);
//		HumansList.add(humanObj2);
//		HumansList.add(humanObj3);

//		for(Human human: HumansList) {
//			human.speak();
//		}

//		humanObj1.irishPersonMethod(); -- ERROR: Not reachable

//		for(Human human: HumansList) {
//			human.speak();
//			if (human instanceof IrishPerson) {
//				IrishPerson irishPersonObj1 =  (IrishPerson) human;
//				irishPersonObj1.irishPersonMethod();
//			}
//		}	

	}
}

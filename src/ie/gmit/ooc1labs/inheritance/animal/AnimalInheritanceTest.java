package ie.gmit.ooc1labs.inheritance.animal; // https://www.journaldev.com/644/inheritance-java-example

public class AnimalInheritanceTest {

	public static void main(String[] args) {
		Cat cat = new Cat(false, "Cat Food", 4);
		
		System.out.println("Cat is Vegetarian?: " + cat.isVegetarian());
		System.out.println("Cat eats " + cat.getEats());
		System.out.println("Cat has " + cat.getNoOfLegs() + " legs.");
		System.out.println("Cat color is " + cat.getColor());
	}

}

package ie.gmit.examsolutions;

public class Main {

	public static void main(String[] args) {

		ComputerStudent computerStudent1 = new ComputerStudent("Paul Brennan", 21, "Java");
		
		System.out.println("Name: " + computerStudent1.getName());
		System.out.println("Age: " + computerStudent1.getAge());
		System.out.println("Programming Language: " + computerStudent1.getFavouriteProgrammingLanguage());

	}

}

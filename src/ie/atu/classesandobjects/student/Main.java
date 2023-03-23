package ie.atu.classesandobjects.student;

//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//Student student1;
		//student1 = new Student();
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student(222222, "Jonny");

		//student1.getIdNumber();
		System.out.println(student1.getIdNumber());
		System.out.println(student2.getIdNumber());
		System.out.println(student3.getIdNumber());
		System.out.println(student1.getName());
		System.out.println(student2.getName());
		System.out.println(student3.getName());
		
		student1.setIdNumber(123456);
		
		System.out.println(student1.getIdNumber());
		
		student1.setName("Daniel Cregg");
		student2.setName("MJ Fox");
		System.out.println(student1.getName());
		System.out.println(student2.getName());
		
		// Student student2 = new Student();
		// System.out.println(student2.getIdNumber());
		// student2.setIdNumber(50);
		// System.out.println(student2.getIdNumber());

					//		Student student3 = new Student();
					//		Scanner userInput = new Scanner(System.in); // Detect input from the keyboard
					//		System.out.println("Please input a Student ID:");
					//		int integerInputStore = userInput.nextInt();
					//		student3.setIdNumber(integerInputStore);
					//		System.out.println(student3.getIdNumber());
//
//		userInput.close(); // Close the Scanner

	}

}

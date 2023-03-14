package ie.atu.inheritance.human;

public class Main {

	public static void main(String[] args) {

		// Create Student Object
		Student student1 = new Student();
		student1.setGrade(100);
		System.out.println(    student1.getGrade()  + " = Grade"   );
		System.out.println(    student1.getWeight()   +  "Kilos"   );
		
		//student1.drink();
		
	}

}



//		Lecturer lecturerObject = new Lecturer(100, "Maths");
//Student studentObject = new Student(80, 23);
//
//lecturerObject.eat(10);
//studentObject.eat(10);
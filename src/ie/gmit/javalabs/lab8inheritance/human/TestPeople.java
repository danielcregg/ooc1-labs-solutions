package ie.gmit.javalabs.lab8inheritance.human;

public class TestPeople {

	public static void main(String[] args) {
		Lecturer lecturerObject = new Lecturer(100, "Maths");
		Student studentObject = new Student(80, 23);

		lecturerObject.eat(10);
		studentObject.eat(10);

	}

}

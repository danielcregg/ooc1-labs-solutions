package ie.gmit.javalabs.lab8inheritance.human;

/*
 * Since the SuperClass declares a constructor (and therefore doesn't have the default, no-arg constructor that the 
 * compiler would otherwise provide) this is illegal - a class that extends BaseClass can't call super();
 * because there is not a no-argument constructor in BaseClass. This is probably a little counter-intuitive because
 * you might think that a subclass automatically has any constructor that the base class has.
 * The simplest way around this is for the base class to not declare a constructor (and thus have the default, 
 * no-arg constructor) or have a declared no-arg constructor (either by itself or alongside any other constructors).
 * But often this approach can't be applied - because you need whatever arguments are being passed into the constructor
 * to construct a legitimate instance of the super class.
 */
public class Student extends Human {

	private int grade;

	// Student(double weight) {
	// super(weight);
	// }

	Student(double weight, int grade) {
		super(weight);
		this.setGrade(grade);
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}

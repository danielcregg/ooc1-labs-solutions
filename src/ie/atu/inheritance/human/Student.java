package ie.atu.inheritance.human;

/*
 * Since the SuperClass declares a constructor (and therefore doesn't have the 
 * default, no-arg constructor that the compiler would otherwise provide) this 
 * is illegal - a class that extends BaseClass can't call super();
 * because there is not a no-argument constructor in BaseClass. This is probably 
 * a little counter-intuitive because you might think that a subclass 
 * automatically has any constructor that the base class has. The simplest way 
 * around this is for the base class to not declare a constructor (and thus have 
 * the default, no-arg constructor) or have a declared no-arg constructor 
 * (either by itself or alongside any other constructors). But often this 
 * approach can't be applied - because you need whatever arguments are being 
 * passed into the constructor to construct a legitimate instance of the super 
 * class.
 */
public class Student extends Human {

	// Instance Varibale
	private int grade;

	// Default Constructor
	public Student() {
		/*
		 * The super keyword in java is a reference variable that is used to 
		 * refer parent class objects. The keyword �super� comes into the picture 
		 * with the concept ofInheritance.
		 */
		super();
//		super(87.7);
		int grade = 0;
	}
	
	// Student(double weight) {
	// 		super(weight);
	// }

	//Student(double weight, int grade) {
	//		super(weight);
	//		this.setGrade(grade);
	//}

	// Getter
	public int getGrade() {
		return grade;
	}

	// Setter
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
//	public void drink() {
//		super.setWeight(super.getWeight() + 10);
//		System.out.println("You have drank. You now weight " + super.getWeight() + " kilos.");
//	}

}

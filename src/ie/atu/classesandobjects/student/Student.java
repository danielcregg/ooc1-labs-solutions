package ie.atu.classesandobjects.student;

/* Student class */
public class Student {

	// Instance Variables
	private int idNumber;
	private String name;
	//private boolean isRegistered;
	
	public Student() {
		this.idNumber = 999999;
		this.name = "blank";
	}
	
	public Student(int idNumber, String name) {
		this.idNumber = idNumber;
		this.name = name;
	}
	
	
	
	
	// Instance Methods
	public int getIdNumber() {
		return idNumber; // Stores id
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	
//	public void setIdNumber(int idNumber) {
//		this.idNumber = idNumber;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

package ie.atu.encapsulation;

/* File name : EncapTest.java */
public class EncapTest {
	private String idNum;
	private String name;
	private int age;
	
	public EncapTest() {
	}
	
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setAge(int age) {
		if (age < 0) {
			System.out.println("Invalid age");
		} else {
			this.age = age;
		}
	}

	public void setName(String name) {
		if (name != null && name.trim().length() > 0) {
			this.name = name;
		} else {
			System.out.println("ERROR: Invalid Input Argument");
		}
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
}

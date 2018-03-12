package ie.gmit.javalabs.encapsulation;

/* File name : EncapTest.java */
public class EncapTest {
	private String name;
	private String idNum;
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
		this.name = name;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
}

package ie.gmit.ooc2labs.serialization;

//Java code for serialization and deserialization of a Java object 
import java.io.*;

class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	transient int a;
	static int b;
	String name;
	int age;

	// Default constructor
	public Employee(int a, int b, String name, int age) {
		this.a = a;
		this.b = b;
		this.name = name;
		this.age = age;
	}

}

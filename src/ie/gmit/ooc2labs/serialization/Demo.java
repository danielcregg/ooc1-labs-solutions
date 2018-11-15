package ie.gmit.ooc2labs.serialization;

//Java code for serialization and deserialization of a Java objects state 
import java.io.Serializable;

public class Demo implements Serializable {
	// Used during Deserialization to verify that sender and receiver of a 
	// serialized object have loaded classes for that object which are 
	// compatible with respect to serialization.
	private static final long serialVersionUID = 1L;
	public int a;
	public String b;

	// Constructor
	public Demo(int a, String b) {
		this.a = a;
		this.b = b;
	}

}

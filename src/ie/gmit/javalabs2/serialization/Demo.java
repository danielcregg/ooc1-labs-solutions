package ie.gmit.javalabs2.serialization;

//Java code for serialization and deserialization of a Java objects state 
import java.io.*;

public class Demo implements Serializable {
	public int a;
	public String b;

	// Constructor
	public Demo(int a, String b) {
		this.a = a;
		this.b = b;
	}

}
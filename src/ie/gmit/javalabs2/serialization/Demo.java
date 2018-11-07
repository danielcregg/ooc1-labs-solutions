package ie.gmit.javalabs2.serialization;

//Java code for serialization and deserialization  
//of a Java object 
import java.io.*;

public class Demo implements java.io.Serializable {
	public int a;
	public String b;

	// Constructor
	public Demo(int a, String b) {
		this.a = a;
		this.b = b;
	}

}
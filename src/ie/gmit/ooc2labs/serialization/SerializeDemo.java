package ie.gmit.ooc2labs.serialization;

import java.io.*; // Must import java.io to implement serialization

public class SerializeDemo {
	public static void main(String[] args) {
		// Create Demo Object you want to serialize
		Demo demoObject1 = new Demo(1, "This is a String!");
		// Create Output file for the serialized object
		String filename = "file.ser";
		
		// Print Object variables
		System.out.println("a = " + demoObject1.a);
		System.out.println("b = " + demoObject1.b);
		// Add Space
		System.out.println("");
		
		// Serialize Object
		serializeObjectToFile(demoObject1, filename);
		// Deserialize Object
		serializeObjectFromFile(demoObject1, filename);

		System.out.println("a = " + demoObject1.a);
		System.out.println("b = " + demoObject1.b);
	}// Main
	
	private static void serializeObjectToFile(Object objectToBeSerialized, String fileOut) {
		try {
			// Create file output stream
			FileOutputStream fileOutStream = new FileOutputStream(fileOut);
			// Create Object Output Stream which writes objects to an OutputStream.
			ObjectOutputStream out = new ObjectOutputStream(fileOutStream);
	
			// Method for serialization of object
			out.writeObject(objectToBeSerialized);
	
			// Close write file
			out.close();
			// Close outout stream
			fileOutStream.close();
			
			System.out.println("Object has been serialized");
		}
		catch (IOException ioex) {
			System.out.println("IOException caught");
		}
	} // serializeObjectToFile
	
	private static void serializeObjectFromFile(Object objectToBeDeserialized, String fileToRead) {
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream(fileToRead);
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deserialization of object
			objectToBeDeserialized = in.readObject();

			in.close();
			file.close();

			System.out.println("\nObject has been deserialized\n");
		}
		catch (InvalidClassException icex) {
			System.out.println("InvalidClassException caught");
			icex.printStackTrace();
		}
		catch (IOException ioex) {
			System.out.println("IOException caught");
		}
		catch (ClassNotFoundException cnfex) {
			System.out.println("ClassNotFoundException caught");
		}
	} // serializeObjectFromFile
} // Class 
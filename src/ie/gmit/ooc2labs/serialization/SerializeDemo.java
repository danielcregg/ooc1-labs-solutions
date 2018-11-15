package ie.gmit.ooc2labs.serialization;

import java.io.*; // Must import java.io to implement serialization

public class SerializeDemo {
	public static void main(String[] args) {
		// Create Demo Object
		Demo demoObject1 = new Demo(1, "This is a String!");
		// Create Output file
		String filename = "file.ser";
		// Print Object variables
		System.out.println("a = " + demoObject1.a);
		System.out.println("b = " + demoObject1.b);
		// Add Space
		System.out.println("");

		/*********************
		 *   Serialization   *
		 *********************/
		try {
			// Saving of object in a file
			
			// Create file output stream
			FileOutputStream fileOutStream = new FileOutputStream(filename);
			// Create Object Output Stream which writes objects to an OutputStream.
			ObjectOutputStream out = new ObjectOutputStream(fileOutStream);

			// Method for serialization of object
			out.writeObject(demoObject1);
	
			// Close write file
			out.close();
			// Close outout stream
			fileOutStream.close();
			
			System.out.println("Object has been serialized");
		}
		catch (IOException ex) {
			System.out.println("IOException caught");
		}

		// Create empty demo object to store deserialized object
		Demo demoObject2 = null;

		/*********************
		 * Deserialization *
		 *********************/
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deserialization of object
			demoObject2 = (Demo) in.readObject();

			in.close();
			file.close();

			System.out.println("\nObject has been deserialized\n");

			System.out.println("a = " + demoObject2.a);
			System.out.println("b = " + demoObject2.b);
		}

		catch (IOException ex) {
			System.out.println("IOException caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException caught");
		}

	}
}

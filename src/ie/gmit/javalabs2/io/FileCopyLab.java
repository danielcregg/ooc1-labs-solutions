package ie.gmit.javalabs2.io;

import java.io.*;

public class FileCopyLab {

	public static void main(String[] args) {
		try {
			// Create File input Stream to get data from file.
			FileInputStream inputStream = new FileInputStream("in.txt");
			// Read in byte from file and store it
			int data = inputStream.read();
			// Print data to console
			System.out.println("Input data = " + data);
		} catch (FileNotFoundException fnfe) {
			System.out.println(fnfe);
		} catch (IOException ioe) {
			System.out.println(ioe);
		}
		
		
	}
}

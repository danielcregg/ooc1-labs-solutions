package ie.gmit.javalabs2.io;

import java.io.*;

public class FileCopyLab {

	public static void main(String[] args) {
		FileInputStream inputStream = null;
		try {
			// Create File input Stream to get data from file.
			inputStream = new FileInputStream("in.txt");
			// Read in byte from file and store it
			int data = inputStream.read();
			// Print data to console "Input data = 97"
			System.out.println("Input data = " + data);
		} catch (FileNotFoundException fnfe) {
			System.out.println(fnfe);
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			System.out.println(ioe);
			ioe.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException ioe) {
					System.out.println(ioe);
					ioe.printStackTrace();
				}
			}
		}
	}
}

package ie.gmit.javalabs2.io;

import java.io.*;

public class FileCopyLab {

	public static void main(String[] args) {
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		int data = 0;
		try {
			// Create File input Stream to get data from file.
			inputStream = new FileInputStream("in.txt");
			// Create File output Stream to send data to file.
			outputStream = new FileOutputStream("out.txt");
			// Read in byte from file and store it
			while((data = inputStream.read()) != -1) {
				// Write out byte from program and store it out.txt
				outputStream.write(data);
			}
			System.out.println("Copy Complete!");
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
			
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException ioe) {
					System.out.println(ioe);
					ioe.printStackTrace();
				}
			}
		}
	}
}

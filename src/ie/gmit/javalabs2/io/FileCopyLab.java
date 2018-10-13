package ie.gmit.javalabs2.io;

import java.io.*;

public class FileCopyLab {

	public static void main(String[] args) {
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		int data = 0;
		try {
			// Create File reader to get data from file.
			fileReader = new FileReader("in.txt");
			// Create File writer to send data to file.
			fileWriter = new FileWriter("out.txt");
			// Read in byte from file and store it
			while((data = fileReader.read()) != -1) {
				// Write out byte from program and store it out.txt
				fileWriter.write(data);
			}
			System.out.println("Copy Complete!");
		} catch (FileNotFoundException fnfe) {
			System.out.println(fnfe);
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			System.out.println(ioe);
			ioe.printStackTrace();
		} finally {
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException ioe) {
					System.out.println(ioe);
					ioe.printStackTrace();
				}
			}
			
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException ioe) {
					System.out.println(ioe);
					ioe.printStackTrace();
				}
			}
		}
	}
}

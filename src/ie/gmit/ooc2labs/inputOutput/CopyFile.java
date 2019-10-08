package ie.gmit.ooc2labs.inputOutput;

import java.io.*;

public class CopyFile {
	public static void main(String args[]) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("resources/input.txt");
			out = new FileOutputStream("resources/output.txt");
			int c;

			while ((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("Copy complete! See resources/output.txt");
		} catch (FileNotFoundException exceptionObject) {
			System.out.println("File NOT copied because file not found! See error below:");
			exceptionObject.printStackTrace();
			
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}

package ie.gmit.ooc2labs.io;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class CopyFile {
	public static void main(String args[]) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("resources/input.txt");
			out = new FileOutputStream("resources/output.txt");
			int c;

			while ((c = in.read()) != -1) {
				// Uncomment next 7 lines to see bytes copied - http://www.asciitable.com/
//				System.out.printf("%d - %c\n", c, c);
//				// Add sleep
//				try {
//					TimeUnit.SECONDS.sleep(1);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
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

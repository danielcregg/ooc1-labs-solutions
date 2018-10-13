package ie.gmit.javalabs2.io;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class CopyFile {

	public static void main(String args[]) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");

			int b;
			while ((b = in.read()) != -1) {
				// Uncomment to see bytes copied - http://www.asciitable.com/
				//System.out.println(b); 
				//System.out.printf("%d - %c\n", b, b); 
				// Add sleep
//				try {
//					TimeUnit.SECONDS.sleep(1);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				
				out.write(b);
			}
			System.out.println("\nFile copied");
		} catch (FileNotFoundException fnf) {
			System.out.println(fnf);
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

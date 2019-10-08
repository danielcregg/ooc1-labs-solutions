package ie.gmit.ooc2labs.inputOutput;

import java.io.*;

public class CopyFile {
	public static void main(String args[]) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("src/ie/gmit/ooc2labs/inputOutput/input.txt");
			out = new FileOutputStream("src/ie/gmit/ooc2labs/inputOutput/output.txt");
			int c;

			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (FileNotFoundException exceptionObject) {
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

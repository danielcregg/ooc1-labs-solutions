package ie.gmit.javalabs2.io;

import java.io.*;

public class ReadWriteBytes {

	public static void main(String[] args) throws Exception {
		File fileToCopy = new File(".\\resources\\hamlet.txt"); 
		File copyFileDest = new File(".\\resources\\hamletCopy.txt");
		FileInputStream inputStream = new FileInputStream(fileToCopy);
		InputStreamReader streamReader = new InputStreamReader(inputStream);
		BufferedReader br = new BufferedReader(streamReader);
		FileWriter out = new FileWriter(copyFileDest);
		
		String next;
		while((next = br.readLine()) != null) {
			out.write(next);
			out.write("\n");
		}
		
		System.out.println(fileToCopy.getName() + " has been copied to " + copyFileDest.getName());
		
		// Clean up
		out.flush();
		out.close();
		br.close();
	}

}

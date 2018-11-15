package ie.gmit.ooc2labs.io;

import java.util.Scanner;
import java.util.Formatter;
import java.io.File;
import java.io.IOException;
   
public class FileIOTest {  // saved as "FileIOTest.java"
   public static void main (String [] args) throws IOException {
      Scanner in = new Scanner(new File("in.txt"));        // file input
      Formatter out = new Formatter(new File("out.txt"));  // file output
   
      int a = in.nextInt();
      int b = in.nextInt();
      out.format("%d\n",a+b);  // format() has the same syntax as printf()
      System.out.println("Output have been created...");
      
      in.close();	// Close the scanner object	
      out.close();    // flush the output and close the output file
   }
}
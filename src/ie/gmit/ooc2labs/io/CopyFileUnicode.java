package ie.gmit.ooc2labs.io;

import java.io.*;
public class CopyFileUnicode {

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader("resources/input.txt");
         out = new FileWriter("resources/output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
        	 // Uncomment to see bytes copied - http://www.asciitable.com/
        	 //System.out.println(c);
        	 System.out.printf("%d - %c\n", c, c);
             out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}

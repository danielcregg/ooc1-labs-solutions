package ie.gmit.javalabs2.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsArrayList {

	public static void main(String[] args) {
		
		// 1 - Create an Array that holds 3 Strings
		String[] arrayOf3Strings = new String[3];
		
		// Print Array
		System.out.println(Arrays.toString(arrayOf3Strings));
		
		// 2 - Add three strings to the array
		arrayOf3Strings[0] = "Dan";
		arrayOf3Strings[1] = "Joe";
		arrayOf3Strings[2] = "Jim";
		
		// Print Array
		System.out.println(Arrays.toString(arrayOf3Strings));
		
		// alternative for 1 and 2
        //String[] arrayOf3Strings = {"Dan","Joe","Jim"};
		
		// 3 - Add 4th String to array
		//arrayOf3Strings[3] = "Joy";
 
        //4 - Create a new array that can hold 4 strings
        String[] arrayOf4Strings = new String[arrayOf3Strings.length + 1];
        
        // Print Array
     	System.out.println(Arrays.toString(arrayOf4Strings));
     		
		// 5 - Copy the first array elements into the second array
		for (int i = 0; i < arrayOf3Strings.length; i++) {
			arrayOf4Strings[i] = arrayOf3Strings[i];
		}
		
        // 5 - Alternative solution - use arraycopy 
        //System.arraycopy(arrayOf3Strings, 0, arrayOf4Strings, 0, arrayOf3Strings.length);
        
        // Print Array
     	System.out.println(Arrays.toString(arrayOf4Strings));
     	
     	// 6 - Add 4th element to the array
     	arrayOf4Strings[3] = "Joy";
		
        // 6 - Alternative solution
		//arrayOf4Strings[arrayOf4Strings.length - 1] = "Joy";
 
        // Print Array
     	System.out.println(Arrays.toString(arrayOf4Strings));
		
        //copy the address to the old reference 
        //the old array values will be deleted by the Garbage Collector
     	//arrayOf3Strings = arrayOf4Strings;
		
     	//System.out.println(Arrays.toString(arrayOf3Strings));
     	
     	// 7 - Convert Array to List 
     	List<String> arrayListOfStrings = new ArrayList<String>(Arrays.asList(arrayOf4Strings));
     	
     	System.out.println(arrayListOfStrings);
     	
     	// 8 - Add a 5th element
     	arrayListOfStrings.add("Amy");
     	System.out.println(arrayListOfStrings);
	}

}

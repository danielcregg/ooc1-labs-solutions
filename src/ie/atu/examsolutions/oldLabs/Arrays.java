package ie.atu.examsolutions.oldLabs;


public class Arrays {

	public static void main(String[] args) {
		// datatype[] identifier; //preferred way
		// or
		// datatype identifier[]; //discouraged
		
		// declares an array of doubles called values
		double[] values;    //preferred way
		// double values[]; //discouraged way
		
		// allocates memory for 10 doubles
		values = new double[10];
		
		// Declare and allocate on same line
		//double[] values = new double[10];
		
		// declare and initialize all together;
		double[] otherValues = {1,2,3,4,5,6,7,8,9,10};
		
		 // initialize first element
        values[0] = 100.1;
        // initialize second element
        values[1] = 200.1;
		
        // Access array element number 2
        System.out.println(values[1]);
        System.out.println(otherValues[1]);
		
        // Find length of array (i.e. how many elements in array)
        System.out.println(values.length);
        //ERROR - Array length is 10 but elements indexed from 0 to 9 
        //System.out.println(values[values.length]);
        System.out.println(values[values.length - 1]);
		
	}

}

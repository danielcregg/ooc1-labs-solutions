package ie.gmit.ooc2labs.args;

class ConvertArgsFormat {
	public static void main(String args[]) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a + b;
		System.out.println("The sum of " + a + " and " + b + " is: " + c);
	} // end of main
}// end of class

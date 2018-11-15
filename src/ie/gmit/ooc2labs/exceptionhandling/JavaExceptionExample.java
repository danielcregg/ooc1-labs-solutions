package ie.gmit.ooc2labs.exceptionhandling;

public class JavaExceptionExample {
	public static void main(String args[]) {
		try {
			// code that may raise exception
			int data = 100 / 0;
			
			System.out.println(data);
		} catch (Exception exception) {
			System.out.println(exception);
		}
		// rest code of the program
		System.out.println("Program continues running rest of the code...");
	}
}

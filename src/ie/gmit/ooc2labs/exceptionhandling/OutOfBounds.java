package ie.gmit.ooc2labs.exceptionhandling;

public class OutOfBounds {

	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4 };

		try {
			System.out.println(num[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown  :" + e);
		}
		System.out.println("Out of the block");
	}

}

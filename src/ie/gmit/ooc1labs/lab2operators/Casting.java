package ie.gmit.ooc1labs.lab2operators;

public class Casting {
	public static void main(String[] args) {
		//Widening Casting(Implicit)
		byte b = 65;
		int i = b;
		float f = i;
		long l = (long) f;
		double d = l;
		char  c = (char) d;
		System.out.println("Result: " + c);
		
		//Narrowing Casting(Explicitly done)
		d = 65.0d;
		l = (long) d;
		f = (float) l;
		i = (int) f;
		b = (byte) i;
		c = (char) b;
		System.out.println("Result: " + c);
		
		float danFloat = 3.14f;
		int danInt = (int) danFloat;
		System.out.println(danInt);
		
	}
}

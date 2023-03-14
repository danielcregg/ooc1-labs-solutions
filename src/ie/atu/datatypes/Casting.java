package ie.atu.datatypes;

public class Casting {
	public static void main(String[] args) {
		//Widening Casting (Implicit)
		byte b = -128;
		short s = b;
		int i = s;
		float f = i;
		double d = f;
		System.out.println("Result: " + d);
		
		//Narrowing Casting (Explicitly done)
		d = 127.0d;
		f = (float) d;
		i = (int) f;
		s = (short) i;
		b = (byte) s;
		System.out.println("Result: " + b);
	
		// Pi is exactly 3
		float danFloat = 3.14f;
		int danInt = (int) danFloat;
		System.out.println(danInt);
		
	}
}

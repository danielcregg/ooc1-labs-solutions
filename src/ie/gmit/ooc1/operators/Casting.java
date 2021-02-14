package ie.gmit.ooc1.operators;

public class Casting {
	public static void main(String[] args) {
		//Widening Casting(Implicit)
		byte b = 65;
		int i = b;
		float f = i;
		long l = (long) f;
		double d = l;
		System.out.println("Result: " + d);
		
		
		//Narrowing Casting(Explicitly done)
		d = 127.0d;
		l = (long) d;
		f = (float) l;
		i = (int) f;
		b = (byte) i;
		System.out.println("Result: " + b);
	
		// Pi is exactly 3
		float danFloat = 3.14f;
		int danInt = (int) danFloat;
		System.out.println(danInt);
		
	}
}

package ie.atu.intro;

public class Loops {
	public static void main(String[] args) {
		int a = 5, b = 10;

		for (int i = 1; i<=100; i++ ) {
			System.out.print(i + " " );
		}
		
		int z = 100;
		while(z > 0) {
			System.out.print(z + " ");
			z--;
		}
		
		String myString = "Timmy";
		System.out.println(myString.length());
		myString = "Daniel Cregg";
		System.out.println(myString.replace(" ", "").length());
		
		// System.out.println(a*b);
		multiply(a, b);
	}

	private static void multiply(int x, int y) {
		System.out.println(x * y);
	}

}

package ie.gmit.ooc1lectures;

public class Methods {

	public static void main(String[] args) {
		
		//System.out.println("fdsklfhdslk");
		
		printStuff();
	}

	public static void printStuff() {
		System.out.println("Hello");
		System.out.println("fdsklfhdslk");
	}

	public static int minFunction(int n1, int n2) {
		int min;
		if (n1 > n2)
			min = n2;
		else
			min = n1;
		return min;
	}

}

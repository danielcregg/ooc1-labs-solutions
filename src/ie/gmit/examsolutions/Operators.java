package ie.gmit.examsolutions;

public class Operators {

	public static void main(String[] args) {
		int x = 4, y = 9, z = 17;
		
		System.out.println(x >= 10 || y < 10);
		System.out.println(++x <= z-- && z != x);
		System.out.println(y++ > (x * 2) && (x + 7) >= z);
		System.out.println(!(x++ < 5) && (y - z) > -x || (z++ - y) >= (x + y));
	}

}

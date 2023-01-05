package ie.atu.examsolutions;

public class Operators {

	public static void main(String[] args) {
//		int x = 4, y = 9, z = 17;
//		
//		System.out.println(x >= 10 || y < 10);
//		System.out.println(++x <= z-- && z != x);
//		System.out.println(y++ > (x * 2) && (x + 7) >= z);
//		System.out.println(!(x++ < 5) && (y - z) > -x || (z++ - y) >= (x + y));
		
		
		int x = 5, y = 8, z = 16;
		
		System.out.println(y < x || y <= (x * 2));
		System.out.println(--x * 5 >= z++ && z == (y + x));
		System.out.println(y-- > (x / 2) && (x + x) >= z);
		System.out.println(x++ < z && !((y - z) > -x) || (x++ - y) <= (x + y--));
		
	}

}

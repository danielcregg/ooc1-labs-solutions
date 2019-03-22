package ie.gmit.ooc1labs.lab9polymorphism.overloading;

public class Machine {
	
	void printer(int a){
		System.out.println(a);
	}
	
	// printer(int) = method signature
	
	void printer(boolean b){
		System.out.println(b);
	}
	// printer(boolean)
	void printer(int a, boolean b, char c, double d){
		System.out.println(a + " " + b + " " + c + " " + d);
	}
	// printer(int, boolean, char, double)
	
	
	
	
	
	
	
	

//	void printer(int a){
//		System.out.println(a);
//	}
//	
//	void printer(String a){
//		System.out.println(a);
//	}
//	
//	void printer(boolean a, int b, boolean c, float d){
//		System.out.println(a +" "+ b +" "+ c +" "+ d);
//	}
//	
}

package ie.gmit.ooc1labs.encapsulation;

public class EncapTestDriver {

	public static void main(String[] args) {
		EncapTest encapTest = new EncapTest();
		encapTest.setAge(29);
		System.out.println(encapTest.getAge());
		encapTest.setAge(124);
		System.out.println(encapTest.getAge());
		
		
		
		
		encapTest.setAge(-100);
		
		
	}

}

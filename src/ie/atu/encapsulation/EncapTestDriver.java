package ie.atu.encapsulation;

public class EncapTestDriver {

	public static void main(String[] args) {
		EncapTest encapTest = new EncapTest();
		encapTest.setAge(29);
		System.out.println(encapTest.getAge());
		encapTest.setAge(124);
		System.out.println(encapTest.getAge());
		encapTest.setAge(-100);
		
		
		
		
		
//		encapTest.setName(null);
//		encapTest.setName("          ");
//		encapTest.setName("Tom");
//		System.out.println(encapTest.getName());
	}

}

package ie.gmit.javalabs.lab10abstraction.shoppingTrolley;

public class LineItemDriver {

	public static void main(String[] args) {
		LineItemImpl lineItem1 = new LineItemImpl("AA1", "Xbox");
		LineItemImpl lineItem2 = new LineItemImpl("AA2", "PlayStation", 5, 500.00f);
		
		System.out.println(lineItem1.getItemName());
		System.out.println(lineItem2.getItemName());
	}

}

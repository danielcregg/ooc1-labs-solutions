package ie.atu.lab10abstraction.shoppingTrolley;

public class LineItemImpl implements LineItem {
	
	private String number;
	private String name;
	private int	quantity;
	private float price;
	
	// Constructor
	public LineItemImpl(String number, String name) {
		this.number = number;
		this.name = name;
	}

	public LineItemImpl(String number, String name, int quantity, float price) {
		this.number = number;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	//@Override
	public void setItemNumber(String number) {
		this.number = number;
	}

	//@Override
	public String getItemNumber() {
		return this.number;
	}

	@Override
	public void setItemName(String name) {
		this.name = name;
	}

	@Override
	public String getItemName() {
		return this.name;
	}

	@Override
	public void setItemQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int getItemQuantity() {
		return this.quantity;
	}

	@Override
	public void setItemPrice(float price) {
		this.price = price;
	}

	@Override
	public float getItemPrice() {
		return this.price;
	}

}

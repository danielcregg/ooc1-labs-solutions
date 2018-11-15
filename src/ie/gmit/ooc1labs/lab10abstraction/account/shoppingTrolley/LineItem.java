package ie.gmit.ooc1labs.lab10abstraction.account.shoppingTrolley;

public interface LineItem {

	public void setItemNumber(String number);

	public String getItemNumber();

	public void setItemName(String name);

	public String getItemName();

	public void setItemQuantity(int quantity);

	public int getItemQuantity();

	public void setItemPrice(float price);

	public float getItemPrice();

}

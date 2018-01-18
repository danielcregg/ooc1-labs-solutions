package ie.gmit.javalabs.oldLabs.cashRegister;


/**
* A simulated cash register that tracks the item count and
* the total amount due.
* 
*/
public class CashRegister {

	private int itemCount;
	private double totalPrice;
 
/**
 * Adds an item to this cash register.
 * @param price the price of this item
 */
public void addItem(double price) {
    itemCount++;
    totalPrice = totalPrice + price;
}
 
/**
 * Gets the price of all items in the current sale.
 * @return the total amount
 */
public double getTotal() {
    return totalPrice;
}
 
/**
 * Gets the number of items in the current sale.
 * @return the item count
 */
public int getCount() {
    return itemCount;
}
 
/**
 * Clears the item count and the total.
 */
public void clear() {
    itemCount = 0;
    totalPrice = 0;
}
 
}


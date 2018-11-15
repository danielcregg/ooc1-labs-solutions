package ie.gmit.examsolutions.oldLabs.cashRegister;


public class CashRegisterTest {

	public static void main(String[] args) {
		/**
		 * creates 3 new cash register objects
		 * with items added to find the total count and total value of 
		 * the elements in each object.
		 * @param args
		 */
		CashRegister reg = new CashRegister();
		reg.clear();
		reg.addItem(0.95);
		reg.addItem(0.95);
		CashRegister reg1 = new CashRegister();
		reg1.addItem(3.25);
		reg1.addItem(1.95);
		CashRegister reg2 = new CashRegister();
		reg2.addItem(3.25);
		reg2.clear();
		System.out.printf("Number of items = " + reg.getCount() + " " + "Total Cost = €" + "%.2f", reg.getTotal());
		System.out.println("\nNumber of items = " + reg1.getCount() + " " + "Total Cost = €" + reg1.getTotal());
		System.out.println("Number of items = " + reg2.getCount() + " " + "Total Cost = €" + reg2.getTotal());
	}
}

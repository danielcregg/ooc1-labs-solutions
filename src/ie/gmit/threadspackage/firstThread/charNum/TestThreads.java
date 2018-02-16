package ie.gmit.threadspackage.firstThread.charNum;

public class TestThreads {
	// Main method
	public static void main(String[] args) {
		
		// Create threads
		PrintChar printA = new PrintChar('a', 10);
		PrintChar printB = new PrintChar('b', 10);
		PrintNum print1000 = new PrintNum(10);

		// Start threads
		print1000.start();
		printA.start();
		printB.start();
	}
}

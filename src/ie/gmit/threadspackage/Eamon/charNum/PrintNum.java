package ie.gmit.threadspackage.Eamon.charNum;

public class PrintNum extends Thread {
	
	private int lastNum;

	// Construct a thread for print 1, 2, ... i
	public PrintNum(int n) {
		lastNum = n;
	}
	
	public void run() {
		for (int i = 1; i <= lastNum; i++)
			System.out.print(" " + i);
	}
}

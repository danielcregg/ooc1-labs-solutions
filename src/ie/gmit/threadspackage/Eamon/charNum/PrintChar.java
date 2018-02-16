package ie.gmit.threadspackage.Eamon.charNum;

public class PrintChar extends Thread {
	
	private char charToPrint; // The character to print
	private int times; // The times to repeat

	// Construct a thread with specified character and number of
	// times to print the character
	public PrintChar(char charToPrint, int times)	{
		this.charToPrint = charToPrint;
		this.times = times;
	}

	// Override the run() method to tell the system
	// what the thread will do
	public void run() {
		for (int i=1; i <= times; i++)
		System.out.print(charToPrint);
	}
}

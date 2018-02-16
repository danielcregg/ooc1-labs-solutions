package ie.gmit.threadspackage.RunnableDemo;

public class RunnableDemoDriver {

	public static void main(String args[]) {
		RunnableDemo runnableObject = new RunnableDemo();
		Thread thread1 = new Thread(runnableObject);
		Thread thread2 = new Thread(runnableObject);
		thread1.start();
		thread2.start();
	}
	
}
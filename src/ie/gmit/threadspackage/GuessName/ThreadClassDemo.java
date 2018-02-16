package ie.gmit.threadspackage.GuessName;

//File Name : ThreadClassDemo.java
public class ThreadClassDemo {

	public static void main(String[] args) {
		
		System.out.println("Starting thread3...");
		Thread thread3 = new GuessANumber(27);
		thread3.start();
		try {
			thread3.join();
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted.");
		}
		System.out.println("Starting thread4...");
		Thread thread4 = new GuessANumber(75);

		thread4.start();
		System.out.println("main() is ending...");
	}
}
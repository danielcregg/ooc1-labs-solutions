package ie.gmit.threadspackage.ThreadDemo;

public class ThreadDemoDriver {

	public static void main(String args[]) {
		Thread thread1 = new ThreadDemo();
		Thread thread2 = new ThreadDemo();
		thread1.setName("Thread 1");
		thread2.setName("Thread 2");
		thread2.setPriority(10);
		thread1.start();
		thread2.start();
	}

}

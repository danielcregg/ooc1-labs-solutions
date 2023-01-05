package ie.atu.threadspackage.RunnableDemo;

class RunnableDemo implements Runnable {

	public void run() {
		System.out.println("Thread Running");
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(10); // Let thread sleep for 10 millisecond
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("Thread exiting");
	}

}

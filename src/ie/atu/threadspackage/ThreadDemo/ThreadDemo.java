package ie.atu.threadspackage.ThreadDemo;

class ThreadDemo extends Thread {

	public void run() {
		
		System.out.println(this.getName() +" is Running");
		for (int i = 10; i > 0; i--) {
			System.out.println(this.getName()+ ": " + i);
//			try {
//				Thread.sleep(10); // Let thread sleep for 10 millisecond
//			} catch (InterruptedException e) {
//				System.out.println(e);
//			}
		}
		System.out.println(this.getName() +" is Exiting");
	}

}

package ie.gmit.threadspackage.ThreadMaker;

public class ThreadMakerDriver {

	public static void main(String[] args) {
		ThreadMaker tm = new ThreadMaker();
		Thread t = new Thread(tm);
		//Thread t2 = new Thread(tm);
		t.start();
		//t2.start();
	}

}

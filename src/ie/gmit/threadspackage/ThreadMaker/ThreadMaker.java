package ie.gmit.threadspackage.ThreadMaker;

public class ThreadMaker implements Runnable{
	
	public void run() {
		System.out.println("This");
		try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}  // Put Thread to sleep for 1000 milliseconds (i.e. 1 second)
		System.out.println("is");
		try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}  
		System.out.println("a");
		try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}  
		System.out.println("Thread");
		try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}  
		System.out.println("Executing");
	}
	
}

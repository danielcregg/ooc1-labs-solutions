package ie.atu.threadspackage.firstThread.firstThread;

public class MyFirstThread {

	public static void main(String args[]) {
		Worker runner = new Worker();
		
		runner.start();
		
		System.out.println("I Am The Main Thread - I'm going to sleep for a while");

	  //try
		// {
		//  Thread.sleep(4000);
		//  System.out.println("I am the main thread -0 back from my snooze");
		// }
	  //catch (java.lang.InterruptedException ie)
	 // {
	 // System.out.println(ie);
     //       }

      for (int i=0; i<1000000; i++) {
		//   try
		//  		 {
		//  		  Thread.sleep(2000);
		//  		  System.out.println("   - I am the main thread and I'm awake again");
		//  		 }
	  	//	catch (java.lang.InterruptedException ie)
		//	  {
		//		System.out.println(ie);
		//	  }
		  System.out.print("Main" + i + " ");
		  System.out.println();
      }
	  	System.out.println();
	  }
	
}

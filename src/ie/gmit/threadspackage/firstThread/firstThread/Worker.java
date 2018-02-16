package ie.gmit.threadspackage.firstThread.firstThread;

class Worker extends Thread {
	 
	public void run() {
	    System.out.println("I am a Worker Thread");
	    System.out.println("Here's some Work I am doing....");
	
	    for (int i=0; i<1000000; i++)
		        {
		  		  // try
		  		  //		 {
		  		  //		  Thread.sleep(1000);
		  		  //		  System.out.println("   - I am the worker thread and I'm awake again");
		  		  //		 }
		  	  		//catch (java.lang.InterruptedException ie)
		  			//  {
		  			//	System.out.println(ie);
		  			//  }
		  		  System.out.print("WT " + i + " ");
		  		  System.out.println();
		  	  }
		  System.out.println();
	
	}

}
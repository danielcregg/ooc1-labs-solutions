package ie.atu.threadspackage.Jabber;

class Jabber implements Runnable {
	
	String str;
	
	public Jabber(String s) {
		str = s; 
	} //end Jabber constructor
	
	public void run() {
		 for (int i = 0; i < 10; i++) {
			 System.out.println(str);
			 try{Thread.sleep(1);}catch(InterruptedException e){System.out.println(e);}  // Sleep for 1 millisecond
	  	  } // end for
	} //end run
	
} //end class

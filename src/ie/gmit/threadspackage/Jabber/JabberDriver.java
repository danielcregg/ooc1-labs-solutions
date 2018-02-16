package ie.gmit.threadspackage.Jabber;

public class JabberDriver {

	public static void main(String[] args) {
		Jabber j = new Jabber("Daniel");
		Jabber k = new Jabber("Cregg");
		Thread t = new Thread(j);
		Thread u = new Thread(k);
		t.start();
		u.start();
	} // end main

} // end class

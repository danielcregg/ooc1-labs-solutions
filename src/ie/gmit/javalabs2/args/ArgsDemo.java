package ie.gmit.javalabs2.args;

public class ArgsDemo {

	public static void main(String[] args) {
		System.out.println("The args object ID is " + args);
		System.out.println("The number of args is " + args.length);

		System.out.println("The Arguments are:");
		for (int i = 0; i < args.length; i++) {

			// if (args[i].equals("GMIT")) {
			// System.out.println(args[i] + " ROCKS!");
			// } else {
			System.out.println(args[i]);
			// }
		}
		
		System.out.println("The Arguments backwards are:");
		for (int x = args.length - 1; x >= 0; x--) {
			System.out.println(args[x]);
		}
		
		System.out.println("Every Second Argument is:");
		for (int i = 0; i < args.length; i+=2) {
			System.out.println(args[i]);
		}
	}
}

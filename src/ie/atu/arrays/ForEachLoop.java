package ie.atu.arrays;

public class ForEachLoop {

	public static void main(String[] args) {

		int[] numericals = {100, 200, 300, 400, 500};

		for (int i = 0; i < numericals.length; i++) {
			System.out.print(numericals[i]);
			System.out.print(",");
		}

		//System.out.print(numericals[0]);
		
		System.out.println(); // adding space

		for (int u : numericals) {
			System.out.print(u);
			System.out.print(",");
		}

		System.out.print(numericals[0]);
		
		System.out.println(); // adding space

		String[] titles = { "William", "Beatrice", "Lucy", "Sam" };
		for (String name : titles) {
			System.out.print(name);
			System.out.print(",");
		}

	}

}

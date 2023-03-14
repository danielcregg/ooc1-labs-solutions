package ie.atu.controlflow.loops;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		int timesTableNum = 6;
		int from = 1;
		int to = 12;

		for (int i = from; i <= to; i++) {
			//i;
			//System.out.println(i);
			//timesTableNum * i;
			//System.out.println(timesTableNum * i);
			System.out.println( timesTableNum + " X " + i + " = " + timesTableNum * i);
		}
		
	}

}

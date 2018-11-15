package ie.gmit.ooc2labs.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListPerf {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		final int NUM_OPERATIONS = 100000;
		
		// Initialise Timers
		long startTime = 0;
		long endTime = 0;
		
		// Initialise Time Value Storage
		long arrayListAddTime = 0;
		long linkedListAddTime = 0;
		long arrayListGetTime = 0;
		long linkedListGetTime = 0;
		long arrayListRemoveTime = 0;
		long linkedListRemoveTime = 0;
				
		// ArrayList add
		startTime = System.nanoTime();
			for (int i = 0; i < NUM_OPERATIONS; i++) {
				arrayList.add(0, i); // Add to start of list
			}
		endTime = System.nanoTime();
		
		arrayListAddTime = endTime - startTime;
		System.out.println("ArrayList add:\t\t" + arrayListAddTime + "ns");

		// LinkedList add
		startTime = System.nanoTime();
			for (int i = 0; i < NUM_OPERATIONS; i++) {
				linkedList.add(0, i);
			}
		endTime = System.nanoTime();
		
		linkedListAddTime = endTime - startTime;
		System.out.println("LinkedList add:\t\t" + linkedListAddTime + "ns");

		// ArrayList get
		startTime = System.nanoTime();
			for (int i = 0; i < NUM_OPERATIONS; i++) {
				arrayList.get(i);
			}
		endTime = System.nanoTime();
		
		arrayListGetTime = endTime - startTime;
		System.out.println("ArrayList get:\t\t" + arrayListGetTime + "ns");

		// LinkedList get
		startTime = System.nanoTime();
			for (int i = 0; i < NUM_OPERATIONS; i++) {
				linkedList.get(i);
			}
		endTime = System.nanoTime();
		
		linkedListGetTime = endTime - startTime;
		System.out.println("LinkedList get:\t\t" + linkedListGetTime + "ns");

		// ArrayList remove
		startTime = System.nanoTime();
			for (int i = arrayList.size(); i > 0; i--) {
				arrayList.remove(0); // Remove First element
			}
		endTime = System.nanoTime();
		
		arrayListRemoveTime = endTime - startTime;
		System.out.println("ArrayList remove:\t" + arrayListRemoveTime + "ns");

		// LinkedList remove
		startTime = System.nanoTime();
			for (int i = linkedList.size(); i > 0; i--) {
				linkedList.remove(0); // Remove First element
			}
		endTime = System.nanoTime();
		
		linkedListRemoveTime = endTime - startTime;
		System.out.println("LinkedList remove:\t" + linkedListRemoveTime + "ns");
		
		// Print Winners
		System.out.println("=============================================");
		if (arrayListAddTime < linkedListAddTime) {
			System.out.println("ArrayList Add was faster than LinkedList");
		} else {
			System.out.println("LinkedList Add was faster than ArrayList");
		}
		
		if (arrayListGetTime < linkedListGetTime) {
			System.out.println("ArrayList Get was faster than LinkedList");
		} else {
			System.out.println("LinkedList Get was faster than ArrayList");
		}
		
		if (arrayListRemoveTime < linkedListRemoveTime) {
			System.out.println("ArrayList Remove was faster than LinkedList");
		} else {
			System.out.println("LinkedList Remove was faster than ArrayList");
		}
		System.out.println("=============================================");
	}

}

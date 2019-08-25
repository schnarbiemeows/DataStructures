package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dylan
 *
 */
public class AddUpToFive {

	final static int TOTAL = 6;
	final static int NEG9999 = -9999;

	/**
	 * lets say you have a list of integers // find all pairs that add up to the
	 * number 5(or other number) // this solution is O(2n) with code to handle the
	 * special situation // of pairs of TOTAL/2 // also eliminates duplicates //
	 * also, does not require ordering of the list!
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// int[] intArray =
		// {20,35,-15,7,55,1,-22,3,3,3,6,0,6,6,-1006,1012,1012,-1006,-1006};
		long startTime = System.currentTimeMillis();
		int[] intArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		Map<Integer, Integer> tempMap = new HashMap();
		/*
		 * we have tricky manipulation to avoid a duplicate pair for the half total
		 * value if there are 2 half totals in the array(ex. 3,3, where the total = 6)
		 */
		boolean even = TOTAL % 2 == 0;
		int halftotalcount = 0;
		// go through the list and put its value in the cell located at the paired
		// location, TOTAL-item
		for (int item : intArray) {
			// O(n) loop
			Integer key = new Integer(item);
			Integer pairedValue = new Integer(TOTAL - item);
			if (even && key.intValue() == TOTAL / 2) {
				halftotalcount++;
			} else {
				tempMap.put(pairedValue, key);
				if (tempMap.containsKey(key) && key.intValue() != pairedValue.intValue()) {
					// should remove duplicates
					tempMap.remove(key);
				}
			}
		}
		boolean foundPair = false;
		// first, print out any pairs of TOTAL/2 that were present in the array
		for (int i = 0; i < halftotalcount / 2; i++) {
			// O(n/2)
			foundPair = true;
			System.out.println("pair : (" + TOTAL / 2 + "," + TOTAL / 2 + ")");
		}
		// finally, go through the list one more time, looking in the map for an entry
		// for each key
		for (int item : intArray) {
			// O(n) loop
			Integer key = new Integer(item);

			if (tempMap.containsKey(key)) {
				foundPair = true;
				System.out.println("pair : (" + item + "," + tempMap.get(key).intValue() + ")");
			}
		}
		if (!foundPair)
			System.out.println("no pairs found");
		long endtime = System.currentTimeMillis();
		System.out.println("total time = " + (endtime - startTime));
		tempMap = null;
	}

}

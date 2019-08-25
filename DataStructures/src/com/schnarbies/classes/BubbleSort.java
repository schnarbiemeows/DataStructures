package com.schnarbies.classes;

/**
 *
 * @author dylan
 *
 */
public class BubbleSort {

	/**
	 * O(n^2) sort unsorted partition index = 6 - this is the last index of the
	 * unsorted partition i = 0 - index used to traverse the array from left to
	 * right
	 *
	 * each time we traverse through the array, we migrate the highest number to the
	 * end of the array
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int currentIndex = 0; currentIndex < lastUnsortedIndex; currentIndex++) {
				if (intArray[currentIndex] > intArray[currentIndex + 1]) {
					swap(intArray, currentIndex, lastUnsortedIndex);
				}
			}
		}
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

	/**
	 *
	 * @param intArray
	 * @param currentIndex
	 * @param lastUnsortedIndex
	 */
	private static void swap(int[] intArray, int currentIndex, int lastUnsortedIndex) {
		if (currentIndex == lastUnsortedIndex)
			return;
		int temp = intArray[lastUnsortedIndex];
		intArray[lastUnsortedIndex] = intArray[currentIndex];
		intArray[currentIndex] = temp;
	}

}

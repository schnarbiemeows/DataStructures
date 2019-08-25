package com.schnarbies.classes;

import java.util.Arrays;

/**
 *
 * @author dylan
 *
 */
public class BinarySearch {

	/**
	 * lecture 85,86 - binary search requires that the data be sorted
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22, 77 };
		Arrays.sort(intArray);
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		System.out.println(binarySearch(intArray, 55, 0, 7));
		System.out.println(binarySearch(intArray, -22, 0, 7));
		System.out.println(binarySearch(intArray, 7, 0, 7));
		System.out.println(binarySearch(intArray, 1, 0, 7));
		System.out.println(binarySearch(intArray, 20, 0, 7));
		System.out.println(binarySearch(intArray, 77, 0, 7));

	}

	/**
	 * my binary search solution
	 *
	 * @param input
	 * @param value
	 * @param start
	 * @param finish
	 * @return
	 */
	public static int binarySearch(int[] input, int value, int start, int finish) {
		if (start >= finish && !(input[start] == value)) {
			return -1;
		} else {
			int midpoint = (start + finish) / 2;
			if (input[midpoint] == value) {
				return midpoint;
			} else {
				if (input[midpoint] > value) {
					int newfinish = midpoint;
					return binarySearch(input, value, start, newfinish);
				} else {
					int newStart = midpoint + 1;
					return binarySearch(input, value, newStart, finish);
				}
			}
		}
	}
}

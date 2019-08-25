package com.schnarbies.classes;

/**
 * @author dylan
 *
 */
public class LinearSearchMain {

	/**
	 * lecture 84 -linear search
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		System.out.println(linearSearch(intArray, -15));

	}

	/**
	 * @param input
	 * @param value
	 * @return
	 */
	public static int linearSearch(int[] input, int value) {
		for (int i = 0; i < input.length; i++) {
			if (input[i] == value) {
				return i;
			}
		}
		return -1;
	}

}

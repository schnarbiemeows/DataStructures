package com.schnarbies.classes;

/**
 * @author dylan
 *
 */
public class RadixSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] intArray = { 4724, 4586, 1330, 8792, 1594, 5729 };
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.print("\n");
		radixSort(intArray, 10, 4);
	}

	/**
	 * @param input
	 * @param radix
	 * @param width
	 */
	public static void radixSort(int[] input, int radix, int width) {
		for (int i = 0; i < width; i++) {
			radixSingleSort(input, i, radix);
			for (int x = 0; x < input.length; x++) {
				System.out.print(input[x] + " ");
			}
			System.out.print("\n");
		}

	}

	/**
	 * @param input
	 * @param position
	 * @param radix
	 */
	public static void radixSingleSort(int[] input, int position, int radix) {
		int numItems = input.length;
		int[] countArray = new int[radix];
		// make a count array that counts the occurrence of each digit
		for (int value : input) {
			countArray[getDigit(position, value, radix)]++;
		}
		// adjust the count array ex: if countArray = [ 1, 1, 1, 1 ]
		for (int j = 1; j < countArray.length; j++) {
			countArray[j] += countArray[j - 1];
		}
		// countArray would now be = [ 1, 2, 3, 4 ]
		int[] temp = new int[numItems];
		// this code makes sure that the sorting is stable
		for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
			temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
		}
		// copy items from the temp array back to the input array
		for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
			input[tempIndex] = temp[tempIndex];
		}
	}

	/**
	 * @param position
	 * @param value
	 * @param radix
	 * @return
	 */
	public static int getDigit(int position, int value, int radix) {
		return value / (int) Math.pow(radix, position) % radix;
	}
}

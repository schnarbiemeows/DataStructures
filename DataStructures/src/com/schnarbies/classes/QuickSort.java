package com.schnarbies.classes;

/**
 *
 * @author dylan
 *
 */
public class QuickSort {

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.print("\n");
		quickSort(intArray, 0, intArray.length, "Root");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.print("\n");
	}

	/**
	 * @param input
	 * @param start
	 * @param end
	 * @param node
	 */
	public static void quickSort(int[] input, int start, int end, String node) {
		System.out.println("( Descending down one " + node + " node )");
		if (end - start < 2) {
			System.out.print("( Ascending a node with array => ");
			for (int x = start; x < end; x++) {
				System.out.print(input[x] + " ");
			}
			System.out.print(")\n");
			return;
		}
		System.out.println("partitioning input : start:" + start + " to end:" + end);
		int pivotIndex = partition(input, start, end);
		System.out.println("quickSort : start:" + start + " to pivotIndex:" + pivotIndex);
		quickSort(input, start, pivotIndex, "Left");
		System.out.println("quickSort : pivotIndex+1:" + (pivotIndex + 1) + " to end:" + end);
		quickSort(input, pivotIndex + 1, end, "Right");
		System.out.print("( Ascending a node with array => ");
		for (int x = start; x < end; x++) {
			System.out.print(input[x] + " ");
		}
		System.out.print(")\n");
	}

	/**
	 * @param input
	 * @param start
	 * @param end
	 * @return
	 */
	public static int partition(int[] input, int start, int end) {
		// this is using the first element as the pivot
		System.out.print("before : ");
		for (int x = start; x < end; x++) {
			System.out.print(input[x] + " ");
		}
		System.out.print("\n");
		int pivot = input[start];

		int i = start;
		int j = end;
		System.out.println("New pivot Value = " + pivot + " , i = " + i + " , j = " + j);
		while (i < j) {

			// NOTE: empty loop body
			while (i < j && input[--j] >= pivot)
				System.out.println("decrementing j to => " + j);
			if (i < j) {
				System.out.println("copying value : " + input[j] + " from the right at index: " + j
						+ " to the left at index: " + i + " , overwriting " + input[i]);
				input[i] = input[j];
				System.out.print("Our new array is : ");
				for (int x = start; x < end; x++) {
					System.out.print(input[x] + " ");
				}
				System.out.println("\nand our pivot value is still : " + pivot);
			}
			// NOTE: empty loop body
			while (i < j && input[++i] <= pivot)
				System.out.println("incrementing i to => " + i);
			if (i < j) {
				System.out.println("copying value : " + input[i] + " from the left at index: " + i
						+ " to the right at index: " + j + " , overwriting " + input[j]);
				input[j] = input[i];
				System.out.print("Our new array is : ");
				for (int x = start; x < end; x++) {
					System.out.print(input[x] + " ");
				}
				System.out.println("\nand our pivot value is still : " + pivot);
			}
		}
		System.out.println("j(" + j + ") is no longer less than i(" + i
				+ "), so we are done with this partitioning method, setting index: " + j + " to " + pivot
				+ " overwriting " + input[j]);
		input[j] = pivot;
		System.out.print("after : ");
		for (int x = start; x < end; x++) {
			System.out.print(input[x] + " ");
		}
		System.out.print("\n");
		System.out.println("returning new pivotIndex => " + j);
		return j;
	}
}

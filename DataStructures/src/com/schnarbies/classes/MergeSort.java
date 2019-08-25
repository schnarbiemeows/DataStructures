package com.schnarbies.classes;

/**
 * @author dylan
 *
 */
public class MergeSort {

	/**
	 * * 2 phase sort: split and merge split - start with an unsorted array. divide
	 * the array into 2 arrays, which are unsorted. the first array is the left
	 * array, the second array is the right array split the left and right arrays
	 * into two arrays each keep splitting until all the arrays have only 1
	 * elements, these are sorted by default
	 *
	 * merge - merge every left/right pair of sibling arrays into a sorted array
	 * after the first merge, we have a bunch of 2 element sorted arrays then merge
	 * those sorted arrays to end up with a bunch of 4-element sorted arrays repeat
	 * until you have a single sorted array
	 *
	 * not in-place, uses temporary arrays
	 *
	 * merging process: we merge sibling left and right arrays we create a temporary
	 * array large enough to hold all of the elements in the arrays we are merging
	 * we set i to the first index of the left array and j to the first index of the
	 * right array we compare left[i] and right[j]. if left is smaller, we copy it
	 * to the temp array and increment i by 1. if right is smaller, we copy it to
	 * the temp array and increment j by 1 we repeat this process until all elements
	 * in the two arrays have been processed. at this point, the temp array contains
	 * the merged values in sorted order. we then copy this temp array back to the
	 * original input array, at the correct positions.* 2 phase sort: split and
	 * merge split - start with an unsorted array. divide the array into 2 arrays,
	 * which are unsorted. the first array is the left array, the second array is
	 * the right array split the left and right arrays into two arrays each keep
	 * splitting until all the arrays have only 1 elements, these are sorted by
	 * default
	 *
	 * merge - merge every left/right pair of sibling arrays into a sorted array
	 * after the first merge, we have a bunch of 2 element sorted arrays then merge
	 * those sorted arrays to end up with a bunch of 4-element sorted arrays repeat
	 * until you have a single sorted array
	 *
	 * not in-place, uses temporary arrays
	 *
	 * merging process: we merge sibling left and right arrays we create a temporary
	 * array large enough to hold all of the elements in the arrays we are merging
	 * we set i to the first index of the left array and j to the first index of the
	 * right array we compare left[i] and right[j]. if left is smaller, we copy it
	 * to the temp array and increment i by 1. if right is smaller, we copy it to
	 * the temp array and increment j by 1 we repeat this process until all elements
	 * in the two arrays have been processed. at this point, the temp array contains
	 * the merged values in sorted order. we then copy this temp array back to the
	 * original input array, at the correct positions. if the left array is at
	 * positions x to y, and the right array is at positions y+1 to z, then after
	 * the copy positions x to z will be sorted in the original array if the left
	 * array is at positions x to y, and the right array is at positions y+1 to z,
	 * then after the copy positions x to z will be sorted in the original array
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		
		 */
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.print("\n");
		mergeSort(intArray, 0, intArray.length);
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.print("\n");
	}

	/**
	 * @param input
	 * @param start
	 * @param end
	 */
	public static void mergeSort(int[] input, int start, int end) {
		if (end - start < 2) {
			System.out.print("Single : ");
			for (int x = start; x < end; x++) {
				System.out.print(input[x] + " ");
			}
			System.out.print("\n");
			return;
		}
		int mid = (start + end) / 2;
		System.out.println("splitting array index : start:" + start + " to mid:" + mid);
		mergeSort(input, start, mid);
		System.out.println("splitting array index : mid:" + mid + " to end:" + end);
		mergeSort(input, mid, end);
		System.out.println("merging array index : start:" + start + " to mid:" + mid + " to end:" + end);
		merge(input, start, mid, end);

	}

	/**
	 * @param input
	 * @param start
	 * @param mid
	 * @param end
	 */
	public static void merge(int[] input, int start, int mid, int end) {
		// remember: the 2 arrays being passed in are already sorted
		System.out.print("before : ");
		for (int x = start; x < end; x++) {
			System.out.print(input[x] + " ");
		}
		System.out.print("\n");
		if (input[mid - 1] <= input[mid]) {
			/*
			 * this is just an optimization; see if we actually have to do anything so if
			 * the rightmost element of the left array is <= the leftmost element of the
			 * right array, there is no need to do anything
			 */
			System.out.println("already ordered");
			return;
		}
		// otherwise,
		int i = start;
		int j = mid;
		int tempIndex = 0;
		int[] temp = new int[end - start];
		while (i < mid && j < end) {
			// temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
			if (input[i] <= input[j]) {
				System.out.println("pushing left[" + i + "] = " + input[i] + " to temp[" + tempIndex + "]");
				temp[tempIndex++] = input[i++];
			} else {
				System.out.println("pushing right[" + j + "] = " + input[j] + " to temp[" + tempIndex + "]");
				temp[tempIndex++] = input[j++];
			}
		}
		/*
		 * System.arraycopy(input, i, input, start+tempIndex, mid-i); // i don't
		 * understand this this is what I would do
		 */
		if (i < mid) {
			while (i < mid) {
				System.out.println("finishing left[" + i + "] = " + input[i] + " to temp[" + tempIndex + "]");
				temp[tempIndex++] = input[i++];
			}
		} else {
			// temp[tempIndex] = input[j]; - optimization: we dont actually have to do this
			while (j < end) {
				System.out.println("finishing right[" + j + "] = " + input[j] + " to temp[" + tempIndex + "]");
				temp[tempIndex++] = input[j++];
			}
		}
		System.arraycopy(temp, 0, input, start, end - start);
		System.out.print("after : ");
		for (int x = start; x < end; x++) {
			System.out.print(input[x] + " ");
		}
		System.out.print("\n");
		// System.arraycopy(temp, 0, input, start, tempIndex);
	}
}

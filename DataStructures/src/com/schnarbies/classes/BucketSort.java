package com.schnarbies.classes;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author dylan
 *
 */
public class BucketSort {

	/**
	 * Lecture 78 - bucket sort
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] intArray = { 54, 46, 83, 66, 95, 92, 43 };

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		bucketSort(intArray);

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}

	}

	/**
	 *
	 * @param input
	 */
	public static void bucketSort(int[] input) {
		List<Integer>[] buckets = new List[10]; // because this is declared as a generic
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new LinkedList<Integer>(); // this could be an ArrayList, just change it
		}
		for (int i = 0; i < input.length; i++) {
			buckets[hash(input[i])].add(input[i]);
		}
		for (List bucket : buckets) {
			Collections.sort(bucket);
		}
		int j = 0;
		for (int i = 0; i < buckets.length; i++) {
			for (int value : buckets[i]) {
				input[j++] = value;
			}
		}
	}

	/**
	 *
	 * @param value
	 * @return
	 */
	private static int hash(int value) {
		return value / 10;
	}

}

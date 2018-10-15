package com.schnarbies.classes;

public class CountingSort {

	public static void main(String[] args) {
		
		int[] intArray = {2,5,9,8,2,8,7,10,4,3};
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]+ " ");
		}
		System.out.println();
		countingSort2(intArray,1,10);
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
	}
	
	// my answer
	public static void countingSort(int[] input, int min, int max) {
		 int[] countArray = new int[(max-min)+1];
		 for(int i = 0; i<input.length;i++) {
			 countArray[input[i]-min] += 1;
		 }
		 int counter = min;
		// this is not a for within a for because the sum total of 
		// (outer loop iterations * inner loop iterations will always equal
		// the total # of items in the input array
		 for(int j = 0; j<countArray.length; j++) {
			 int val = countArray[j];
			 for(int k = 1; k<=val; k++) {  
				 input[counter-min] = j+min;
				 counter++;
			 }
		 }
	}
	// professor's answer:
	public static void countingSort2(int[] input, int min, int max) {
		int[] countArray = new int[(max-min)+1];
		 for(int i = 0; i<input.length;i++) {
			 countArray[input[i]-min]++; // same thing as mine, har
		 }
		 int j = 0;
		 for(int i = min; i <= max; i++) {
			 while(countArray[i - min] > 0) {
				 input[j++] = i;
				 countArray[i - min]--;
			 }
		 }
	}
}

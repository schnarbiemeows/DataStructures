package com.schnarbies.classes;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {20,35,-15,7,55,1,-22};
		
		// unsorted partition index = 6 - this is the last index of the unsorted partition
		// i = 0 - index used to traverse the array from left to right
		// O(n^2) 
		// each time we traverse through the array, we migrate the highest number to the end
		// of the array
		
		for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex--) {
			for(int currentIndex = 0; currentIndex < lastUnsortedIndex; currentIndex++) {
				if(intArray[currentIndex] > intArray[currentIndex+1]) {
					swap(intArray, currentIndex, lastUnsortedIndex);
				}
			}
		}
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

	private static void swap(int[] intArray, int currentIndex, int lastUnsortedIndex) {
		// TODO Auto-generated method stub
		if(currentIndex == lastUnsortedIndex)
			return;
		int temp = intArray[lastUnsortedIndex];
		intArray[lastUnsortedIndex] = intArray[currentIndex];
		intArray[currentIndex] = temp;
	}

}

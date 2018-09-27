package com.schnarbies.classes;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {20,35,-15,7,55,1,-22};
		
		// unsorted partition index = 6 - this is the last index of the unsorted partition
		// i = 0 - index used to traverse the array from left to right
		// O(n^2) 
		// each time we traverse through the array, we tabs of the current largest number
		// and its index, then at the end of each iteration swap the largest # found with
		// the last # in the array(then reset your max and index
		// unstable sort
		int firstUnsortedIndex = 1;
		int sortedIndex = 0;
		int elementToInsert = intArray[firstUnsortedIndex];
		int index = 0;for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]+" ");
		}
		System.out.print("\n");
		
		for(int i = firstUnsortedIndex; i<intArray.length; i++) {
			for(int j = sortedIndex; j >; currentIndex++) {
				if(intArray[currentIndex] > highestNumber) {
					highestNumber = intArray[currentIndex];
					index = currentIndex;
				}
			}
			swap(intArray, index, lastUnsortedIndex);
			for(int i = 0; i < intArray.length; i++) {
				if(i==index||i==lastUnsortedIndex)
					System.out.print("["+intArray[i]+"] ");
				else
					System.out.print(intArray[i]+" ");
			}
			System.out.print("\n");
			// gotta reset the current max and index
			highestNumber = intArray[0];
			index = 0;
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

package com.schnarbies.classes;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {20,35,-15,7,55,1,-22};
		
		// unsorted partition index = 6 - this is the last index of the unsorted partition
		// i = 0 - index used to traverse the array from left to right
		// O(n^2) 
		// each time we traverse through the array, we keep tabs of the current largest number
		// and its index, then at the end of each iteration swap the largest # found with
		// the last # in the array(then reset your max and index
		// unstable sort
		boolean elementInserted = false;
		int firstUnsortedIndex = 1;
		int sortedIndex = 0;
		int elementToInsert = intArray[firstUnsortedIndex];
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]+" ");
		}
		System.out.print("\n");
		// unsorted partition iterating through from left to right
		for(int i = firstUnsortedIndex; i<intArray.length; i++) {
			elementInserted = false;
			elementToInsert = intArray[i];
			// sorted partition, iterating through from right to left
			for(int j = sortedIndex; j >=0; j--) {
				// we are looking for a value less than the value we are inserting
				if(elementToInsert < intArray[j]) {
					// until we find it, keep shifting the elements in the sorted array to the right
					intArray[j+1] = intArray[j];
				}
				else {
					// finally, when we find an element less than or equal to our item to insert
					// copy this element to the right of that element
					intArray[j+1] = elementToInsert;
					elementInserted = true;
					break;
				}
			}
			// if we reach the end of the sorted array without finding a place to insert it
			// we need to insert it at the end
			if(!elementInserted) {
				intArray[0] = elementToInsert;
			}
			sortedIndex++;
			for(int i1 = 0; i1 < intArray.length; i1++) {
				if(intArray[i1]==elementToInsert)
					System.out.print("["+intArray[i1]+"] ");
				else
					System.out.print(intArray[i1]+" ");
			}
			System.out.print("\n");
		}
		// professor's answer
		int[] intArray2 = {20,35,-15,7,55,1,-22};
		
		for(int firstUnsortedIndex1 = 1; firstUnsortedIndex1 < intArray2.length; firstUnsortedIndex1++) {
		
			int newElement = intArray2[firstUnsortedIndex1];
			int ii;
			for(ii = firstUnsortedIndex1; ii>0 && intArray2[ii-1] > newElement; ii--) {
				intArray2[ii] = intArray2[ii-1];
			}
			intArray2[ii] = newElement;
			for(int i1 = 0; i1 < intArray2.length; i1++) {
				if(intArray2[i1]==newElement)
					System.out.print("["+intArray2[i1]+"] ");
				else
					System.out.print(intArray2[i1]+" ");
			}
			System.out.print("\n");
		}
	}
}

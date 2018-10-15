package com.schnarbies.classes;

public class InsertionSortRecursive {

	public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        innerSort(intArray,intArray.length-1);

        for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]+" ");
		}
		System.out.print("\n");
    }
	
	public static void innerSort(int[] array, int firstUnsortedIndex) {
		if(firstUnsortedIndex==0)
			return;
		else {
			innerSort(array, firstUnsortedIndex-1);
			int newElement = array[firstUnsortedIndex];
			int i;
			for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
            	array[i] = array[i - 1];
            }
			array[i] = newElement;
		}
	}
}

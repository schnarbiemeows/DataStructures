package com.schnarbies.classes;

public class ShellSort {

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
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]+" ");
		}
		System.out.print("\n");
		int newElement = 0;
		for(int gap = intArray.length/2; gap>0; gap /= 2) {
		
			for(int i = gap; i < intArray.length; i++) {
				newElement = intArray[i];
				int j = i;
				while(j>=gap && intArray[j-gap] > newElement) {
					intArray[j] = intArray[j-gap];
					j -=gap;
				}
				intArray[j] = newElement;
			}
			for(int i1 = 0; i1 < intArray.length; i1++) {
				if(intArray[i1]==newElement)
					System.out.print("["+intArray[i1]+"] ");
				else
					System.out.print(intArray[i1]+" ");
			}
			System.out.print("\n");
		}
	}
}

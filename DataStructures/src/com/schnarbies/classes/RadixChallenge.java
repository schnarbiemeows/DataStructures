package com.schnarbies.classes;

public class RadixChallenge {

	public static void main(String[] args) {
        String[] stringsArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        // do radix sort
        radixSort(stringsArray, 26, 5);
        for (int i = 0; i < stringsArray.length; i++) {
            System.out.println(stringsArray[i]);
        }
    }
	
	public static void radixSort(String[] input, int radix, int width) {
		for(int i = width-1; i>=0; i--) {
			radixSingleSort(input, i, radix);
			for(int x = 0; x < input.length; x++) {
				System.out.print(input[x]+" ");
			}
			System.out.print("\n");
		}
		
	}
	
	public static void radixSingleSort(String[] input, int position, int radix) {
		int numItems = input.length;
		int[] countArray = new int[radix];
		// in this array 0 = a, 25 = z
		// make a count array that counts the occurrence of each digit
		for(String value: input) {
			countArray[getDigit(position, value, radix)]++;
		}
		// adjust the count array ex: if countArray = [ 1, 1, 1, 1 ]
		for(int j = 1; j < countArray.length;j++) {
			countArray[j] += countArray[j-1];
		}
		// countArray would now be = [ 1, 2, 3, 4 ]
		String[] temp = new String[numItems];
		// this code makes sure that the sorting is stable
		for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
			temp[--countArray[getDigit(position, input[tempIndex], radix)]] =
					input[tempIndex];
		}
		// copy items from the temp array back to the input array
		for(int tempIndex = 0; tempIndex < numItems; tempIndex++) {
			input[tempIndex] = temp[tempIndex];
		}
	}
	
	public static int getDigit(int position, String value, int radix) {
		String letters = "abcdefghijklmnopqrstuvwxyz";
		String valueNocase = value.toLowerCase();
		String letter = valueNocase.substring(position, position+1);
		int location = letters.indexOf(letter);
		return location;
	}
}

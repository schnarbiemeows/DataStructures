package com.schnarbies.classes;

/**
 * @author dylan
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(iterativeFactorial(3));
		System.out.println(recursiveFactorial(3));
	}

	/**
	 * iterative, non-recursive method
	 * 
	 * @param num
	 * @return
	 */
	public static int iterativeFactorial(int num) {
		if (num == 0)
			return 1;
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		return factorial;
	}

	/**
	 * recursive method
	 * 
	 * @param num
	 * @return
	 */
	public static int recursiveFactorial(int num) {
		if (num == 0)
			return 1;
		else {
			return num * recursiveFactorial(num - 1);
		}
	}
}

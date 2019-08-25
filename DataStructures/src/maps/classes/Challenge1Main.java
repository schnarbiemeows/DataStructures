package maps.classes;

/**
 * @author dylan
 *
 */
public class Challenge1Main {

	/**
	 * lecture 79,80 - challenge #1
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[10];
		int[] numsToAdd = { 59382, 43, 6894, 500, 99, -58 };
		for (int i = 0; i < numsToAdd.length; i++) {
			nums[hash(numsToAdd[i])] = numsToAdd[i];
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
			;
		}

	}

	/**
	 * @param value
	 * @return
	 */
	public static int hash(int value) {
		return Math.abs(value % 10);
	}
}

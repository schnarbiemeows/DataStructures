package stacks.classes;

import queues.classes.ChallengeQueue;

/**
 * @author dylan
 *
 */
public class ChallengeMain {
	/**
	 * stack challenge #1
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// should return true
		System.out.println(checkForPalindrome("abccba"));
		// should return true
		System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
		// should return true
		System.out.println(checkForPalindrome("I did, did I?"));
		// should return false
		System.out.println(checkForPalindrome("hello"));
		// should return true
		System.out.println(checkForPalindrome("Don't nod"));
	}

	/**
	 * @param string
	 * @return
	 */
	public static boolean checkForPalindrome(String string) {
		String regexpStr = string.replaceAll("[^a-zA-Z0-9 ]", "").replaceAll(" ", "");
		boolean matches = true;
		String afterPopping = "";
		String afterQueueRemove = "";
		int length = regexpStr.length();
		ChallengeStack stack = new ChallengeStack();
		ChallengeQueue queue = new ChallengeQueue(length);
		for (int i = 0; i < length; i++) {
			stack.push(regexpStr.substring(i, i + 1));
			queue.add(regexpStr.substring(i, i + 1));
		}
		for (int i = 0; i < length; i++) {
			afterPopping = stack.pop();
			afterQueueRemove = queue.remove();
			if (!afterPopping.equalsIgnoreCase(afterQueueRemove)) {
				matches = false;
			}
		}
		if (matches) {
			return true;
		}
		return false;
	}

}

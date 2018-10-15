package queues.classes;

import java.util.LinkedList;

import stacks.classes.ChallengeStack;

public class ChallengeMain {

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

    public static boolean checkForPalindrome(String string) {
    	String regexpStr = string.replaceAll("[^a-zA-Z0-9 ]", "").replaceAll(" ", "");
    	ChallengeStack stack = new ChallengeStack();
        String afterPopping = "";
        int length = regexpStr.length();
        for(int i=0; i<length; i++) {
        	stack.push(regexpStr.substring(i, i+1));
        }
        for(int i=0; i<length; i++) {
        	afterPopping+=stack.pop();
        }
        if(afterPopping.equalsIgnoreCase(regexpStr)) {
        	return true;
        }
        return false;
    }
}

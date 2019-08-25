package stacks.classes;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author dylan
 *
 */
public class ChallengeStack {

	private LinkedList<String> stack;

	/**
	 *
	 */
	public ChallengeStack() {
		stack = new LinkedList<String>();
	}

	/**
	 * @param String
	 */
	public void push(String String) {
		stack.push(String);
	}

	/**
	 * @return
	 */
	public String pop() {
		return stack.pop();
	}

	/**
	 * @return
	 */
	public String peek() {
		return stack.peek();
	}

	/**
	 * @return
	 */
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	/**
	 *
	 */
	public void printStack() {
		ListIterator<String> iterator = stack.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

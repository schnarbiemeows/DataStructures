package stacks.classes;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChallengeStack {

private LinkedList<String> stack;
	
	public ChallengeStack() {
		stack = new LinkedList<String>();
	}
	
	public void push(String String) {
		stack.push(String);
	}
	
	public String pop() {
		return stack.pop();
	}
	
	public String peek() {
		return stack.peek();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void printStack() {
		ListIterator<String> iterator = stack.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

package stacks.classes;

import java.util.EmptyStackException;

/**
 * @author dylan
 *
 */
public class ArrayStack {

	private Employee[] stack;
	private int top;

	/**
	 * @param capacity
	 */
	public ArrayStack(int capacity) {
		stack = new Employee[capacity];
	}

	/**
	 * @param employee
	 */
	public void push(Employee employee) {
		if (top == stack.length) {
			// need to resize the backing Array
			Employee[] newArray = new Employee[2 * stack.length];
			System.arraycopy(stack, 0, newArray, 0, stack.length);
			stack = newArray;
			;
		}
		stack[top++] = employee;
	}

	/**
	 * @return
	 */
	public Employee pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		Employee employee = stack[--top];
		stack[top] = null;
		return employee;
	}

	/**
	 * @return
	 */
	public Employee peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		return stack[top - 1];
	}

	/**
	 * @return
	 */
	public boolean isEmpty() {
		return top == 0;
	}

	/**
	 * @return
	 */
	public int size() {
		return top;
	}

	/**
	 *
	 */
	public void printStack() {
		for (int i = top - 1; i >= 0; i--) {
			System.out.println("i : " + i + " item = " + stack[i]);
		}
	}
}

package queues.classes;

import java.util.NoSuchElementException;

/**
 * @author dylan
 *
 */
public class ArrayQueue {

	private Employee[] queue;
	private int front;
	private int back;

	/**
	 * @param capacity
	 */
	public ArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}

	/**
	 * @param employee
	 */
	public void add(Employee employee) {
		if (back == queue.length) {
			Employee[] newArray = new Employee[2 * queue.length];
			System.arraycopy(queue, 0, newArray, 0, queue.length);
			queue = newArray;
		}

		queue[back] = employee;
		back++;
	}

	/**
	 * @return
	 */
	public Employee remove() {
		if (size() == 0) {
			throw new NoSuchElementException();
		}

		Employee employee = queue[front];
		queue[front] = null;
		front++;
		if (size() == 0) {
			front = 0;
			back = 0;
		}

		return employee;
	}

	/**
	 * @return
	 */
	public Employee peek() {
		if (size() == 0) {
			throw new NoSuchElementException();
		}

		return queue[front];
	}

	/**
	 * @return
	 */
	public int size() {
		return back - front;
	}

	/**
	 * 
	 */
	public void printQueue() {
		for (int i = front; i < back; i++) {

		}
	}

}

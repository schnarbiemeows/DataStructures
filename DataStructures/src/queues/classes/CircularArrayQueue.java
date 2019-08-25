package queues.classes;

import java.util.NoSuchElementException;

/**
 * @author dylan
 *
 */
public class CircularArrayQueue {

	private Employee[] queue;
	private int front;
	private int back;

	/**
	 * @param capacity
	 */
	public CircularArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}

	/**
	 * @param employee
	 */
	public void add(Employee employee) {
		if (size() == queue.length - 1) {
			int numItems = size();
			Employee[] newArray = new Employee[2 * queue.length];
			System.arraycopy(queue, front, newArray, 0, queue.length - front);
			if (back < front) /*
								 * adding this if statement, because this lower line is bad design, because it
								 * actually redundantly copies the first 4 items as well into slots 5 - 8, even
								 * though the back pointer is at item 5, so only items 0-4 will be seen
								 */
				System.arraycopy(queue, 0, newArray, queue.length - front, back);

			// System.arraycopy(queue, 0, newArray, 0, queue.length);
			queue = newArray;

			front = 0;
			back = numItems;
		}
		queue[back] = employee;
		if (back < queue.length - 1) {
			back++;
		} else {
			back = 0;
		}
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
		} else if (front == queue.length) {
			front = 0;
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
		if (back >= front) {
			return back - front;
		} else {
			return queue.length - front + back;
		}

	}

	/**
	 *
	 */
	public void printQueue() {
		System.out.println("front = " + front + " , back = " + back);
		if (front <= back) {
			for (int i = front; i < queue.length; i++) {
				System.out.println("item at: " + i + " = " + queue[i]);
			}
		} else {
			for (int i = front; i < queue.length; i++) {
				System.out.println("item at: " + i + " = " + queue[i]);
			}
			for (int i = 0; i < back; i++) {
				System.out.println("item at: " + i + " = " + queue[i]);
			}
		}
	}
}

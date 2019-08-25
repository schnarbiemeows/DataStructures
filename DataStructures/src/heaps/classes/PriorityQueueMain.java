package heaps.classes;

import java.util.PriorityQueue;

/**
 * @author dylan
 *
 */
public class PriorityQueueMain {

	/**
	 * lecture 108 heaps always have either the max as its root always, or its min
	 * as its root always insertion into a heap is O(logn) removal is O(n) - because
	 * you have to find the element, UNLESS you only care about removing the min
	 * element or max element when you use a heap in this manner, it is called a
	 * priority queue the default config for this is a MIN heap
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		pq.add(25);
		pq.add(-22);
		pq.add(1343);
		pq.add(54);
		pq.add(0);
		pq.add(-3492);
		pq.add(429);

		// pq.add(-1);
		// System.out.println(pq.peek());
		Object[] ints = pq.toArray();
		for (Object num : ints) {
			System.out.println(num);
			;
		}

	}

}

package heaps.classes;

/**
 * @author dylan
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// lectures 103-107, 110
		Heap heap = new Heap(10);
		heap.insert(80);
		heap.insert(75);
		heap.insert(60);
		heap.insert(68);
		heap.insert(55);
		heap.insert(40);
		heap.insert(52);
		heap.insert(67);
		// heap.printHeap();
		// heap.delete(1);
		// heap.printHeap();
		// heap.delete(5);
		// heap.printHeap();
		// heap.delete(0);
		heap.printHeap();
		heap.sort(); // Note: once you have sorted the heap, it is no longer a heap!
		heap.printHeap();
	}
}

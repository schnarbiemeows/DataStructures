package heaps.classes;

/**
 * @author dylan
 *
 */
public class Heap {

	private int[] heap;
	private int size;

	/**
	 * @param capacity
	 */
	public Heap(int capacity) {
		heap = new int[capacity];
	}

	/**
	 * @return
	 */
	public int peek() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("Heap is empty");
		}
		return heap[0];
	}

	/**
	 * @param value
	 */
	public void insert(int value) {
		if (isFull()) {
			throw new IndexOutOfBoundsException("Heap is full");
		}

		heap[size] = value;

		fixHeapAbove(size);
		size++;
	}

	/**
	 * @param index
	 * @return
	 */
	public int delete(int index) {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("Heap is empty");
		}
		int parent = getParent(index);
		int deletedValue = heap[index];
		heap[index] = heap[size - 1]; // this actually deletes the value by replacing it with the leaf
		if (index == 0 || heap[index] < heap[parent]) {
			fixHeapBelow(index, size - 1);
		} else {
			fixHeapAbove(index);
		}
		size--;
		return deletedValue;
	}

	/**
	 * 
	 */
	public void sort() {
		// worst case = O(nlogn)
		int lastHeapIndex = size - 1;
		for (int i = 0; i < lastHeapIndex; i++) {
			int tmp = heap[0];
			heap[0] = heap[lastHeapIndex - i];
			heap[lastHeapIndex - i] = tmp;
			fixHeapBelow(0, lastHeapIndex - i - 1);
		}
		// Note: once you have sorted the heap, it is no longer a heap!
	}

	/**
	 * @param index
	 */
	private void fixHeapAbove(int index) {
		int newValue = heap[index];
		while (index > 0 && newValue > heap[getParent(index)]) {
			heap[index] = heap[getParent(index)];
			index = getParent(index);
		}

		heap[index] = newValue;
	}

	/**
	 * @param index
	 * @param lastHeapIndex
	 */
	private void fixHeapBelow(int index, int lastHeapIndex) {
		int childToSwap;
		while (index <= lastHeapIndex) {
			int leftChild = getChild(index, true);
			int rightChild = getChild(index, false);
			if (leftChild <= lastHeapIndex) {
				if (rightChild > lastHeapIndex) {
					childToSwap = leftChild;
				} else {
					childToSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
				}
				if (heap[index] < heap[childToSwap]) {
					int tmp = heap[index];
					heap[index] = heap[childToSwap];
					heap[childToSwap] = tmp;
				} else {
					break;
				}
				index = childToSwap;
			} else {
				break;
			}
		}
	}

	/**
	 * @param index
	 * @param left
	 * @return
	 */
	private int getChild(int index, boolean left) {
		return 2 * index + (left ? 1 : 2);
	}

	/**
	 * @return
	 */
	public boolean isFull() {
		return size == heap.length;
	}

	/**
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * @param index
	 * @return
	 */
	public int getParent(int index) {
		return (index - 1) / 2;
	}

	/**
	 * 
	 */
	public void printHeap() {
		for (int i = 0; i < size; i++) {
			System.out.print(heap[i] + ",");
		}
		System.out.println();
	}
}

package lists.classes;

/**
 * @author dylan
 *
 */
public class IntegerLinkedList {

	private IntegerNode head;
	private int size;

	/**
	 * @param value
	 */
	public void addToFront(Integer value) {
		IntegerNode node = new IntegerNode(value);
		node.setNext(head);
		head = node;
		size++;
	}

	/**
	 * @return
	 */
	public IntegerNode removeFromFront() {
		if (isEmpty()) {
			return null;
		}

		IntegerNode removedNode = head;
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}

	/**
	 * @param value
	 */
	public void insertSorted(Integer value) {

		IntegerNode currentNode = null;
		IntegerNode nextNode = head;
		IntegerNode newNode = new IntegerNode(value);
		if (null == nextNode) {
			head = newNode;
			size++;
			return;
		} else
			while (null != nextNode) {
				if (value < nextNode.getValue()) {
					newNode.setNext(nextNode);
					size++;
					if (currentNode == null) {
						head = newNode;
					}
					return;
				}
				currentNode = nextNode;
				nextNode = nextNode.getNext();
			}
		currentNode.setNext(newNode);
		newNode.setNext(null);
		size++;
	}

	/**
	 * @return
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @return
	 */
	public boolean isEmpty() {
		return head == null;
	}

	/**
	 * 
	 */
	public void printList() {
		IntegerNode current = head;
		System.out.print("HEAD -> ");
		while (current != null) {
			System.out.print(current);
			System.out.print(" -> ");
			current = current.getNext();
		}
		System.out.println("null");
	}

}

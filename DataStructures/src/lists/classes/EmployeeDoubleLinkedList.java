package lists.classes;

/**
 * @author dylan
 *
 */
public class EmployeeDoubleLinkedList {

	private EmployeeDoubleNode head; // the current head of the LL
	private EmployeeDoubleNode tail; // the current head of the LL
	private int size;

	/**
	 * @param employee
	 */
	public void addToFront(Employee employee) {
		// create a new node
		EmployeeDoubleNode node = new EmployeeDoubleNode(employee);
		// point its pointer to the current head of the LL

		if (head == null)
			tail = node;
		else {
			head.setPrevious(node);
			node.setNext(head);
		}
		// and designate this new Node the head of the LL
		head = node;
		size++;
	}

	/**
	 * @param employee
	 */
	public void addToBack(Employee employee) {
		// create a new node
		EmployeeDoubleNode node = new EmployeeDoubleNode(employee);
		// point its pointer to the current head of the LL

		if (tail == null)
			head = node;
		else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		// and designate this new Node the head of the LL
		tail = node;
		size++;
	}

	/**
	 * return true if you were able to successfully add the employee into the list
	 * before the existing employee. Return false if the existing employee doesn't
	 * exist in the list
	 *
	 * @param newEmployee
	 * @param existingEmployee
	 * @return
	 */
	public boolean addBefore(Employee newEmployee, Employee existingEmployee) {

		EmployeeDoubleNode currentNode = null;
		EmployeeDoubleNode nextNode = head;
		if (null == nextNode) {
			return false;
		} else
			while (null != nextNode) {
				if (nextNode.getEmployee().toString().equals(existingEmployee.toString())) {
					EmployeeDoubleNode newNode = new EmployeeDoubleNode(newEmployee);
					if (currentNode == null) {
						newNode.setPrevious(null);
						newNode.setNext(head);
						head.setPrevious(newNode);
						head = newNode;
						return true;
					} else {
						currentNode.setNext(newNode);
						newNode.setNext(nextNode);
						newNode.setPrevious(currentNode);
						nextNode.setPrevious(newNode);
						return true;
					}
				}
				currentNode = nextNode;
				nextNode = nextNode.getNext();
			}
		System.out.println("Not found");
		return false;
	}

	/**
	 * @return
	 */
	public EmployeeDoubleNode removeFromFront() {
		// check for empty first
		if (isEmpty()) {
			return null;
		}
		// get a handle on the current head node
		EmployeeDoubleNode node = head;
		// go to the Node that it is pointing to and set that equal to the new head
		if (head.getNext() == null) {
			tail = null;
		} else {
			head.getNext().setPrevious(null);
		}
		head = head.getNext();

		// set this now former head node's next to null to complete the detachment
		node.setNext(null);
		// descrement the size
		size--;
		// return this node for whatever reason
		return node;
	}

	/**
	 * @return
	 */
	public EmployeeDoubleNode removeFromBack() {
		// check for empty first
		if (isEmpty()) {
			return null;
		}
		// get a handle on the current head node
		EmployeeDoubleNode node = tail;
		// go to the Node that it is pointing to and set that equal to the new head
		if (tail.getPrevious() == null) {
			head = null;
		} else {
			tail.getPrevious().setNext(null);
		}
		tail = tail.getPrevious();

		// set this now former head node's next to null to complete the detachment
		node.setPrevious(null);
		// descrement the size
		size--;
		// return this node for whatever reason
		return node;
	}

	/**
	 *
	 */
	public void printList() {
		EmployeeDoubleNode current = head;
		System.out.print("HEAD -> ");
		while (current != null) {
			System.out.print(current);
			System.out.print(" -> ");
			current = current.getNext();
		}
		System.out.println(" null");
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
}

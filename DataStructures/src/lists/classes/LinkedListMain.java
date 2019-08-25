package lists.classes;

/**
 * @author dylan
 *
 */
public class LinkedListMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

		EmployeeLinkedList list = new EmployeeLinkedList();
		list.addTofront(janeJones);
		list.addTofront(johnDoe);
		list.addTofront(marySmith);
		list.addTofront(mikeWilson);
		list.printList();
		System.out.println(list.getSize());
		list.removeFromFront();
		list.printList();
		System.out.println(list.getSize());
		// System.out.println(list.isEmpty());
	}

}

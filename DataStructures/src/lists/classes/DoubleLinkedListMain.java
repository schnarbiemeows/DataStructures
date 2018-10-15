package lists.classes;

public class DoubleLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee janeJones = new Employee("Jane","Jones",123);
		Employee johnDoe = new Employee("John","Doe",4567);
		Employee marySmith = new Employee("Mary","Smith",22);
		Employee mikeWilson = new Employee("Mike","Wilson",3245);
		Employee billEnd = new Employee("Bill", "End", 78);
		
		EmployeeDoubleLinkedList list = new EmployeeDoubleLinkedList();
		list.addToFront(janeJones);
		list.addToFront(johnDoe);
		list.addToFront(marySmith);
		list.addToFront(mikeWilson);
		list.printList();
		
		list.addBefore(billEnd, johnDoe);
		list.addBefore(new Employee("Someone", "Else", 1111), mikeWilson);
        list.printList();
        list.addBefore(new Employee("jack", "leg", 1111), new Employee("cam", "biscuit", 1111));
	}

}

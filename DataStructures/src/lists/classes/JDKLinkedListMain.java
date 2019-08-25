package lists.classes;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author dylan
 *
 */
public class JDKLinkedListMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billBurr = new Employee("Bill", "Burr", 0);

		LinkedList<Employee> list = new LinkedList<Employee>();
		list.addFirst(janeJones);
		list.addFirst(johnDoe);
		list.addFirst(marySmith);
		list.addFirst(mikeWilson);
		list.add(billBurr);
		Iterator<Employee> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}

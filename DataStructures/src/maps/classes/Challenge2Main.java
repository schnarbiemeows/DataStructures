package maps.classes;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
 * @author dylan
 *
 */
public class Challenge2Main {

	/**
	 * lecture 81,82 - Challenge #2
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<Employee> employees = new LinkedList<>();
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);
		employees.add(janeJones);
		employees.add(johnDoe);
		employees.add(mikeWilson);
		employees.add(marySmith);
		employees.add(johnDoe);
		employees.add(billEnd);
		employees.add(janeJones);
		// employees.forEach(e -> System.out.println(e));
		Map myMap = new HashMap();
		for (Employee employee : employees) {
			String key = hash(employee);
			myMap.putIfAbsent(key, employee);
		}
		// myMap.forEach((k,v) -> System.out.println("Key = " + k + ", Employee = " +
		// v));
		employees = new LinkedList<>();
		Set iter = myMap.keySet();
		for (Object key : iter) {
			String realKey = (String) key;
			employees.add((Employee) myMap.get(realKey));
		}
		employees.forEach(e -> System.out.println(e));
	}

	/**
	 * @param employee
	 * @return
	 */
	public static String hash(Employee employee) {
		return employee.getLastName() + employee.getFirstName();
	}

}

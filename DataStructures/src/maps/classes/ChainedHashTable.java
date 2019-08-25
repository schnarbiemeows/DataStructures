package maps.classes;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author dylan
 *
 */
public class ChainedHashTable {

	private LinkedList<StoredEmployee>[] hashtable;

	/**
	 *
	 */
	public ChainedHashTable() {
		hashtable = new LinkedList[10];
		for (int i = 0; i < hashtable.length; i++) {
			hashtable[i] = new LinkedList<StoredEmployee>();
		}

	}

	/**
	 * @param key
	 * @param employee
	 */
	public void put(String key, Employee employee) {
		int hashedKey = hashKey(key);
		hashtable[hashedKey].add(new StoredEmployee(key, employee));
	}

	/**
	 * @param key
	 * @return
	 */
	public Employee get(String key) {
		int hashedKey = hashKey(key);
		ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
		StoredEmployee employee = null;
		while (iterator.hasNext()) {
			employee = iterator.next();
			if (employee.key.equals(key)) {
				return employee.employee;
			}
		}
		return null;
	}

	/**
	 * @param key
	 * @return
	 */
	public Employee remove(String key) {
		int hashedKey = hashKey(key);
		ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
		StoredEmployee employee = null;
		int index = -1;
		while (iterator.hasNext()) {
			employee = iterator.next();
			index++;
			if (employee.key.equals(key)) {
				break;
			}
		}
		if (employee == null) {
			return null;
		} else {
			hashtable[hashedKey].remove(index);
			return employee.employee;
		}
	}

	/**
	 * @param key
	 * @return
	 */
	private int hashKey(String key) {
		return key.length() % hashtable.length;
	}

	/**
	 *
	 */
	public void printHashtable() {
		for (int i = 0; i < hashtable.length; i++) {
			if (hashtable[i].isEmpty()) {
				System.out.println("Position: " + i + " : empty");
			} else {
				System.out.print("Position: " + i + " : ");
				ListIterator<StoredEmployee> iterator = hashtable[i].listIterator();
				while (iterator.hasNext()) {
					System.out.print(iterator.next().employee);
					System.out.print("->");
				}
				System.out.println("null");
			}
		}
	}
}

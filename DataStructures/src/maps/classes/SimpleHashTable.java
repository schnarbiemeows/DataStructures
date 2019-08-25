package maps.classes;

/**
 * @author dylan
 *
 */
public class SimpleHashTable {

	private Employee[] hashtable;

	/**
	 *
	 */
	public SimpleHashTable() {
		hashtable = new Employee[10];
	}

	/**
	 * @param key
	 * @return
	 */
	private int hashKey(String key) {
		return key.length() % hashtable.length;
	}

	/**
	 * @param key
	 * @param employee
	 */
	public void put(String key, Employee employee) {
		int hashedKey = hashKey(key);
		if (hashtable[hashedKey] != null) {
			System.out.println("Sorry, there's already an employee at position " + hashedKey);
		} else {
			hashtable[hashedKey] = employee;
		}
	}

	/**
	 * @param key
	 * @return
	 */
	public Employee get(String key) {
		int hashedKey = hashKey(key);
		return hashtable[hashedKey];
	}

	/**
	 *
	 */
	public void printHashtable() {
		for (int i = 0; i < hashtable.length; i++) {
			System.out.println(hashtable[i]);
		}
	}
}

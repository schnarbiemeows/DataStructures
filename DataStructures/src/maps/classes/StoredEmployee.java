package maps.classes;

/**
 * @author dylan
 *
 */
public class StoredEmployee {

	public String key; // raw key, not a hashed value
	public Employee employee;

	/**
	 * @param key
	 * @param employee
	 */
	public StoredEmployee(String key, Employee employee) {
		super();
		this.key = key;
		this.employee = employee;
	}

}

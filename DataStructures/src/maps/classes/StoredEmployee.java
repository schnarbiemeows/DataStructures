package maps.classes;

public class StoredEmployee {

	public String key; // raw key, not ahshed value
	public Employee employee;
	public StoredEmployee(String key, Employee employee) {
		super();
		this.key = key;
		this.employee = employee;
	}
	
}

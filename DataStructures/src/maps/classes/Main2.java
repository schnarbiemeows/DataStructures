package maps.classes;

/**
 * @author dylan
 *
 */
public class Main2 {

	/**
	 * lecture 72-74: Linear Probing // 2 strategies: // 1. - open addressing(if we
	 * find a collision when trying to put an item in, // look for another position
	 * in the array // 2. - Chaining
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);

		SimpleHashTable2 ht = new SimpleHashTable2();
		ht.put("Jones", janeJones);
		ht.put("Doe", johnDoe);
		ht.put("Wilson", mikeWilson);
		ht.put("Smith", marySmith);
		// ht.put("End", billEnd);
		ht.printHashtable();
		System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
		System.out.println("Retrieve key Smith: " + ht.get("Smith"));
		ht.remove("Wilson");
		ht.remove("Jones");
		ht.printHashtable();
		System.out.println("Retrieve key Smith: " + ht.get("Smith"));
	}
}

package maps.classes;

public class Main3 {

	public static void main(String[] args) {
		// lecture 75: Chaining
		// 2 strategies:
		// 1. - open addressing(if we find a collision when trying to put an item in,
		// look for another position in the array
		// 2. - Chaining
		Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);
        
        ChainedHashTable ht = new ChainedHashTable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Smith", marySmith);
        ht.put("Wilson", mikeWilson);
        ht.put("End", billEnd);
        ht.printHashtable();
        System.out.println("Retrieve key Smith: " + ht.get("Smith"));
        ht.remove("Wilson");
        ht.remove("Jones");
        ht.printHashtable();
        System.out.println("Retrieve key Smith: " + ht.get("Smith"));
	}
}

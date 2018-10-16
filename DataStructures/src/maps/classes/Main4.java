package maps.classes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main4 {

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
        
        Map<String, Employee> hashMap = new HashMap<String, Employee>(); 
        hashMap.put("Jones", janeJones);
        hashMap.put("Doe", johnDoe);
        hashMap.put("Smith", marySmith);
        Employee employee= hashMap.putIfAbsent("Bill", billEnd);
        System.out.println(employee);
        System.out.println(hashMap.getOrDefault("Smooth",mikeWilson));
        /*Iterator<Employee> iterator = hashMap.values().iterator();
        while(iterator.hasNext()) {
        	System.out.println(iterator.next());;
        }*/
        
        // only java 8 and beyond
        System.out.println(hashMap.containsKey("Doe"));
        System.out.println(hashMap.containsValue(janeJones));
        hashMap.forEach((k,v) -> System.out.println("Key = " + k + ", Employee = " + v));
        
	}
}

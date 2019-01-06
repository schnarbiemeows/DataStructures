package maps.classes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import maps.classes.HashingObject;

public class HashingMain {

	/* 
	 * this program shows how to override the equals and hashcode methods for an object
	 * so that you can use this object as a key for a HashMap. It also shows how you can 
	 * use these overrides to create a collision, thus receiving a value for the key
	 * myObject2 when you only put in key myObject1
	 */
	public HashingMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		HashingObject myObject1 = new HashingObject("Mel",5);
		HashingObject myObject2 = new HashingObject("Mel",5);
		int value1 = myObject1.hashCode();
		int value2 = myObject2.hashCode();
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(myObject1.equals(myObject2));
		HashMap<HashingObject,String> myMap = new HashMap();
		myMap.put(myObject1, "HI!");
		String result = myMap.get(myObject2);
		System.out.println(result);
		myMap.put(myObject2, "oops!");
		result = myMap.get(myObject1);
		System.out.println(result);
		
		// so, you can add a null to a set, and the set orders its elements according to a natural ordering
		Set<Integer> mySet = new HashSet<Integer>();
		mySet.add(null);
		mySet.add(5);
		mySet.add(0);
		mySet.add(4);
		mySet.add(1);
		mySet.add(2);
		Iterator<Integer> iter = mySet.iterator();
		while(iter.hasNext()) {
			Integer item = (Integer)iter.next();
			if(item==null ) System.out.print("null, "); 
			else System.out.print(item.intValue()+", ");
		}
		
	}

}

package maps.classes;

public class HashingObject {

	private String name;
	private int value;
	public HashingObject(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}
	
	@Override
	public int hashCode() {
		// very simple hashing algorithm(a bad one) that will enable us to create collisions
		return name.length()^value;
	}
	
	@Override
	public boolean equals(Object obj) {
		HashingObject comparator = (HashingObject)obj;
		if(this.name.equals(comparator.name)&&this.value==comparator.value) {
			return true;
		}
		return false;
	}
}

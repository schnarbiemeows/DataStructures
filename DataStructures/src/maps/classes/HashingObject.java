package maps.classes;

/**
 * @author dylan
 *
 */
public class HashingObject {

	private String name;
	private int value;

	/**
	 * @param name
	 * @param value
	 */
	public HashingObject(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// very simple hashing algorithm(a bad one) that will enable us to create
		// collisions
		return name.length() ^ value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		HashingObject comparator = (HashingObject) obj;
		if (this.name.equals(comparator.name) && this.value == comparator.value) {
			return true;
		}
		return false;
	}
}

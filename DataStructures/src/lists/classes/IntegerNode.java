package lists.classes;

/**
 * @author dylan
 *
 */
public class IntegerNode {

	private Integer value;
	private IntegerNode next;

	public IntegerNode(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public IntegerNode getNext() {
		return next;
	}

	public void setNext(IntegerNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return value.toString();
	}

}

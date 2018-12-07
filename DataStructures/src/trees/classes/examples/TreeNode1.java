package trees.classes.examples;

public class TreeNode1 {

	private int value;
	private TreeNode1 rightChild;
	private TreeNode1 leftChild;
	public TreeNode1(int value) {
		super();
		this.value = value;
	}
	
	public TreeNode1 get(int value) {
		if(this.value==value) {
			return this;
		} else {
			if(this.value<value&&null!=getLeftChild()) {
				return getLeftChild().get(value);
			} else if(this.value>value&&null!=getRightChild()) {
				return getRightChild().get(value);
			} else {
				return null; // value is not in tree
			}
		}
	}
	
	public void insert(int value) {
		if(this.value==value) {
			return;
		} else {
			if(this.value>value) {
				if(null==getLeftChild()) {
					setLeftChild(new TreeNode1(value));
				} else {
					getLeftChild().insert(value);
				}
			} else {
				if(null==getRightChild()) {
					setRightChild(new TreeNode1(value));
				} else {
					getRightChild().insert(value);
				}
			}
		}
	}
	
	public int min() {
		if(null==getLeftChild()) {
			return this.value;
		} else {
			return getLeftChild().min();
		}
	}
	
	public int max() {
		if(null==getRightChild()) {
			return this.value;
		} else {
			return getRightChild().max();
		}
	}
	
	public void traverseInOrder() {
		if(null!=getLeftChild()) {
			getLeftChild().traverseInOrder();
		}
		System.out.print(value+",");
		if(null!=getRightChild()) {
			getRightChild().traverseInOrder();
		}
	}
	
	public void traversePreOrder() {
		System.out.print(value+",");
		if(null!=getLeftChild()) {
			getLeftChild().traversePreOrder();
		}
		if(null!=getRightChild()) {
			getRightChild().traversePreOrder();
		}
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public TreeNode1 getRightChild() {
		return rightChild;
	}
	public void setRightChild(TreeNode1 rightChild) {
		this.rightChild = rightChild;
	}
	public TreeNode1 getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNode1 leftChild) {
		this.leftChild = leftChild;
	}
	
}

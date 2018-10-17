package trees.classes;

public class Tree {

	private TreeNode root;
	
	public void insert(int value) {
		if(root==null) {
			root = new TreeNode(value);
		}
		root.insert(value);
	}
	
	public void traversePreOrder() {
		if(root!=null) {
			root.traversePreOrder();
		}
	}
	
	public void traverseInOrder() {
		if(root!=null) {
			root.traverseInOrder();
		}
	}
	
	public TreeNode get(int value) {
		if(root!=null) {
			return root.get(value);
		}
		return null;
	}
	
	public void delete(int value) {
		root = delete(root,value);
	}
	
	private TreeNode delete(TreeNode subtreeRoot, int value) {
		if(subtreeRoot==null) {
			return subtreeRoot;
		} 
		if(value<subtreeRoot.getData()) {
			subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(),value));
		}
		else if (value>subtreeRoot.getData()) {
			subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(),value));
		}
		else {
			// cases 1 and 2: subtreeRoot has no children or 1 child
			if(subtreeRoot.getLeftChild()==null) {
				return subtreeRoot.getRightChild();
			} 
			else if(subtreeRoot.getRightChild()==null) {
				return subtreeRoot.getLeftChild();
			}
			
			// case 3 : node to delete has two children
			subtreeRoot.setData(subtreeRoot.getRightChild().min());
			subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(),subtreeRoot.getData()));
			
		}
		return subtreeRoot;
	}
	
	public int min() {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		return root.min();
	}
	
	public int max() {
		if(root==null) {
			return Integer.MAX_VALUE;
		}
		return root.max();
	}
	
	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}
}

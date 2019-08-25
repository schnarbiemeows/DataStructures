package trees.classes.examples;

/**
 * @author dylan
 *
 */
public class Tree1 {

	// BST
	private TreeNode1 root;

	/**
	 * @param item
	 */
	public void insert(int item) {
		if (root == null) {
			root = new TreeNode1(item);
		} else {
			root.insert(item);
		}
	}

	/**
	 * @throws Exception
	 */
	public void traversePreOrder() throws Exception {
		if (root == null) {
			throw new Exception("no root");
		} else {
			root.traversePreOrder();
		}
	}

	/**
	 * @throws Exception
	 */
	public void traverseInOrder() throws Exception {
		if (root == null) {
			throw new Exception("no root");
		} else {
			root.traverseInOrder();
		}
	}

	/**
	 * @param item
	 * @return
	 * @throws Exception
	 */
	public TreeNode1 get(int item) throws Exception {
		if (root == null) {
			throw new Exception("no root");
		} else {
			return root.get(item);
		}
	}

	/**
	 * @param item
	 */
	public void delete(int item) {
		root = delete(root, item);
	}

	/**
	 * @param subtreeRoot
	 * @param value
	 * @return
	 */
	private TreeNode1 delete(TreeNode1 subtreeRoot, int value) {
		// have to find our node to delete first
		if (subtreeRoot == null) {
			return null;
		}
		if (value < subtreeRoot.getValue()) {
			subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
		} else if (value > subtreeRoot.getValue()) {
			subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
		} else if (value == subtreeRoot.getValue()) {
			// found the Node to delete
			// 3 cases:
			// the node to delete is a leaf(has 0 children),
			if (null == subtreeRoot.getLeftChild() && null == subtreeRoot.getRightChild()) {
				return null;
			} else {
				// the node has 1 child
				if (subtreeRoot.getLeftChild() == null) {
					return subtreeRoot.getRightChild();
				} else if (subtreeRoot.getRightChild() == null) {
					return subtreeRoot.getLeftChild();
				} else {
					// the node has 2 children(complex)
					// let's always take the largest value in the left subtree
					// replace the value of the subtreeRoot with the max value from the left
					// child
					subtreeRoot.setValue(subtreeRoot.getLeftChild().max());
					// then we have to now run another delete on the left sub-branch to
					// remove the node that we got the max value from
					subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), subtreeRoot.getValue()));
				}
			}

		}

		return subtreeRoot;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public int min() throws Exception {
		if (root == null) {
			throw new Exception("no root");
		} else {
			return root.min();
		}
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public int max() throws Exception {
		if (root == null) {
			throw new Exception("no root");
		} else {
			return root.max();
		}
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public TreeNode1 getroot() throws Exception {
		if (root == null) {
			throw new Exception("no root");
		} else {
			return root;
		}
	}

	/**
	 * @param item
	 */
	public void setRoot(TreeNode1 item) {
		root = item;
	}

}

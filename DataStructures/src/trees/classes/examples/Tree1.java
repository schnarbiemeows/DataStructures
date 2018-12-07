package trees.classes.examples;

import trees.classes.TreeNode;

public class Tree1 {

	// BST
	private TreeNode1 root;
	
	public void insert(int item) {
		if(root==null) {
			root = new TreeNode1(item);
		} else {
			root.insert(item);
		}
	}
	
	public void traversePreOrder() throws Exception {
		if(root==null) {
			throw new Exception("no root");
		} else {
			root.traversePreOrder();
		}
	}
	
	public void  traverseInOrder() throws Exception {
		if(root==null) {
			throw new Exception("no root");
		} else {
			root.traverseInOrder();
		}
	}
	
	public TreeNode1 get(int item) throws Exception {
		if(root==null) {
			throw new Exception("no root");
		} else {
			return root.get(item);
		}
	}
	
	public void delete(int item) {
		root = delete(root,item);
	}
	
	private TreeNode1 delete(TreeNode1 subtreeRoot, int value) {
		// have to find our node to delete first
		if(subtreeRoot==null) {
			return null;
		}
		if(value<subtreeRoot.getValue()) {
			subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(),value));
		} else if(value>subtreeRoot.getValue()) {
			subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(),value));
		} else if(value==subtreeRoot.getValue()) {
			// found the Node to delete
			// 3 cases: 
			// the  node to delete is a leaf(has 0 children),
			if(null==subtreeRoot.getLeftChild()&&null==subtreeRoot.getRightChild()) {
				return null;
			} else {
			// the node has 1 child
				if(subtreeRoot.getLeftChild()==null) {
					return subtreeRoot.getRightChild();
				} else if(subtreeRoot.getRightChild()==null) {
					return subtreeRoot.getLeftChild();
				} else {
			// the node has 2 children(complex)
					// let's always take the largest value in the left subtree
					// replace the value of the subtreeRoot with the max value from the left
					// child
					subtreeRoot.setValue(subtreeRoot.getLeftChild().max());
					// then we have to now run another delete on the left sub-branch to
					// remove the node that we got the max value from
					subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(),subtreeRoot.getValue()));
				}
			}
			
		}
		
		return subtreeRoot;
	}
	
	public int min() throws Exception {
		if(root==null) {
			throw new Exception("no root");
		} else {
			return root.min();
		}
	}
	
	public int max() throws Exception {
		if(root==null) {
			throw new Exception("no root");
		} else {
			return root.max();
		}
	}
	
	public TreeNode1 getroot() throws Exception {
		if(root==null) {
			throw new Exception("no root");
		} else {
			return root;
		}
	}
	
	public void setRoot(TreeNode1 item) {
		root = item;
	}
	
	
}

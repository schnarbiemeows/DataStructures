package trees.classes;

public class Main1 {

	public static void main(String[] args) {
		// lecture 90,91,92,93 - BST(insertion,traversal,get,min,max,delete)
		Tree intTree = new Tree();
		intTree.insert(25);
		intTree.insert(20);
		intTree.insert(15);
		intTree.insert(27);
		intTree.insert(30);
		intTree.insert(29);
		intTree.insert(26);
		intTree.insert(22);
		intTree.insert(32);
		intTree.insert(17);
		intTree.tranverseInOrder();
		System.out.println();
		System.out.println(intTree.get(27));
		System.out.println(intTree.get(17));
		System.out.println(intTree.get(8888));
		System.out.println(intTree.min());
		System.out.println(intTree.max());
	}

}

package lists.classes;

public class Challenge2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        Integer one = 1;
	        Integer two = 2;
	        Integer three = 3;
	        Integer four = 4;

	        IntegerLinkedList list = new IntegerLinkedList();
	        list.insertSorted(three);
	        list.printList();
	        list.insertSorted(two);
	        list.printList();
	        list.insertSorted(one);
	        list.printList();
	        list.insertSorted(four);
	        list.printList();
	    }

}

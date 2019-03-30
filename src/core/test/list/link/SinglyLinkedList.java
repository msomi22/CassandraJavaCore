/**
 * 
 */
package core.test.list.link;

/**
 * @author t_pnjeru
 *
 */
public class SinglyLinkedList {
	
	static Node head;

	public SinglyLinkedList() {

	}

	public static class Node{
		int data;
		Node next;
		public Node(int item) {
			data = item;
			next = null;
		}
	}


	public void displayItems(Node node) {
		System.out.println("** Display Items in Linked List"); 
		while(node != null) {
			System.out.print(" " + node.data + " "); 
			node = node.next;
		}
		System.out.println(" ");
	}

	public Node addItem(Node node, int[] items, int start, int end) { 
		System.out.println("added items " + node.data);
		node.next = new Node(start); 
		while(start < items.length-1) 
			return addItem(node.next, items, start+1, end-1);
		return null;

	}

	public static Node removeNode(Node node) {
		return node;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5}; 
		SinglyLinkedList list = new SinglyLinkedList();
		Node node = new Node(arr[0]);
		Node head = list.addItem(node, arr, 1, arr.length-1); 
		list.displayItems(head);
	}


}

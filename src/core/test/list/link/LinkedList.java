package core.test.list.link;

public class LinkedList {
	static Node head;
	static int count;
	
	public LinkedList() {
		
	}

	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");  
			temp = temp.next;
		}
		System.out.println(" "); 
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = new Node(data);
			return;
		}
		newNode.next = null;
		Node last = head;
		while(last.next != null) 
			last = last.next;
		
		last.next = newNode;
		return;		
	}
	
	
	public void addAfter(Node prevNode, int data) {
		if(prevNode == null) {
			System.out.println("Node can't be null"); 
			return;
		}
		Node newNode = new Node(data);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		
	}
	
	public Node getfirstByData(int data) {
		Node temp = head;
		while(temp != null) {
			if(temp.data == data)
				return temp;
			temp = temp.next;
		}
		return null;
	}

	public int getSize() {
		Node temp = head;
		int count = 0;
		while(temp != null) {
			temp = temp.next;
			count+=1;
		}
		return count;
	}
}


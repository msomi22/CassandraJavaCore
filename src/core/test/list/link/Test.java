package core.test.list.link;

public class Test {

	public Test() {
		
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();	
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addFirst(4);
		list.addLast(5); 
		list.addLast(6); 
		list.addLast(8); 
		
		Node node = list.getfirstByData(1);
		int data = 7;
		if(node != null) {
			System.out.println("add " + data + " after = " + node.data); 
			list.addAfter(node, data); 
		}
		
		list.print();
		System.out.println("size = " + list.getSize()); 
		
	
	}

}

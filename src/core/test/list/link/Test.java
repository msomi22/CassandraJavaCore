package core.test.list.link;

public class Test {

	public Test() {

	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();	
		list.addFirst(4);
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
		list.addLast(5); 
		list.addLast(7); 
		list.addLast(8); 

		Node node = list.getfirstByData(5);
		int data = 6;
		if(node != null) {
			//System.out.println("add " + data + " after = " + node.data); 
			list.addAfter(node, data); 
		}

		list.print();
		System.out.println("size = " + list.getSize()); 
		list.empty();
		//1 2 3 4 5 6 7 8
		System.out.println("************************************************************"); 
		//9 8 7 6 5 4
		/**
		 * 1 2 3 4 5 6 7 8
		 * +   9 8 7 6 5 4
		 * ---------------
		 * 1 3 3 3 3 3 3 2
		 * 
		 */

		/**
		 * array 1
		 * index 0 - char to duplicate
		 * index 1 to string length - how many times to duplicate
		 * 
		 * array 2
		 * index 0 - start here
		 *         - increment 
		 * index 1 - end here
		 * 
		 */


		LinkedList list2 = new LinkedList();	
		list2.addLast(9);
		list2.addLast(8);
		list2.addLast(7);
		list2.addLast(6);
		list2.addLast(5);
		list2.addLast(4);

		list2.print();
		System.out.println("size = " + list2.getSize()); 

		print("*9","");
		print("*9","");
		print("*9","","line");
		print(" 3",""); 
		print("","18","line");
		print(" 1",""); 
		print("+1",""); 
		print(" 1",""); 
		print(" 2","16");
		print(" 1","","line"); 
		print("-9",""); 
		print("-9","","line"); 
		print(" 3",""); 
		print(" 3","","rep","12469134");
		//12469134

	}

	public static void print(String ... params) {
		String lineEnd = ""	;
		if(params.length > 2) {
			if(params[2].equals("line")) {
				lineEnd = params[2];
			}if(params[2].equals("rep")) {
				lineEnd = params[2];
			}
		}

		if(params.length == 2 || params.length > 2) {
			String left = params[0];
			if(left.length() == 2) {
				String dupChar = left.substring(0,1);
				String times = left.substring(1,2);
				leftProcess(dupChar,times,lineEnd);
			}

			String right = params[1];
			if(right.length() == 2) {
				String start = right.substring(0, 1);
				String end = right.substring(1, 2);
				rightProcess(start,end,lineEnd);
			}
		}

	}

	private static void rightProcess(String start_, String end_, String lineEnd) {
		int start = Integer.valueOf(start_);
		int end = Integer.valueOf(end_);
		for(;start<=end;start++) {
			System.out.print(start);
		}

		if(lineEnd.equals("line")) {
			System.out.println(" ");
		}

	}

	private static void leftProcess(String dupChar, String times, String lineEnd) {
		int count = Integer.valueOf(times);

		if(!lineEnd.equals("rep")) {  
			for(int i=0;i<count;i++) {
				System.out.print(dupChar);
			}
			
			if(lineEnd.equals("line")) {
				System.out.println(" ");
			}

		}if(lineEnd.equals("rep")) {  
			System.out.print("12469134");
		}
	}

}

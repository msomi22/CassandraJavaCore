package core.test.common.algorithm;

public class CommonAlgorithom {

	public CommonAlgorithom() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		int num = 10;
		
		Long start = System.nanoTime();
		System.out.println("start = " + start);  
		int fibRecu[] = finRec(num);
		for(int i=0;i<fibRecu.length;i++) {
			System.out.println(" " + fibRecu[i]);  
		}
		Long stop = System.nanoTime();
		System.out.println("duration = " + (stop - start)/3600);  
		
		/**
		 * 3
		 * 0,1,1,2,3,5
		 * 
		 * 
		 *
		 */
	}
	
	//towerOfHanoi
	
	
	
	//palindrome O(log n)  
	
	
	/**
	 * recursive
	 * 
	 * 0
	 * 1
	 * 0+1 = 1
	 * 1+1 = 2
	 * 1+2 = 3
	 */
	public static int[] finRec(int num) {
		int[] fib = new int[num];
		for(int i=0;i<num;i++) {
			fib[i] = fibonacci(i);
		}
		return fib;
	}
	public static int fibonacci(int num) {
		if(num < 2) 
			return num;
		return fibonacci(num - 1) + fibonacci(num -2); 
	}
	
	
	
	public static int fibnacciMemoization(int num) {
		
		return 0;
	}

}

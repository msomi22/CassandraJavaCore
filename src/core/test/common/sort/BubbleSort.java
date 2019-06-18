/**
Bubble Sort
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
Example:
First Pass:
( 5 1 4 2 8 ) �> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
( 1 5 4 2 8 ) �>  ( 1 4 5 2 8 ), Swap since 5 > 4
( 1 4 5 2 8 ) �>  ( 1 4 2 5 8 ), Swap since 5 > 2
( 1 4 2 5 8 ) �> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.

Second Pass:
( 1 4 2 5 8 ) �> ( 1 4 2 5 8 )
( 1 4 2 5 8 ) �> ( 1 2 4 5 8 ), Swap since 4 > 2
( 1 2 4 5 8 ) �> ( 1 2 4 5 8 )
( 1 2 4 5 8 ) �>  ( 1 2 4 5 8 )
Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one whole pass without any swap to know it is sorted.

Third Pass:
( 1 2 4 5 8 ) �> ( 1 2 4 5 8 )
( 1 2 4 5 8 ) �> ( 1 2 4 5 8 )
( 1 2 4 5 8 ) �> ( 1 2 4 5 8 )
( 1 2 4 5 8 ) �> ( 1 2 4 5 8 )
 */

package core.test.common.sort;

//Java program for implementation of Bubble Sort 
class BubbleSort 
{ 
	void bubbleSort(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n-1; i++) //0 to 6
			for (int j = 0; j < n-i-1; j++) //6-0-1 = 5
				if (arr[j] > arr[j+1]) //j 0,1
				{ 
					// swap arr[j+1] and arr[i] 
					int temp = arr[j]; 
					arr[j] = arr[j+1]; 
					arr[j+1] = temp; 
				} 
	} 

	/* Prints the array */
	void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 

	// Driver method to test above 
	public static void main(String args[]) 
	{ 
		BubbleSort ob = new BubbleSort(); 
		int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
		ob.bubbleSort(arr); 
		System.out.println("Sorted array"); 
		ob.printArray(arr); 
	} 
} 
/* This code is contributed by Rajat Mishra */

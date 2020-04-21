package org.bharath.spring.basics.understandingthespringframework;

public class BinarySearchImpl 
{
	
	public int binarySearch(int [] numbers,int numberToBeFound)
	{
		// Implement a sorting algorithm. We are going to implement Bubble sort 
		
		// Call the bubble sort 
		BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		int [] sortedResult = bubbleSortAlgorithm.bubbleSort(numbers);
		
		// Search the array
		
		return numberToBeFound;
	}
}

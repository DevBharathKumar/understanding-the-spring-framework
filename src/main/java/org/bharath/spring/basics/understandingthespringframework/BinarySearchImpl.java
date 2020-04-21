package org.bharath.spring.basics.understandingthespringframework;

public class BinarySearchImpl 
{
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
		System.out.println(sortAlgorithm);
	}
	
	
	public int binarySearch(int [] numbers,int numberToBeFound)
	{
		// Implement a sorting algorithm. We are going to implement Bubble sort 
		
		// Call the bubble sort 
		
		int [] sortedResult = sortAlgorithm.sort(numbers);
		
		// Search the array
		
		return numberToBeFound;
	}
}

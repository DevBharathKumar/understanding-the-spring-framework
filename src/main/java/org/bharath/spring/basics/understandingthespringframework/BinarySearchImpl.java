package org.bharath.spring.basics.understandingthespringframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl 
{
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}
	
	
	public int binarySearch(int [] numbers,int numberToBeFound)
	{
		// Implement a sorting algorithm. We are going to implement Bubble sort 
		
		// Call the bubble sort 
		
		int [] sortedResult = sortAlgorithm.sort(numbers);

		// TO check which algorithm is been used 
		System.out.println(sortAlgorithm);
		
		// Search the array
		
		return numberToBeFound;
	}
}

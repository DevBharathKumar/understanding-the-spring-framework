package org.bharath.spring.basics.understandingthespringframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl 
{
	
	@Autowired
	private SortAlgorithm bubbleSortAlgorithm;

	public BinarySearchImpl(SortAlgorithm bubbleSortAlgorithm) {
		this.bubbleSortAlgorithm = bubbleSortAlgorithm;
	}
 
	public int binarySearch(int[] numbers, int numberToBeFound) {
		// Implement a sorting algorithm. We are going to implement Bubble sort

		// Call the bubble sort

		int[] sortedResult = bubbleSortAlgorithm.sort(numbers);

		// TO check which algorithm is been used
		System.out.println(bubbleSortAlgorithm);

		// Search the array

		return numberToBeFound;
	}
}

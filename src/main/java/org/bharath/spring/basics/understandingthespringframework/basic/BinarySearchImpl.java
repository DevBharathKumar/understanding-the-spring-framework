package org.bharath.spring.basics.understandingthespringframework.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl 
{

	Logger logger = LoggerFactory.getLogger(BinarySearchImpl.class);
	
	private SortAlgorithm sortAlgorithm;

	@Autowired
	public BinarySearchImpl(@Qualifier("bubble") SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}
 
	public int binarySearch(int[] numbers, int numberToBeFound) {
		// Implement a sorting algorithm. We are going to implement Bubble sort

		// Call the bubble sort

		int[] sortedResult = sortAlgorithm.sort(numbers);

		// TO check which algorithm is been used
		System.out.println(sortAlgorithm);

		// Search the array

		return numberToBeFound;
	}
	
	@PostConstruct
	public void postConstruct() //We can give any name to the method by we should use @PostConstruct annotation
	{
		logger.info("Inside the post construct method ");
	}
	
	@PreDestroy
	public void preDestroy()
	{
		logger.info("Inside the pre destroy method ");
	}
}

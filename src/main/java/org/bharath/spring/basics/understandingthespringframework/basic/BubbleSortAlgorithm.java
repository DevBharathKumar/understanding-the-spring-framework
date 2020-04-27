package org.bharath.spring.basics.understandingthespringframework.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//By default the scope of the class is singleton

@Service
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm{
	
	public int[] sort(int [] numbers) {
		
		//Bubble sort algorithm 
		
		return numbers;
		
	}


}

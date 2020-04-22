package org.bharath.spring.basics.understandingthespringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//By default the scope of the class is singleton

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm{
	
	public int[] sort(int [] numbers) {
		
		//Bubble sort algorithm 
		
		return numbers;
		
	}


}

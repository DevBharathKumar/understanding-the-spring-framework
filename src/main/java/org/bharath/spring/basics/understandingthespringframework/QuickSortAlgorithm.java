package org.bharath.spring.basics.understandingthespringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{

	public int[] sort(int [] numbers) {
		
		//Quick sort algorithm 
		
		return numbers;
		
	}
	
}

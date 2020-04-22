package org.bharath.spring.basics.understandingthespringframework;

import org.bharath.spring.basics.understandingthespringframework.basic.BinarySearchImpl;
import org.bharath.spring.basics.understandingthespringframework.basic.BubbleSortAlgorithm;
import org.bharath.spring.basics.understandingthespringframework.basic.QuickSortAlgorithm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UnderstandingTheSpringFrameworkApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =  SpringApplication.run(UnderstandingTheSpringFrameworkApplication.class, args);
		
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println("# Searched output : "+binarySearchImpl.binarySearch(new int[] {1, 0,6},3));
		
		//Understanding the singleton and prototype scope
		//Singleton
		System.out.println("#1 Singleton : "+applicationContext.getBean(BubbleSortAlgorithm.class));
		System.out.println("#2 Singleton : "+applicationContext.getBean(BubbleSortAlgorithm.class));
		//Prototype
		System.out.println("#1 Prototype : "+applicationContext.getBean(QuickSortAlgorithm.class));
		System.out.println("#2 Prototype : "+applicationContext.getBean(QuickSortAlgorithm.class));
		
	}

}

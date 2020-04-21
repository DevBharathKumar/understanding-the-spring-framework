package org.bharath.spring.basics.understandingthespringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnderstandingTheSpringFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnderstandingTheSpringFrameworkApplication.class, args);
		
		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new BubbleSortAlgorithm());
		System.out.println("# Searched output : "+binarySearchImpl.binarySearch(new int[] {1, 0,6},3));
		
	}

}

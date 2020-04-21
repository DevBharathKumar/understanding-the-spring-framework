package org.bharath.spring.basics.understandingthespringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UnderstandingTheSpringFrameworkApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =  SpringApplication.run(UnderstandingTheSpringFrameworkApplication.class, args);
		
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println("# Searched output : "+binarySearchImpl.binarySearch(new int[] {1, 0,6},3));
		
	}

}

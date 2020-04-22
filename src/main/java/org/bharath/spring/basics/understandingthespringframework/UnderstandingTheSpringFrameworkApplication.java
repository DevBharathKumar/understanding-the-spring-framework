package org.bharath.spring.basics.understandingthespringframework;

import org.bharath.spring.basics.understandingthespringframework.basic.BinarySearchImpl;
import org.bharath.spring.basics.understandingthespringframework.basic.BubbleSortAlgorithm;
import org.bharath.spring.basics.understandingthespringframework.basic.QuickSortAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UnderstandingTheSpringFrameworkApplication {

	//Adding logger into the application 
	private static Logger logger = LoggerFactory.getLogger(UnderstandingTheSpringFrameworkApplication.class);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext =  SpringApplication.run(UnderstandingTheSpringFrameworkApplication.class, args);
		
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		
		logger.info("{}",binarySearchImpl.binarySearch(new int[] {1, 0,6},3));
		
		//Understanding the singleton and prototype scope
		//Singleton
		logger.info("{}",applicationContext.getBean(BubbleSortAlgorithm.class));
		logger.info("{}",applicationContext.getBean(BubbleSortAlgorithm.class));
		//Prototype
		logger.info("{}",applicationContext.getBean(QuickSortAlgorithm.class));
		logger.info("{}",applicationContext.getBean(QuickSortAlgorithm.class));
		
	}

}

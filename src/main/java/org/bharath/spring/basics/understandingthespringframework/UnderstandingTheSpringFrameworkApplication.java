package org.bharath.spring.basics.understandingthespringframework;

import org.bharath.spring.basics.understandingthespringframework.basic.BinarySearchImpl;
import org.bharath.spring.basics.understandingthespringframework.basic.BubbleSortAlgorithm;
import org.bharath.spring.basics.understandingthespringframework.basic.QuickSortAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.bharath.spring.basics.understandingthespringframework")
public class UnderstandingTheSpringFrameworkApplication {

	//Adding logger into the application 
	private static Logger logger = LoggerFactory.getLogger(UnderstandingTheSpringFrameworkApplication.class);
	
	public static void main(String[] args) {
		
		//One way of closing the applicationContext
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(UnderstandingTheSpringFrameworkApplication.class);
		
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		
		logger.info("{}",binarySearchImpl.binarySearch(new int[] {1, 0,6},3));
		
		//Understanding the singleton and prototype scope
		//Singleton
		logger.info("{}",applicationContext.getBean(BubbleSortAlgorithm.class));
		logger.info("{}",applicationContext.getBean(BubbleSortAlgorithm.class));
		//Prototype
		logger.info("{}",applicationContext.getBean(QuickSortAlgorithm.class));
		logger.info("{}",applicationContext.getBean(QuickSortAlgorithm.class));
		
		applicationContext.close();
	}

}

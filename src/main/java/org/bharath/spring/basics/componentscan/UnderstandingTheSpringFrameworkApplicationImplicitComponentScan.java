package org.bharath.spring.basics.componentscan;

import org.bharath.spring.basics.componentscan.ComponentScanDAO;
import org.bharath.spring.basics.understandingthespringframework.basic.BinarySearchImpl;
import org.bharath.spring.basics.understandingthespringframework.basic.BubbleSortAlgorithm;
import org.bharath.spring.basics.understandingthespringframework.basic.QuickSortAlgorithm;
import org.bharath.spring.basics.understandingthespringframework.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class UnderstandingTheSpringFrameworkApplicationImplicitComponentScan {

	//Adding logger into the application 
	private static Logger logger = LoggerFactory.getLogger(UnderstandingTheSpringFrameworkApplicationImplicitComponentScan.class);
	
	public static void main(String[] args) {
	
		ApplicationContext applicationContext =  SpringApplication.run(UnderstandingTheSpringFrameworkApplicationImplicitComponentScan.class, args);
		
		String lineBreak= new String("------------------------------------------------");
		
		logger.info("{}",lineBreak);
		
		ComponentScanDAO componentScanDAO1 = applicationContext.getBean(ComponentScanDAO.class);
		ComponentScanDAO componentScanDAO2 = applicationContext.getBean(ComponentScanDAO.class);
		
		logger.info("{}",componentScanDAO1);
		logger.info("{}",componentScanDAO1.getComponentScanJdbc());
		
		logger.info("{}",componentScanDAO2);
		
		//Getting 2nd JDBC connection for the same object 
		logger.info("{}",componentScanDAO1.getComponentScanJdbc());
		
		
		logger.info("{}",lineBreak);

	}

}

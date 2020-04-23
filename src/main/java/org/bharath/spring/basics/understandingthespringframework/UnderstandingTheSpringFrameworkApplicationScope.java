package org.bharath.spring.basics.understandingthespringframework;

import org.bharath.spring.basics.understandingthespringframework.basic.BinarySearchImpl;
import org.bharath.spring.basics.understandingthespringframework.basic.BubbleSortAlgorithm;
import org.bharath.spring.basics.understandingthespringframework.basic.QuickSortAlgorithm;
import org.bharath.spring.basics.understandingthespringframework.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UnderstandingTheSpringFrameworkApplicationScope {

	//Adding logger into the application 
	private static Logger logger = LoggerFactory.getLogger(UnderstandingTheSpringFrameworkApplicationScope.class);
	
	public static void main(String[] args) {
	
		ApplicationContext applicationContext =  SpringApplication.run(UnderstandingTheSpringFrameworkApplicationScope.class, args);
		
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
		
		logger.info("{}",personDAO);
		logger.info("{}",personDAO.getJdbcConnection());
		
		logger.info("{}",personDAO1);
		logger.info("{}",personDAO.getJdbcConnection());
	}

}

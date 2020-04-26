package org.bharath.spring.basics.understandingthespringframework;

import org.bharath.spring.basics.understandingthespringframework.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class UnderstandingTheSpringFrameworkApplicationScope {

	//Adding logger into the application 
	private static Logger logger = LoggerFactory.getLogger(UnderstandingTheSpringFrameworkApplicationScope.class);
	
	public static void main(String[] args) {
	
		try(AnnotationConfigApplicationContext applicationContext =  
				new AnnotationConfigApplicationContext(UnderstandingTheSpringFrameworkApplicationScope.class)){
		
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
		
		logger.info("{}",personDAO);
		logger.info("{}",personDAO.getJdbcConnection());
		
		logger.info("{}",personDAO1);
		logger.info("{}",personDAO.getJdbcConnection());
		
		}//Try block ends here 
	}

}

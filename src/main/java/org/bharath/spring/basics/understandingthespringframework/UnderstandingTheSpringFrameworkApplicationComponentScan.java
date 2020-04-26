package org.bharath.spring.basics.understandingthespringframework;

import org.bharath.spring.basics.componentscan.ComponentScanDAO;
import org.bharath.spring.basics.understandingthespringframework.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"org.bharath.spring.basics.componentscan",
	"org.bharath.spring.basics.understandingthespringframework"})
public class UnderstandingTheSpringFrameworkApplicationComponentScan {

	//Adding logger into the application 
	private static Logger logger = LoggerFactory.getLogger(UnderstandingTheSpringFrameworkApplicationComponentScan.class);
	
	public static void main(String[] args) {
	
		//Another way of closing the application context using try block which is introduced in Java 7
		try(AnnotationConfigApplicationContext applicationContext =  
				new AnnotationConfigApplicationContext(UnderstandingTheSpringFrameworkApplicationComponentScan.class)){
		
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
		
		// When we specify org.bharath.spring.basics.componentscan alone in the @ComponentScan. The component scan will 
		// scan for components in the org.bharath.spring.basics.componentscan package and it sub packages
		// so the code present in the other packages (For eg org.bharath.spring.basics.understandingthespringframework) and it sub packages
		// will not be scanned by the component scan. So the code given below will not work 
		
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
		
		logger.info("{}",personDAO);
		logger.info("{}",personDAO.getJdbcConnection());
		
		logger.info("{}",personDAO1);
		logger.info("{}",personDAO.getJdbcConnection());
		
		logger.info("{}",lineBreak);
		
		}//Try block ends here 
	}

}

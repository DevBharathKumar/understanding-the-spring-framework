package org.bharath.spring.basics.componentscan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
@ComponentScan
public class UnderstandingTheSpringFrameworkApplicationImplicitComponentScan {

	//Adding logger into the application 
	private static Logger logger = LoggerFactory.getLogger(UnderstandingTheSpringFrameworkApplicationImplicitComponentScan.class);
	
	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext applicationContext =  new AnnotationConfigApplicationContext(UnderstandingTheSpringFrameworkApplicationImplicitComponentScan.class);
		
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
		
		applicationContext.close();
	}

}

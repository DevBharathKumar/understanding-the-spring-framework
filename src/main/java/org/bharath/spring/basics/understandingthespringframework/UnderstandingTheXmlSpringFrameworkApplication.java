package org.bharath.spring.basics.understandingthespringframework;

import org.bharath.spring.basics.understandingthespringframework.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("org.bharath.spring.basics.understandingthespringframework")
public class UnderstandingTheXmlSpringFrameworkApplication {

	//Adding logger into the application 
	private static Logger logger = LoggerFactory.getLogger(UnderstandingTheXmlSpringFrameworkApplication.class);
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println(" ---> Printing the array "+(Object)applicationContext.getBeanDefinitionNames());

		logger.info("Logging the array -> {}",(Object)applicationContext.getBeanDefinitionNames());
		
		XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);
		
		logger.info(" {} ",personDAO);
		logger.info(" {} ",personDAO.getXmlJdbcConnection());
		
		applicationContext.close();
		
	}

}

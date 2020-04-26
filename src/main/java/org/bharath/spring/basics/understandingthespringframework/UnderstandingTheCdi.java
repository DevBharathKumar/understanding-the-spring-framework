package org.bharath.spring.basics.understandingthespringframework;

import org.bharath.spring.basics.understandingthespringframework.cdi.CdiDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan 
//If we are not specifying any package name then the package of the UnderstandingTheCdi will be taken by default
public class UnderstandingTheCdi {

	//Adding logger into the application 
	private static Logger logger = LoggerFactory.getLogger(UnderstandingTheCdi.class);
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(UnderstandingTheCdi.class);
		
		CdiDAO cdiDAO = applicationContext.getBean(CdiDAO.class);
		
		logger.info("{} --- JDBC Connection {} --- ",cdiDAO,cdiDAO.getCdiJdbcConnection());
		
		applicationContext.close();
	}

}

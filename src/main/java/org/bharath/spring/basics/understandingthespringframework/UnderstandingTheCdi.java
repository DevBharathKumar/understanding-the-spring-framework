package org.bharath.spring.basics.understandingthespringframework;

import org.bharath.spring.basics.understandingthespringframework.basic.BinarySearchImpl;
import org.bharath.spring.basics.understandingthespringframework.basic.BubbleSortAlgorithm;
import org.bharath.spring.basics.understandingthespringframework.basic.QuickSortAlgorithm;
import org.bharath.spring.basics.understandingthespringframework.cdi.CdiDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UnderstandingTheCdi {

	//Adding logger into the application 
	private static Logger logger = LoggerFactory.getLogger(UnderstandingTheCdi.class);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext =  SpringApplication.run(UnderstandingTheCdi.class, args);
		
		CdiDAO cdiDAO = applicationContext.getBean(CdiDAO.class);
		
		logger.info("{} --- JDBC Connection {} --- ",cdiDAO,cdiDAO.getCdiJdbcConnection());
	}

}

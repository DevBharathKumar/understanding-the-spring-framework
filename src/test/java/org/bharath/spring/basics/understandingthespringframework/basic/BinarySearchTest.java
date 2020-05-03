package org.bharath.spring.basics.understandingthespringframework.basic;

//Added the annotations manually need to check why annotations are not imported manually 
import static org.junit.Assert.assertEquals;

import org.bharath.spring.basics.understandingthespringframework.UnderstandingTheSpringFrameworkApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=UnderstandingTheSpringFrameworkApplication.class)
public class BinarySearchTest {

	@Autowired
	BinarySearchImpl binarySearchImpl;
	
	@Test
	public void testingTheBinarySearch() 
	{
		assertEquals(8,binarySearchImpl.binarySearch(new int [] {1, 2,4,5},8));
	}

}

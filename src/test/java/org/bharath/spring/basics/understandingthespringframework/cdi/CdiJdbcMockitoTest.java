package org.bharath.spring.basics.understandingthespringframework.cdi;

//Added the annotations manually need to check why annotations are not imported manually 
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CdiJdbcMockitoTest {

	@Mock
	CdiJdbcConnection cdiJdbcConnection;
	
	@InjectMocks
	CdiDAO cdiDAO;
	
	@Test
	public void testingTheBinarySearch() 
	{
		Mockito.when(cdiJdbcConnection.getNumbers()).thenReturn(new int [] {1,89,700});
		assertEquals(700,cdiDAO.getLargestNumber());
	}

}

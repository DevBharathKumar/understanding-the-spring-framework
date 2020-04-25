package org.bharath.spring.basics.understandingthespringframework.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CdiDAO {

	@Inject
	private CdiJdbcConnection cdiJdbcConnection;

	public CdiJdbcConnection getCdiJdbcConnection() {
		return cdiJdbcConnection;
	}

	public void setCdiJdbcConnection(CdiJdbcConnection cdiJdbcConnection) {
		this.cdiJdbcConnection = cdiJdbcConnection;
	}
	
	
}

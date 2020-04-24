package org.bharath.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentScanDAO 
{
	@Autowired
	private ComponentScanJdbc componentScanJdbc;

	public ComponentScanJdbc getComponentScanJdbc() {
		return componentScanJdbc;
	}

	public void setComponentScanJdbc(ComponentScanJdbc componentScanJdbc) {
		this.componentScanJdbc = componentScanJdbc;
	}

}

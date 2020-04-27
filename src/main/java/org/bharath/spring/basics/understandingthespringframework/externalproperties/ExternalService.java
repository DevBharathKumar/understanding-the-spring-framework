package org.bharath.spring.basics.understandingthespringframework.externalproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ExternalService {
	
	@Value("${external-url}")
	private String url;
	
	public String getExternalUrl()
	{
		return this.url;
	}
}

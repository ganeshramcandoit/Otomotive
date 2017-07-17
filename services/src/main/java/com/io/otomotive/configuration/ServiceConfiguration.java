package com.io.otomotive.configuration;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.io.common.interfaces.OtomotiveServiceI;
import com.io.otomotive.endpoint.ServiceEndpoint;


@Configuration
public class ServiceConfiguration {
	@Bean
	public ServletRegistrationBean cxfServlet() {
		return new ServletRegistrationBean(new CXFServlet(), "/ws-api/*");
	}

	@Bean(name = Bus.DEFAULT_BUS_ID)
	public SpringBus springBus() {
		return new SpringBus();
	}
	
	@Bean
    public OtomotiveServiceI otomotiveService() {
    	return new ServiceEndpoint();
    }
    
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), otomotiveService());
        endpoint.publish("/OtomotiveService_1.0");
        endpoint.setWsdlLocation("Otomotive1.0.wsdl");
        return endpoint;
    }
}

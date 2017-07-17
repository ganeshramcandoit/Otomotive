package com.io.common.pojo;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {
	public ObjectFactory() {
    }
	public static BaslatRequest createBaslatRequest() {
		return new BaslatRequest();
	}
	
	public static BaslatResponse createBaslatResponse() {
		return new BaslatResponse();
	}
}

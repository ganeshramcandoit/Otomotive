package com.io.common.interfaces;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.io.common.pojo.BaslatRequest;
import com.io.common.pojo.BaslatResponse;

@WebService(name = "OtomotiveService", targetNamespace = "http://www.otomotive.de/namespace/alisveris/")
@XmlSeeAlso({ com.io.common.pojo.ObjectFactory.class})
public interface OtomotiveServiceI {
	@WebMethod(operationName = "alisverisBaslat", action = "http://www.otomotive.de/namespace/alisveris/alisverisBaslat")
	@WebResult(name = "BaslatResponse", targetNamespace = "http://www.otomotive.de/namespace/alisveris/general")
	public BaslatResponse alisverisBaslat(@WebParam(name = "BaslatRequest") BaslatRequest baslatRequest)
			throws Exception;
}

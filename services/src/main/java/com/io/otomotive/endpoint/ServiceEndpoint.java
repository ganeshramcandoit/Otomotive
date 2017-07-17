package com.io.otomotive.endpoint;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.io.common.interfaces.OtomotiveServiceI;
import com.io.common.pojo.BaslatRequest;
import com.io.common.pojo.BaslatResponse;

public class ServiceEndpoint implements OtomotiveServiceI {

	@Override
	public BaslatResponse alisverisBaslat(BaslatRequest baslatRequest) throws Exception {
		// TODO Auto-generated method stub
		BaslatResponse baslatResponse = null;
		try {
			JAXBContext jc = JAXBContext.newInstance(BaslatResponse.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
	        StringReader reader = new StringReader("<BaslatResponse>\r\n" + 
	        		"   <RESULT>1</RESULT>\r\n" + 
	        		"   <STATUS>0</STATUS>\r\n" + 
	        		"   <DEFINTION/>\r\n" + 
	        		"   <TRXNO>05072010101000000001</TRXNO>\r\n" + 
	        		"   <DISCOUNT>\r\n" + 
	        		"      <NEWTRANSACTIONCOST>78</NEWTRANSACTIONCOST>\r\n" + 
	        		"      <DKID>1234</DKID>\r\n" + 
	        		"      <DKAD>DIP INDIRIM KAMP</DKAD>\r\n" + 
	        		"      <DKKP>30</DKKP>\r\n" + 
	        		"      <DIPDISCOUNTCOST>10</DIPDISCOUNTCOST>\r\n" + 
	        		"      <PRODUCTDISCOUNTLIST>\r\n" + 
	        		"         <PRODUCTDISCOUNT>\r\n" + 
	        		"            <UKID>1287</UKID>\r\n" + 
	        		"            <UKAD>URUN INDIRIM KAMP</UKAD>\r\n" + 
	        		"            <UKKP>30</UKKP>\r\n" + 
	        		"            <PRODUCTCODE>1</PRODUCTCODE>\r\n" + 
	        		"            <PDISCOUNTRATE>5</PDISCOUNTRATE>\r\n" + 
	        		"         </PRODUCTDISCOUNT>\r\n" + 
	        		"         <PRODUCTDISCOUNT>\r\n" + 
	        		"            <UKID>1287</UKID>\r\n" + 
	        		"            <UKAD>URUN INDIRIM KAMP</UKAD>\r\n" + 
	        		"            <UKKP>30</UKKP>\r\n" + 
	        		"            <PRODUCTCODE>2</PRODUCTCODE>\r\n" + 
	        		"            <PDISCOUNTRATE>7</PDISCOUNTRATE>\r\n" + 
	        		"         </PRODUCTDISCOUNT>\r\n" + 
	        		"      </PRODUCTDISCOUNTLIST>\r\n" + 
	        		"   </DISCOUNT>\r\n" + 
	        		"   <APAROPOINTS>100</APAROPOINTS>\r\n" + 
	        		"   <TPAROPOINTS>100</TPAROPOINTS>\r\n" + 
	        		"   <EXPENSINGSTATUS>1</EXPENSINGSTATUS>\r\n" + 
	        		"   <AUTHORIZATIONSTATUS>1</AUTHORIZATIONSTATUS>\r\n" + 
	        		"   <REGISTRATIONSTATUS>1</REGISTRATIONSTATUS>\r\n" + 
	        		"   <VERDEKOD>12345678</VERDEKOD>\r\n" + 
	        		"   <SHOPPOINTS>100</SHOPPOINTS>\r\n" + 
	        		"   <NAMESURNAME>MEHMET ALI| BAYSAL</NAMESURNAME>\r\n" + 
	        		"</BaslatResponse>");
	        baslatResponse = (BaslatResponse) unmarshaller.unmarshal(reader);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return baslatResponse;
	}

}

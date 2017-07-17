package com.io.common.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="BaslatResponse")
@XmlType(factoryClass = ObjectFactory.class, factoryMethod = "createBaslatResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class BaslatResponse
{
	@XmlElement(name="DEFINITION")
    private String defintion;

	@XmlElement(name="REGISTRATIONSTATUS")
    private String registrationStatus;

	@XmlElement(name="TRXNO")
    private String trxNo;

	@XmlElement(name="NAMESURNAME")
    private String nameSurName;

	@XmlElement(name="TPAROPOINTS")
    private String tpAroPoints;

	@XmlElement(name="APAROPOINTS")
    private String apAroPoints;

	@XmlElement(name="EXPENSINGSTATUS")
    private String expensingStatus;

	@XmlElement(name="AUTHORIZATIONSTATUS")
    private String authorizationStatus;

	@XmlElement(name="DISCOUNT")
    private Discount discount;

	@XmlElement(name="VERDEKOD")
    private String verdekod;

	@XmlElement(name="RESULT")
    private String result;

	@XmlElement(name="SHOPPOINTS")
    private String shopPoints;

	@XmlElement(name="STATUS")
    private String status;
    
    @Override
    public String toString()
    {
        return "ClassPojo [defintion = "+defintion+", registrationStatus = "+registrationStatus+", trxNo = "+trxNo+", nameSurName = "+nameSurName+", tpAroPoints = "+tpAroPoints+", apAroPoints = "+apAroPoints+", expensingStatus = "+expensingStatus+", authorizationStatus = "+authorizationStatus+", Discount = "+discount+", verdekod = "+verdekod+", result = "+result+", shopPoints = "+shopPoints+", status = "+status+"]";
    }

	public String getDefintion() {
		return defintion;
	}

	public void setDefintion(String defintion) {
		this.defintion = defintion;
	}

	public String getRegistrationStatus() {
		return registrationStatus;
	}

	public void setRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
	}

	public String getTrxNo() {
		return trxNo;
	}

	public void setTrxNo(String trxNo) {
		this.trxNo = trxNo;
	}

	public String getNameSurName() {
		return nameSurName;
	}

	public void setNameSurName(String nameSurName) {
		this.nameSurName = nameSurName;
	}

	public String getTpAroPoints() {
		return tpAroPoints;
	}

	public void setTpAroPoints(String tpAroPoints) {
		this.tpAroPoints = tpAroPoints;
	}

	public String getApAroPoints() {
		return apAroPoints;
	}

	public void setApAroPoints(String apAroPoints) {
		this.apAroPoints = apAroPoints;
	}

	public String getExpensingStatus() {
		return expensingStatus;
	}

	public void setExpensingStatus(String expensingStatus) {
		this.expensingStatus = expensingStatus;
	}

	public String getAuthorizationStatus() {
		return authorizationStatus;
	}

	public void setAuthorizationStatus(String authorizationStatus) {
		this.authorizationStatus = authorizationStatus;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public String getVerdekod() {
		return verdekod;
	}

	public void setVerdekod(String verdekod) {
		this.verdekod = verdekod;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getShopPoints() {
		return shopPoints;
	}

	public void setShopPoints(String shopPoints) {
		this.shopPoints = shopPoints;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}

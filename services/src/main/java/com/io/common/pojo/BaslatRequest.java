package com.io.common.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="BaslatRequest")
@XmlType(factoryClass = ObjectFactory.class, factoryMethod = "createBaslatRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class BaslatRequest {
	
	@XmlElement(name = "PCID")
	public String pcId;

	@XmlElement(name = "KARTNO")
	public String kartNo;

	@XmlElement(name = "AD")
	public String ad;

	@XmlElement(name = "SOYAD")
	public String soyad;

	@XmlElement(name = "DOGUMTARIHI")
	public String dogumTarihi;

	@XmlElement(name = "CEPTEL")
	public String cepTel;

	@XmlElement(name = "ISTEL")
	public String isTel;

	@XmlElement(name = "EVTEL")
	public String evTel;

	@XmlElement(name = "YASAKLI")
	public String yasakli;

	@XmlElement(name = "ISYERIKOD")
	public String isyeriKod;

	@XmlElement(name = "SUBEKOD")
	public String subeKod;

	@XmlElement(name = "YETKILIKOD")
	public String yetkiliKod;

	@XmlElement(name = "MARKA")
	public String marka;

	@XmlElement(name = "MODEL")
	public String model;

	@XmlElement(name = "URUN")
	public String urun;

	@XmlElement(name = "ISLEMTIP")
	public String islemTip;

	@XmlElement(name = "PARAM1")
	public String param1;

	public BaslatRequest() {
		super();
	}

	public String getPcId() {
		return pcId;
	}

	public void setPcId(String pcId) {
		this.pcId = pcId;
	}

	public String getKartNo() {
		return kartNo;
	}

	public void setKartNo(String kartNo) {
		this.kartNo = kartNo;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(String dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	public String getCepTel() {
		return cepTel;
	}

	public void setCepTel(String cepTel) {
		this.cepTel = cepTel;
	}

	public String getIsTel() {
		return isTel;
	}

	public void setIsTel(String isTel) {
		this.isTel = isTel;
	}

	public String getEvTel() {
		return evTel;
	}

	public void setEvTel(String evTel) {
		this.evTel = evTel;
	}

	public String getYasakli() {
		return yasakli;
	}

	public void setYasakli(String yasakli) {
		this.yasakli = yasakli;
	}

	public String getIsyeriKod() {
		return isyeriKod;
	}

	public void setIsyeriKod(String isyeriKod) {
		this.isyeriKod = isyeriKod;
	}

	public String getSubeKod() {
		return subeKod;
	}

	public void setSubeKod(String subeKod) {
		this.subeKod = subeKod;
	}

	public String getYetkiliKod() {
		return yetkiliKod;
	}

	public void setYetkiliKod(String yetkiliKod) {
		this.yetkiliKod = yetkiliKod;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getUrun() {
		return urun;
	}

	public void setUrun(String urun) {
		this.urun = urun;
	}

	public String getIslemTip() {
		return islemTip;
	}

	public void setIslemTip(String islemTip) {
		this.islemTip = islemTip;
	}

	public String getParam1() {
		return param1;
	}

	public void setParam1(String param1) {
		this.param1 = param1;
	}

}

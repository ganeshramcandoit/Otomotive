package com.io.common.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PRODUCTDISCOUNT")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductDiscount
{
	@XmlElement(name="UKAD")
    private String ukad;

	@XmlElement(name="PDISCOUNTRATE")
    private String pDiscountRate;

	@XmlElement(name="PRODUCTCODE")
    private String productCode;

	@XmlElement(name="UKKP")
    private String ukkp;

	@XmlElement(name="UKID")
    private String ukid;

    public String getukad ()
    {
        return ukad;
    }

    public void setukad (String ukad)
    {
        this.ukad = ukad;
    }

    public String getpDiscountRate ()
    {
        return pDiscountRate;
    }

    public void setpDiscountRate (String pDiscountRate)
    {
        this.pDiscountRate = pDiscountRate;
    }

    public String getproductCode ()
    {
        return productCode;
    }

    public void setproductCode (String productCode)
    {
        this.productCode = productCode;
    }

    public String getukkp ()
    {
        return ukkp;
    }

    public void setukkp (String ukkp)
    {
        this.ukkp = ukkp;
    }

    public String getukid ()
    {
        return ukid;
    }

    public void setukid (String ukid)
    {
        this.ukid = ukid;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ukad = "+ukad+", pDiscountRate = "+pDiscountRate+", productCode = "+productCode+", ukkp = "+ukkp+", ukid = "+ukid+"]";
    }
}
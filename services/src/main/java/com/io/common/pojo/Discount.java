package com.io.common.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DISCOUNT")
@XmlAccessorType(XmlAccessType.FIELD)
public class Discount
{
	@XmlElement(name="NEWTRANSACTIONCOST")
    private String newTransactionCost;

	@XmlElement(name="DIPDISCOUNTCOST")
    private String dipDiscountCost;

	@XmlElement(name="PRODUCTDISCOUNTLIST")
    private List<ProductDiscount> productDiscountList;

	@XmlElement(name="DKAD")
    private String dkad;

	@XmlElement(name="DKKP")
    private String dkkp;

	@XmlElement(name="DKID")
    private String dkid;

    public String getnewTransactionCost ()
    {
        return newTransactionCost;
    }

    public void setnewTransactionCost (String newTransactionCost)
    {
        this.newTransactionCost = newTransactionCost;
    }

    public String getdipDiscountCost ()
    {
        return dipDiscountCost;
    }

    public void setdipDiscountCost (String dipDiscountCost)
    {
        this.dipDiscountCost = dipDiscountCost;
    }

    public List<ProductDiscount> getproductDiscountList() {
		return productDiscountList;
	}

	public void setproductDiscountList(List<ProductDiscount> productDiscountList) {
		this.productDiscountList = productDiscountList;
	}

	public String getdkad ()
    {
        return dkad;
    }

    public void setdkad (String dkad)
    {
        this.dkad = dkad;
    }

    public String getdkkp ()
    {
        return dkkp;
    }

    public void setdkkp (String dkkp)
    {
        this.dkkp = dkkp;
    }

    public String getdkid ()
    {
        return dkid;
    }

    public void setdkid (String dkid)
    {
        this.dkid = dkid;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [newTransactionCost = "+newTransactionCost+", dipDiscountCost = "+dipDiscountCost+", productDiscountList = "+productDiscountList+", dkad = "+dkad+", dkkp = "+dkkp+", dkid = "+dkid+"]";
    }
}

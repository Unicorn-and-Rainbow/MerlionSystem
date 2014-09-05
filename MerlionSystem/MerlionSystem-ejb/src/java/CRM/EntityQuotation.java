/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRM;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityQuotation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long quotationID;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date quotationDate;
    private double quotationPrice;
    private String quotationDescription;    
    private Long[] quotationServiceID;
    private int[] quotationServiceVolume;

    public EntityQuotation() {
        this.setQuotationID(System.nanoTime());
    }

    public void createQuotation(Date quotationDate, double quotationPrice, 
            String quotationDescription, Long[] quotationServiceID, 
            int[] quotationServiceVolume) {
        this.quotationDate = quotationDate;
        this.quotationPrice = quotationPrice;
        this.quotationDescription = quotationDescription;
        this.quotationServiceID = quotationServiceID;
        this.quotationServiceVolume = quotationServiceVolume;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getQuotationID() {
        return quotationID;
    }

    public Date getQuotationDate() {
        return quotationDate;
    }

    public double getQuotationPrice() {
        return quotationPrice;
    }

    public String getQuotationDescription() {
        return quotationDescription;
    }

    public Long[] getQuotationServiceID() {
        return quotationServiceID;
    }

    public int[] getQuotationServiceVolume() {
        return quotationServiceVolume;
    }

    public void setQuotationID(Long quotationID) {
        this.quotationID = quotationID;
    }

    public void setQuotationDate(Date quotationDate) {
        this.quotationDate = quotationDate;
    }

    public void setQuotationPrice(double quotationPrice) {
        this.quotationPrice = quotationPrice;
    }

    public void setQuotationDescription(String quotationDescription) {
        this.quotationDescription = quotationDescription;
    }

    public void setQuotationServiceID(Long[] quotationServiceID) {
        this.quotationServiceID = quotationServiceID;
    }

    public void setQuotationServiceVolume(int[] quotationServiceVolume) {
        this.quotationServiceVolume = quotationServiceVolume;
    }
}
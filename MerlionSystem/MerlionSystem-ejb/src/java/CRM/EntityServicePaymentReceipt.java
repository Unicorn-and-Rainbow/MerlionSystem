/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRM;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author yuna
 */
@Entity
public class EntityServicePaymentReceipt implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long paymentID;
    
    private Date paymentDate;
    private Date paymentReceiveDate;
    private String paymentFromName;
    private double paymentAmount;
    private String paymentToName;
    private String paymentToAddress;
    private String paymentToAddressCity;
    private String paymentToAddressCountry;
    private String paymentToAddressZip;
    private String paymentCurrency;
    private double paymentTotal;
    private String paymentStatus;

    public EntityServicePaymentReceipt() {
    }

    public EntityServicePaymentReceipt(Long paymentID, Date paymentDate, Date paymentReceiveDate, String paymentFromName, double paymentAmount, String paymentToName, String paymentToAddress, String paymentToAddressCity, String paymentToAddressCountry, String paymentToAddressZip, String paymentCurrency, double paymentTotal, String paymentStatus) {
        this.paymentID = paymentID;
        this.paymentDate = paymentDate;
        this.paymentReceiveDate = paymentReceiveDate;
        this.paymentFromName = paymentFromName;
        this.paymentAmount = paymentAmount;
        this.paymentToName = paymentToName;
        this.paymentToAddress = paymentToAddress;
        this.paymentToAddressCity = paymentToAddressCity;
        this.paymentToAddressCountry = paymentToAddressCountry;
        this.paymentToAddressZip = paymentToAddressZip;
        this.paymentCurrency = paymentCurrency;
        this.paymentTotal = paymentTotal;
        this.paymentStatus = paymentStatus;
    }

    
    
    public Long getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(Long paymentID) {
        this.paymentID = paymentID;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Date getPaymentReceiveDate() {
        return paymentReceiveDate;
    }

    public void setPaymentReceiveDate(Date paymentReceiveDate) {
        this.paymentReceiveDate = paymentReceiveDate;
    }

    public String getPaymentFromName() {
        return paymentFromName;
    }

    public void setPaymentFromName(String paymentFromName) {
        this.paymentFromName = paymentFromName;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentToName() {
        return paymentToName;
    }

    public void setPaymentToName(String paymentToName) {
        this.paymentToName = paymentToName;
    }

    public String getPaymentToAddress() {
        return paymentToAddress;
    }

    public void setPaymentToAddress(String paymentToAddress) {
        this.paymentToAddress = paymentToAddress;
    }

    public String getPaymentToAddressCity() {
        return paymentToAddressCity;
    }

    public void setPaymentToAddressCity(String paymentToAddressCity) {
        this.paymentToAddressCity = paymentToAddressCity;
    }

    public String getPaymentToAddressCountry() {
        return paymentToAddressCountry;
    }

    public void setPaymentToAddressCountry(String paymentToAddressCountry) {
        this.paymentToAddressCountry = paymentToAddressCountry;
    }

    public String getPaymentToAddressZip() {
        return paymentToAddressZip;
    }

    public void setPaymentToAddressZip(String paymentToAddressZip) {
        this.paymentToAddressZip = paymentToAddressZip;
    }

    public String getPaymentCurrency() {
        return paymentCurrency;
    }

    public void setPaymentCurrency(String paymentCurrency) {
        this.paymentCurrency = paymentCurrency;
    }

    public double getPaymentTotal() {
        return paymentTotal;
    }

    public void setPaymentTotal(double paymentTotal) {
        this.paymentTotal = paymentTotal;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentID != null ? paymentID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the paymentID fields are not set
        if (!(object instanceof EntityServicePaymentReceipt)) {
            return false;
        }
        EntityServicePaymentReceipt other = (EntityServicePaymentReceipt) object;
        if ((this.paymentID == null && other.paymentID != null) || (this.paymentID != null && !this.paymentID.equals(other.paymentID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CRM.EntityServicePaymentReceipt[ id=" + paymentID + " ]";
    }
    
}

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
import javax.persistence.OneToOne;

/**
 *
 * @author yuna
 */
@Entity
public class EntityServiceInvoice implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long invoiceID;

    @OneToOne
    private EntityServicePaymentReceipt servicePaymentReceipt;
    
    private Date invoiceDate;
    private String invoiceDescription;
    private Long invoiceOwnerID;
    private String invoiceOwnerName;
    private String invoiceOwnerAddress;
    private String invoiceOwnerAddressCity;
    private String inoviceOwnerAddressCountry;
    private String invoiceOwnerAddressZip;
    private Long invoiceReceiverID;
    private String invoiceReceiverName;
    private String invoiceReceiverAddress;
    private String invoiceReceiverAddressCity;
    private String invoiceReceiverAddressCountry;
    private String invoiceReceiverAddressZip;
    private String invoiceCurrency;
    private double invoiceSubTotal;
    private double invoiceTaxRate;
    private double invoiceTax;
    private double invoiceTotal;
    private String invoiceStatus;

    public EntityServiceInvoice() {
    }

    public EntityServiceInvoice(Long invoiceID, EntityServicePaymentReceipt servicePaymentReceipt, Date invoiceDate, String invoiceDescription, Long invoiceOwnerID, String invoiceOwnerName, String invoiceOwnerAddress, String invoiceOwnerAddressCity, String inoviceOwnerAddressCountry, String invoiceOwnerAddressZip, Long invoiceReceiverID, String invoiceReceiverName, String invoiceReceiverAddress, String invoiceReceiverAddressCity, String invoiceReceiverAddressCountry, String invoiceReceiverAddressZip, String invoiceCurrency, double invoiceSubTotal, double invoiceTaxRate, double invoiceTax, double invoiceTotal, String invoiceStatus) {
        this.invoiceID = invoiceID;
        this.servicePaymentReceipt = servicePaymentReceipt;
        this.invoiceDate = invoiceDate;
        this.invoiceDescription = invoiceDescription;
        this.invoiceOwnerID = invoiceOwnerID;
        this.invoiceOwnerName = invoiceOwnerName;
        this.invoiceOwnerAddress = invoiceOwnerAddress;
        this.invoiceOwnerAddressCity = invoiceOwnerAddressCity;
        this.inoviceOwnerAddressCountry = inoviceOwnerAddressCountry;
        this.invoiceOwnerAddressZip = invoiceOwnerAddressZip;
        this.invoiceReceiverID = invoiceReceiverID;
        this.invoiceReceiverName = invoiceReceiverName;
        this.invoiceReceiverAddress = invoiceReceiverAddress;
        this.invoiceReceiverAddressCity = invoiceReceiverAddressCity;
        this.invoiceReceiverAddressCountry = invoiceReceiverAddressCountry;
        this.invoiceReceiverAddressZip = invoiceReceiverAddressZip;
        this.invoiceCurrency = invoiceCurrency;
        this.invoiceSubTotal = invoiceSubTotal;
        this.invoiceTaxRate = invoiceTaxRate;
        this.invoiceTax = invoiceTax;
        this.invoiceTotal = invoiceTotal;
        this.invoiceStatus = invoiceStatus;
    }
    
    
    
    public Long getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(Long invoiceID) {
        this.invoiceID = invoiceID;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getInvoiceDescription() {
        return invoiceDescription;
    }

    public void setInvoiceDescription(String invoiceDescription) {
        this.invoiceDescription = invoiceDescription;
    }

    public Long getInvoiceOwnerID() {
        return invoiceOwnerID;
    }

    public void setInvoiceOwnerID(Long invoiceOwnerID) {
        this.invoiceOwnerID = invoiceOwnerID;
    }

    public String getInvoiceOwnerName() {
        return invoiceOwnerName;
    }

    public void setInvoiceOwnerName(String invoiceOwnerName) {
        this.invoiceOwnerName = invoiceOwnerName;
    }

    public String getInvoiceOwnerAddress() {
        return invoiceOwnerAddress;
    }

    public void setInvoiceOwnerAddress(String invoiceOwnerAddress) {
        this.invoiceOwnerAddress = invoiceOwnerAddress;
    }

    public String getInvoiceOwnerAddressCity() {
        return invoiceOwnerAddressCity;
    }

    public void setInvoiceOwnerAddressCity(String invoiceOwnerAddressCity) {
        this.invoiceOwnerAddressCity = invoiceOwnerAddressCity;
    }

    public String getInoviceOwnerAddressCountry() {
        return inoviceOwnerAddressCountry;
    }

    public void setInoviceOwnerAddressCountry(String inoviceOwnerAddressCountry) {
        this.inoviceOwnerAddressCountry = inoviceOwnerAddressCountry;
    }

    public String getInvoiceOwnerAddressZip() {
        return invoiceOwnerAddressZip;
    }

    public void setInvoiceOwnerAddressZip(String invoiceOwnerAddressZip) {
        this.invoiceOwnerAddressZip = invoiceOwnerAddressZip;
    }

    public Long getInvoiceReceiverID() {
        return invoiceReceiverID;
    }

    public void setInvoiceReceiverID(Long invoiceReceiverID) {
        this.invoiceReceiverID = invoiceReceiverID;
    }

    public String getInvoiceReceiverName() {
        return invoiceReceiverName;
    }

    public void setInvoiceReceiverName(String invoiceReceiverName) {
        this.invoiceReceiverName = invoiceReceiverName;
    }

    public String getInvoiceReceiverAddress() {
        return invoiceReceiverAddress;
    }

    public void setInvoiceReceiverAddress(String invoiceReceiverAddress) {
        this.invoiceReceiverAddress = invoiceReceiverAddress;
    }

    public String getInvoiceReceiverAddressCity() {
        return invoiceReceiverAddressCity;
    }

    public void setInvoiceReceiverAddressCity(String invoiceReceiverAddressCity) {
        this.invoiceReceiverAddressCity = invoiceReceiverAddressCity;
    }

    public String getInvoiceReceiverAddressCountry() {
        return invoiceReceiverAddressCountry;
    }

    public void setInvoiceReceiverAddressCountry(String invoiceReceiverAddressCountry) {
        this.invoiceReceiverAddressCountry = invoiceReceiverAddressCountry;
    }

    public String getInvoiceReceiverAddressZip() {
        return invoiceReceiverAddressZip;
    }

    public void setInvoiceReceiverAddressZip(String invoiceReceiverAddressZip) {
        this.invoiceReceiverAddressZip = invoiceReceiverAddressZip;
    }

    public String getInvoiceCurrency() {
        return invoiceCurrency;
    }

    public void setInvoiceCurrency(String invoiceCurrency) {
        this.invoiceCurrency = invoiceCurrency;
    }

    public double getInvoiceSubTotal() {
        return invoiceSubTotal;
    }

    public void setInvoiceSubTotal(double invoiceSubTotal) {
        this.invoiceSubTotal = invoiceSubTotal;
    }

    public double getInvoiceTaxRate() {
        return invoiceTaxRate;
    }

    public void setInvoiceTaxRate(double invoiceTaxRate) {
        this.invoiceTaxRate = invoiceTaxRate;
    }

    public double getInvoiceTax() {
        return invoiceTax;
    }

    public void setInvoiceTax(double invoiceTax) {
        this.invoiceTax = invoiceTax;
    }

    public double getInvoiceTotal() {
        return invoiceTotal;
    }

    public void setInvoiceTotal(double invoiceTotal) {
        this.invoiceTotal = invoiceTotal;
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public EntityServicePaymentReceipt getServicePaymentReceipt() {
        return servicePaymentReceipt;
    }

    public void setServicePaymentReceipt(EntityServicePaymentReceipt servicePaymentReceipt) {
        this.servicePaymentReceipt = servicePaymentReceipt;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceID != null ? invoiceID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the invoiceID fields are not set
        if (!(object instanceof EntityServiceInvoice)) {
            return false;
        }
        EntityServiceInvoice other = (EntityServiceInvoice) object;
        if ((this.invoiceID == null && other.invoiceID != null) || (this.invoiceID != null && !this.invoiceID.equals(other.invoiceID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CRM.EntityServiceInvoice[ id=" + invoiceID + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRM;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author yuna
 */
@Entity
public class EntityServiceQuotation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long quotationID;
    @OneToOne(mappedBy="serviceQuotation")
    private EntityServiceContract serviceContract;
    @ManyToOne
    private EntityCompany company;
    @ManyToOne
    private EntityServiceRequest serviceRequest;
    @OneToMany(mappedBy="serviceQuotation")
    private Set<AbstractServiceEntry> abstractServiceEntry = new HashSet<AbstractServiceEntry>();
    
    private Date quotationDate;
    private String quotationType;
    private String quotationDescription;
    private Long quotationOwnerID;
    private Long quotationReceiverID;
    private String quotationCurrency;
    private double quotationSubTotal;
    private double quotationTaxRate;
    private double quotationTax;
    private double quotationTotal;
    private String quotationSatus;

    public EntityServiceQuotation() {
    }

    public EntityServiceQuotation(Long quotationID, EntityServiceContract serviceContract, EntityCompany company, EntityServiceRequest serviceRequest, Date quotationDate, String quotationType, String quotationDescription, Long quotationOwnerID, Long quotationReceiverID, String quotationCurrency, double quotationSubTotal, double quotationTaxRate, double quotationTax, double quotationTotal, String quotationSatus) {
        this.quotationID = quotationID;
        this.serviceContract = serviceContract;
        this.company = company;
        this.serviceRequest = serviceRequest;
        this.quotationDate = quotationDate;
        this.quotationType = quotationType;
        this.quotationDescription = quotationDescription;
        this.quotationOwnerID = quotationOwnerID;
        this.quotationReceiverID = quotationReceiverID;
        this.quotationCurrency = quotationCurrency;
        this.quotationSubTotal = quotationSubTotal;
        this.quotationTaxRate = quotationTaxRate;
        this.quotationTax = quotationTax;
        this.quotationTotal = quotationTotal;
        this.quotationSatus = quotationSatus;
    }

    
    
    public Long getQuotationID() {
        return quotationID;
    }

    public void setQuotationID(Long quotationID) {
        this.quotationID = quotationID;
    }

    public Date getQuotationDate() {
        return quotationDate;
    }

    public void setQuotationDate(Date quotationDate) {
        this.quotationDate = quotationDate;
    }

    public String getQuotationType() {
        return quotationType;
    }

    public void setQuotationType(String quotationType) {
        this.quotationType = quotationType;
    }

    public String getQuotationDescription() {
        return quotationDescription;
    }

    public void setQuotationDescription(String quotationDescription) {
        this.quotationDescription = quotationDescription;
    }

    public Long getQuotationOwnerID() {
        return quotationOwnerID;
    }

    public void setQuotationOwnerID(Long quotationOwnerID) {
        this.quotationOwnerID = quotationOwnerID;
    }

    public Long getQuotationReceiverID() {
        return quotationReceiverID;
    }

    public void setQuotationReceiverID(Long quotationReceiverID) {
        this.quotationReceiverID = quotationReceiverID;
    }

    public String getQuotationCurrency() {
        return quotationCurrency;
    }

    public void setQuotationCurrency(String quotationCurrency) {
        this.quotationCurrency = quotationCurrency;
    }

    public double getQuotationSubTotal() {
        return quotationSubTotal;
    }

    public void setQuotationSubTotal(double quotationSubTotal) {
        this.quotationSubTotal = quotationSubTotal;
    }

    public double getQuotationTaxRate() {
        return quotationTaxRate;
    }

    public void setQuotationTaxRate(double quotationTaxRate) {
        this.quotationTaxRate = quotationTaxRate;
    }

    public double getQuotationTax() {
        return quotationTax;
    }

    public void setQuotationTax(double quotationTax) {
        this.quotationTax = quotationTax;
    }

    public double getQuotationTotal() {
        return quotationTotal;
    }

    public void setQuotationTotal(double quotationTotal) {
        this.quotationTotal = quotationTotal;
    }

    public String getQuotationSatus() {
        return quotationSatus;
    }

    public void setQuotationSatus(String quotationSatus) {
        this.quotationSatus = quotationSatus;
    }

    public EntityServiceContract getServiceContract() {
        return serviceContract;
    }

    public void setServiceContract(EntityServiceContract serviceContract) {
        this.serviceContract = serviceContract;
    }

    public EntityCompany getCompany() {
        return company;
    }

    public void setCompany(EntityCompany company) {
        this.company = company;
    }

    public EntityServiceRequest getServiceRequest() {
        return serviceRequest;
    }

    public void setServiceRequest(EntityServiceRequest serviceRequest) {
        this.serviceRequest = serviceRequest;
    }

    public Set<AbstractServiceEntry> getAbstractServiceEntry() {
        return abstractServiceEntry;
    }

    public void setAbstractServiceEntry(Set<AbstractServiceEntry> abstractServiceEntry) {
        this.abstractServiceEntry = abstractServiceEntry;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (quotationID != null ? quotationID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the quotationID fields are not set
        if (!(object instanceof EntityServiceQuotation)) {
            return false;
        }
        EntityServiceQuotation other = (EntityServiceQuotation) object;
        if ((this.quotationID == null && other.quotationID != null) || (this.quotationID != null && !this.quotationID.equals(other.quotationID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CRM.EntityServiceQuotation[ id=" + quotationID + " ]";
    }
    
}

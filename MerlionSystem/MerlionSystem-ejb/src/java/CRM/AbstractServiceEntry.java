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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author yuna
 */
@Entity
abstract class AbstractServiceEntry implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long serviceEntryID;
    private Long serviceEntryCreatorHR;
    private String serviceType;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date serviceStartDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date serviceEndDate;
    private double serviceProductSize;
    private double serviceProductWeight;
    private double serviceProductQty;
    private double serviceCost;
    private double servicePrice;
    @OneToOne(mappedBy = "abstractServiceEntry")
    private AbstractService abstractService;
    @ManyToOne
    private EntityServiceRequest serviceRequest;
    @ManyToOne
    private EntityServiceOrder serviceOrder;
    @ManyToOne
    private EntityServiceQuotation serviceQuotation;
    @ManyToOne
    private EntityServiceContract serviceContract;

    public AbstractServiceEntry() {
    }

    public AbstractServiceEntry(Long serviceEntryID, Long serviceEntryCreatorHR, String serviceType, Date serviceStartDate, Date serviceEndDate, double serviceProductSize, double serviceProductWeight, double serviceProductQty, double serviceCost, double servicePrice, AbstractService abstractService, EntityServiceRequest serviceRequest, EntityServiceOrder serviceOrder, EntityServiceQuotation serviceQuotation, EntityServiceContract serviceContract) {
        this.serviceEntryID = serviceEntryID;
        this.serviceEntryCreatorHR = serviceEntryCreatorHR;
        this.serviceType = serviceType;
        this.serviceStartDate = serviceStartDate;
        this.serviceEndDate = serviceEndDate;
        this.serviceProductSize = serviceProductSize;
        this.serviceProductWeight = serviceProductWeight;
        this.serviceProductQty = serviceProductQty;
        this.serviceCost = serviceCost;
        this.servicePrice = servicePrice;
        this.abstractService = abstractService;
        this.serviceRequest = serviceRequest;
        this.serviceOrder = serviceOrder;
        this.serviceQuotation = serviceQuotation;
        this.serviceContract = serviceContract;
    }
    
    
    
    public Long getServiceEntryID() {
        return serviceEntryID;
    }

    public void setServiceEntryID(Long serviceEntryID) {
        this.serviceEntryID = serviceEntryID;
    }

    public Long getServiceEntryCreatorHR() {
        return serviceEntryCreatorHR;
    }

    public void setServiceEntryCreatorHR(Long serviceEntryCreatorHR) {
        this.serviceEntryCreatorHR = serviceEntryCreatorHR;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public Date getServiceStartDate() {
        return serviceStartDate;
    }

    public void setServiceStartDate(Date serviceStartDate) {
        this.serviceStartDate = serviceStartDate;
    }

    public Date getServiceEndDate() {
        return serviceEndDate;
    }

    public void setServiceEndDate(Date serviceEndDate) {
        this.serviceEndDate = serviceEndDate;
    }

    public double getServiceProductSize() {
        return serviceProductSize;
    }

    public void setServiceProductSize(double serviceProductSize) {
        this.serviceProductSize = serviceProductSize;
    }

    public double getServiceProductWeight() {
        return serviceProductWeight;
    }

    public void setServiceProductWeight(double serviceProductWeight) {
        this.serviceProductWeight = serviceProductWeight;
    }

    public double getServiceProductQty() {
        return serviceProductQty;
    }

    public void setServiceProductQty(double serviceProductQty) {
        this.serviceProductQty = serviceProductQty;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(double servicePrice) {
        this.servicePrice = servicePrice;
    }

    public AbstractService getAbstractService() {
        return abstractService;
    }

    public void setAbstractService(AbstractService abstractService) {
        this.abstractService = abstractService;
    }

    public EntityServiceRequest getServiceRequest() {
        return serviceRequest;
    }

    public void setServiceRequest(EntityServiceRequest serviceRequest) {
        this.serviceRequest = serviceRequest;
    }

    public EntityServiceOrder getServiceOrder() {
        return serviceOrder;
    }

    public void setServiceOrder(EntityServiceOrder serviceOrder) {
        this.serviceOrder = serviceOrder;
    }

    public EntityServiceQuotation getServiceQuotation() {
        return serviceQuotation;
    }

    public void setServiceQuotation(EntityServiceQuotation serviceQuotation) {
        this.serviceQuotation = serviceQuotation;
    }

    public EntityServiceContract getServiceContract() {
        return serviceContract;
    }

    public void setServiceContract(EntityServiceContract serviceContract) {
        this.serviceContract = serviceContract;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serviceEntryID != null ? serviceEntryID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the serviceEntryID fields are not set
        if (!(object instanceof AbstractServiceEntry)) {
            return false;
        }
        AbstractServiceEntry other = (AbstractServiceEntry) object;
        if ((this.serviceEntryID == null && other.serviceEntryID != null) || (this.serviceEntryID != null && !this.serviceEntryID.equals(other.serviceEntryID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CRM.AbstractServiceEntry[ id=" + serviceEntryID + " ]";
    }
    
}

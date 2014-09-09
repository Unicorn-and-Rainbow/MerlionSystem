/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRM;

import CommonInfrastructure.EntityCompany;
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

/**
 *
 * @author yuna
 */
@Entity
public class EntityServiceRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long serviceRequestID;
    @OneToMany(mappedBy="serviceRequest")
    private Set<AbstractServiceEntry>abstractServiceEntry = new HashSet<AbstractServiceEntry>();
    @OneToMany(mappedBy="serviceRequest")
    private Set<EntityServiceQuotation>serviceQuotation = new HashSet<EntityServiceQuotation>();
    @ManyToOne
    private EntityCompany company;
    
    private Date serviceRequestDate;
    private String serviceRequestDescription;
    private Long serviceRequestOwnerID;
    private Long serviceRequestReceiverID;
    private String serviceRequestStatus;

    public EntityServiceRequest() {
    }

    public EntityServiceRequest(Long serviceRequestID, EntityCompany company, Date serviceRequestDate, String serviceRequestDescription, Long serviceRequestOwnerID, Long serviceRequestReceiverID, String serviceRequestStatus) {
        this.serviceRequestID = serviceRequestID;
        this.company = company;
        this.serviceRequestDate = serviceRequestDate;
        this.serviceRequestDescription = serviceRequestDescription;
        this.serviceRequestOwnerID = serviceRequestOwnerID;
        this.serviceRequestReceiverID = serviceRequestReceiverID;
        this.serviceRequestStatus = serviceRequestStatus;
    }

    
    
    public Long getServiceRequestID() {
        return serviceRequestID;
    }

    public void setServiceRequestID(Long serviceRequestID) {
        this.serviceRequestID = serviceRequestID;
    }

    public Date getServiceRequestDate() {
        return serviceRequestDate;
    }

    public void setServiceRequestDate(Date serviceRequestDate) {
        this.serviceRequestDate = serviceRequestDate;
    }

    public String getServiceRequestDescription() {
        return serviceRequestDescription;
    }

    public void setServiceRequestDescription(String serviceRequestDescription) {
        this.serviceRequestDescription = serviceRequestDescription;
    }

    public Long getServiceRequestOwnerID() {
        return serviceRequestOwnerID;
    }

    public void setServiceRequestOwnerID(Long serviceRequestOwnerID) {
        this.serviceRequestOwnerID = serviceRequestOwnerID;
    }

    public Long getServiceRequestReceiverID() {
        return serviceRequestReceiverID;
    }

    public void setServiceRequestReceiverID(Long serviceRequestReceiverID) {
        this.serviceRequestReceiverID = serviceRequestReceiverID;
    }

    public String getServiceRequestStatus() {
        return serviceRequestStatus;
    }

    public void setServiceRequestStatus(String serviceRequestStatus) {
        this.serviceRequestStatus = serviceRequestStatus;
    }

    public Set<AbstractServiceEntry> getAbstractServiceEntry() {
        return abstractServiceEntry;
    }

    public void setAbstractServiceEntry(Set<AbstractServiceEntry> abstractServiceEntry) {
        this.abstractServiceEntry = abstractServiceEntry;
    }

    public Set<EntityServiceQuotation> getServiceQuotation() {
        return serviceQuotation;
    }

    public void setServiceQuotation(Set<EntityServiceQuotation> serviceQuotation) {
        this.serviceQuotation = serviceQuotation;
    }

    public EntityCompany getCompany() {
        return company;
    }

    public void setCompany(EntityCompany company) {
        this.company = company;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serviceRequestID != null ? serviceRequestID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the serviceRequestID fields are not set
        if (!(object instanceof EntityServiceRequest)) {
            return false;
        }
        EntityServiceRequest other = (EntityServiceRequest) object;
        if ((this.serviceRequestID == null && other.serviceRequestID != null) || (this.serviceRequestID != null && !this.serviceRequestID.equals(other.serviceRequestID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CRM.EntityServiceRequest[ id=" + serviceRequestID + " ]";
    }
    
}

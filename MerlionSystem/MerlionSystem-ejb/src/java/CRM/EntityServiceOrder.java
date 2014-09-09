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
import javax.persistence.OneToOne;

/**
 *
 * @author yuna
 */
@Entity
public class EntityServiceOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long serviceOrderID;

    @OneToOne(mappedBy="serviceOrder")
    private EntityServiceContract serviceContract;
    @ManyToOne
    private EntityCompany company;
    @OneToMany(mappedBy="serviceOrder")
    private Set<AbstractServiceEntry> abstractServiceEntry = new HashSet<AbstractServiceEntry>();
    
    private Date serviceOrderDate;
    private Long serviceOrderCreatorHR;
    private String serviceOrderReference;
    private String serviceOrderStatus;

    public EntityServiceOrder() {
    }

    public EntityServiceOrder(Long serviceOrderID, EntityServiceContract serviceContract, EntityCompany company, Date serviceOrderDate, Long serviceOrderCreatorHR, String serviceOrderReference, String serviceOrderStatus) {
        this.serviceOrderID = serviceOrderID;
        this.serviceContract = serviceContract;
        this.company = company;
        this.serviceOrderDate = serviceOrderDate;
        this.serviceOrderCreatorHR = serviceOrderCreatorHR;
        this.serviceOrderReference = serviceOrderReference;
        this.serviceOrderStatus = serviceOrderStatus;
    }
    
    
    public Long getServiceOrderID() {
        return serviceOrderID;
    }

    public void setServiceOrderID(Long serviceOrderID) {
        this.serviceOrderID = serviceOrderID;
    }

    public Date getServiceOrderDate() {
        return serviceOrderDate;
    }

    public void setServiceOrderDate(Date serviceOrderDate) {
        this.serviceOrderDate = serviceOrderDate;
    }

    public Long getServiceOrderCreatorHR() {
        return serviceOrderCreatorHR;
    }

    public void setServiceOrderCreatorHR(Long serviceOrderCreatorHR) {
        this.serviceOrderCreatorHR = serviceOrderCreatorHR;
    }

    public String getServiceOrderReference() {
        return serviceOrderReference;
    }

    public void setServiceOrderReference(String serviceOrderReference) {
        this.serviceOrderReference = serviceOrderReference;
    }

    public String getServiceOrderStatus() {
        return serviceOrderStatus;
    }

    public void setServiceOrderStatus(String serviceOrderStatus) {
        this.serviceOrderStatus = serviceOrderStatus;
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

    public Set<AbstractServiceEntry> getAbstractServiceEntry() {
        return abstractServiceEntry;
    }

    public void setAbstractServiceEntry(Set<AbstractServiceEntry> abstractServiceEntry) {
        this.abstractServiceEntry = abstractServiceEntry;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serviceOrderID != null ? serviceOrderID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the serviceOrderID fields are not set
        if (!(object instanceof EntityServiceOrder)) {
            return false;
        }
        EntityServiceOrder other = (EntityServiceOrder) object;
        if ((this.serviceOrderID == null && other.serviceOrderID != null) || (this.serviceOrderID != null && !this.serviceOrderID.equals(other.serviceOrderID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CRM.EntityServiceOrder[ id=" + serviceOrderID + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRM;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author yuna
 */
@Entity
abstract class AbstractService implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long serviceID;
    @ManyToOne
    private EntityServiceCatalog serviceCatalog;
    @OneToOne
    private AbstractServiceEntry abstractServiceEntry;
    
    private String serviceName;
    private String serviceType;
    private String serviceDescription;
    private String serviceRemark;

    public Long getServiceID() {
        return serviceID;
    }

    public void setServiceID(Long serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getServiceRemark() {
        return serviceRemark;
    }

    public void setServiceRemark(String serviceRemark) {
        this.serviceRemark = serviceRemark;
    }

    public EntityServiceCatalog getServiceCatalog() {
        return serviceCatalog;
    }

    public void setServiceCatalog(EntityServiceCatalog serviceCatalog) {
        this.serviceCatalog = serviceCatalog;
    }

    public AbstractServiceEntry getAbstractServiceEntry() {
        return abstractServiceEntry;
    }

    public void setAbstractServiceEntry(AbstractServiceEntry abstractServiceEntry) {
        this.abstractServiceEntry = abstractServiceEntry;
    }
    
    


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serviceID != null ? serviceID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the serviceID fields are not set
        if (!(object instanceof AbstractService)) {
            return false;
        }
        AbstractService other = (AbstractService) object;
        if ((this.serviceID == null && other.serviceID != null) || (this.serviceID != null && !this.serviceID.equals(other.serviceID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CRM.AbstractService[ id=" + serviceID + " ]";
    }
    
}

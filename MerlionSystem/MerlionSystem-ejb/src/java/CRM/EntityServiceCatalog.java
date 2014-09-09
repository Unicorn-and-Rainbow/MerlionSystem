/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRM;

import java.io.Serializable;
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
public class EntityServiceCatalog implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long serviceCatalogID;
    @OneToMany(mappedBy="serviceCatalog")
    private Set<AbstractService> abstractService = new HashSet<AbstractService>();
    @ManyToOne
    private EntityCompany company;
    
    private String serviceCatalogName;
    private String serviceCatalogDescription;

    public EntityServiceCatalog() {
    }

    public EntityServiceCatalog(Long serviceCatalogID, String serviceCatalogName, String serviceCatalogDescription) {
        this.serviceCatalogID = serviceCatalogID;
        this.serviceCatalogName = serviceCatalogName;
        this.serviceCatalogDescription = serviceCatalogDescription;
    }

    public Long getServiceCatalogID() {
        return serviceCatalogID;
    }

    public void setServiceCatalogID(Long serviceCatalogID) {
        this.serviceCatalogID = serviceCatalogID;
    }

    public String getServiceCatalogName() {
        return serviceCatalogName;
    }

    public void setServiceCatalogName(String serviceCatalogName) {
        this.serviceCatalogName = serviceCatalogName;
    }

    public String getServiceCatalogDescription() {
        return serviceCatalogDescription;
    }

    public void setServiceCatalogDescription(String serviceCatalogDescription) {
        this.serviceCatalogDescription = serviceCatalogDescription;
    }

    public Set<AbstractService> getAbstractService() {
        return abstractService;
    }

    public void setAbstractService(Set<AbstractService> abstractService) {
        this.abstractService = abstractService;
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
        hash += (serviceCatalogID != null ? serviceCatalogID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the serviceCatalogID fields are not set
        if (!(object instanceof EntityServiceCatalog)) {
            return false;
        }
        EntityServiceCatalog other = (EntityServiceCatalog) object;
        if ((this.serviceCatalogID == null && other.serviceCatalogID != null) || (this.serviceCatalogID != null && !this.serviceCatalogID.equals(other.serviceCatalogID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CRM.EntityServiceCatalog[ id=" + serviceCatalogID + " ]";
    }
    
}

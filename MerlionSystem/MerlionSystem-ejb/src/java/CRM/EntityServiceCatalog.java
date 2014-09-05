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
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityServiceCatalog implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long catalogID;
    private String catalogName;
    private String catalogDescription;
    
    @OneToMany
    private Set<AbstractService> service = new HashSet<>();


    public EntityServiceCatalog() {
        this.setCatalogID(System.nanoTime());
    }
    
    public void createServiceCatalog(String catalogName, String catalogDescription) {
        this.catalogName = catalogName;
        this.catalogDescription = catalogDescription;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getCatalogID() {
        return catalogID;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public String getCatalogDescription() {
        return catalogDescription;
    }

    public void setCatalogID(Long catalogID) {
        this.catalogID = catalogID;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public void setCatalogDescription(String catalogDescription) {
        this.catalogDescription = catalogDescription;
    }

    public Set<AbstractService> getService() {
        return service;
    }

    public void setService(Set<AbstractService> service) {
        this.service = service;
    }
    
}

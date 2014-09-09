/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OES;

import CommonInfrastructure.EntityCompany;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityProductCatalog implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long productCatalogID;
    @OneToMany
    private Set<EntityProduct> product = new HashSet<>();
    @ManyToOne
    private EntityCompany company;
    private Boolean canBePurchased;
    private Boolean canBeManufactured;
    private Boolean usedForManufacturing;
    private String productCatalogDescription;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date effectiveDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date endDate;
    
    public EntityProductCatalog() {
        this.setProductCatalogID(System.nanoTime());
    }

    public Long getProductCatalogID() {
        return productCatalogID;
    }

    public void setProductCatalogID(Long productCatalogID) {
        this.productCatalogID = productCatalogID;
    }

    public Set<EntityProduct> getProduct() {
        return product;
    }

    public void setProduct(Set<EntityProduct> product) {
        this.product = product;
    }

    public EntityCompany getCompany() {
        return company;
    }

    public void setCompany(EntityCompany company) {
        this.company = company;
    }

}

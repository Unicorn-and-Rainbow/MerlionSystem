/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OES;

import GRNS.EntityServiceProvider;
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
public class EntityProductCatalog implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long productCatalogID;
    private String productCatalogName;
    private String productCatalogDescription;
    private String productCatalogEffectiveDate;
    private String productCatalogEndDate;
    @OneToMany
    private Set<EntityProduct> product = new HashSet<>();
    @OneToMany
    private Set<EntityServiceProvider> serviceProvider = new HashSet<>();

    public EntityProductCatalog() {
        this.setProductCatalogID(System.nanoTime());
    }

    public void createProductCatalog(String productCatalogName, String productCatalogDescription, String productCatalogEffectiveDate, String productCatalogEndDate) {
        this.productCatalogName = productCatalogName;
        this.productCatalogDescription = productCatalogDescription;
        this.productCatalogEffectiveDate = productCatalogEffectiveDate;
        this.productCatalogEndDate = productCatalogEndDate;
    }

    public Long getProductCatalogID() {
        return productCatalogID;
    }

    public void setProductCatalogID(Long productCatalogID) {
        this.productCatalogID = productCatalogID;
    }

    public String getProductCatalogName() {
        return productCatalogName;
    }

    public void setProductCatalogName(String productCatalogName) {
        this.productCatalogName = productCatalogName;
    }

    public String getProductCatalogDescription() {
        return productCatalogDescription;
    }

    public void setProductCatalogDescription(String productCatalogDescription) {
        this.productCatalogDescription = productCatalogDescription;
    }

    public String getProductCatalogEffectiveDate() {
        return productCatalogEffectiveDate;
    }

    public void setProductCatalogEffectiveDate(String productCatalogEffectiveDate) {
        this.productCatalogEffectiveDate = productCatalogEffectiveDate;
    }

    public String getProductCatalogEndDate() {
        return productCatalogEndDate;
    }

    public void setProductCatalogEndDate(String productCatalogEndDate) {
        this.productCatalogEndDate = productCatalogEndDate;
    }

    public Set<EntityProduct> getProduct() {
        return product;
    }

    public void setProduct(Set<EntityProduct> product) {
        this.product = product;
    }

    public Set<EntityServiceProvider> getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(Set<EntityServiceProvider> serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
    
}

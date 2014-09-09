/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OES;

import CommonInfrastructure.EntityCompany;
import MRPII.EntityBOM;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityProduct implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long productID;
    @ManyToMany(cascade={CascadeType.ALL}, mappedBy="Product")
    private Set<EntityCompany> company = new HashSet<>();
    @OneToOne(mappedBy="product")
    private EntityLineItem lineItem;
    @ManyToOne
    private EntityProductCatalog productCatalog;
    @OneToOne(mappedBy="product")
    private EntityBOM bom;
    @OneToMany(mappedBy="product")
    private Set<EntityInventory> inventory= new HashSet<>();
    
    public EntityProduct() {
        this.setProductID(System.nanoTime());
    }

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public Set<EntityCompany> getCompany() {
        return company;
    }

    public void setCompany(Set<EntityCompany> company) {
        this.company = company;
    }

    public EntityLineItem getLineItem() {
        return lineItem;
    }

    public void setLineItem(EntityLineItem lineItem) {
        this.lineItem = lineItem;
    }

    public EntityProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(EntityProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public EntityBOM getBom() {
        return bom;
    }

    public void setBom(EntityBOM bom) {
        this.bom = bom;
    }

    public Set<EntityInventory> getInventory() {
        return inventory;
    }

    public void setInventory(Set<EntityInventory> inventory) {
        this.inventory = inventory;
    }
    
}

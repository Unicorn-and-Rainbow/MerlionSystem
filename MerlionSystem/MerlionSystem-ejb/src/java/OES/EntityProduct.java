/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OES;

import WMS.EntitySupplier;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityProduct implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productID;
    private String productName;
    private String productType;
    private Integer productUnitToQuantity;
    private Double productUnitToWeight;
    @ManyToMany(cascade={CascadeType.ALL}, mappedBy="Product")
    private Set<EntitySupplier> supplier = new HashSet<>();

    //private Double productPrice;
    public EntityProduct() {
        this.setProductID(System.nanoTime());
    }

    public void createProduct(String productName, String productType, Integer productUnitToQuantity, Double productUnitToWeight) {
        this.productName = productName;
        this.productType = productType;
        this.productUnitToQuantity = productUnitToQuantity;
        this.productUnitToWeight = productUnitToWeight;
    }
    
    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Integer getProductUnitToQuantity() {
        return productUnitToQuantity;
    }

    public void setProductUnitToQuantity(Integer productUnitToQuantity) {
        this.productUnitToQuantity = productUnitToQuantity;
    }

    public Double getProductUnitToWeight() {
        return productUnitToWeight;
    }

    public void setProductUnitToWeight(Double productUnitToWeight) {
        this.productUnitToWeight = productUnitToWeight;
    }

    public Set<EntitySupplier> getSupplier() {
        return supplier;
    }

    public void setSupplier(Set<EntitySupplier> supplier) {
        this.supplier = supplier;
    }
    
}

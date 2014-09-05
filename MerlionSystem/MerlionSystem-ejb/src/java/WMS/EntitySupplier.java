/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package WMS;

import MRPII.EntityMaterial;
import OES.EntityProduct;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntitySupplier implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long supplierID;
    @ManyToMany
    private Set<EntityProduct> product= new HashSet<>();
    @ManyToMany
    private Set<EntityMaterial> material= new HashSet<>();

    public EntitySupplier() {
        this.setSupplierID(System.nanoTime());
    }

    public Long getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(Long supplierID) {
        this.supplierID = supplierID;
    }

    public Set<EntityProduct> getProduct() {
        return product;
    }

    public void setProduct(Set<EntityProduct> product) {
        this.product = product;
    }

    public Set<EntityMaterial> getMaterial() {
        return material;
    }

    public void setMaterial(Set<EntityMaterial> material) {
        this.material = material;
    }

}

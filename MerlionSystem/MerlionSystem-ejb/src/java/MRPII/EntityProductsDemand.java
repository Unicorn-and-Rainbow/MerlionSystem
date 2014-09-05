/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MRPII;

import WMS.EntityInventoryItem;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityProductsDemand implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long productsDemand;
    @OneToOne
    private EntityMaterialDemand materialDemand;
    @OneToOne
    private EntityInventoryItem inventoryItem;
    
    public EntityProductsDemand() {
        this.setProductsDemand(System.nanoTime());
    }

    public Long getProductsDemand() {
        return productsDemand;
    }

    public void setProductsDemand(Long productsDemand) {
        this.productsDemand = productsDemand;
    }

    public EntityMaterialDemand getMaterialDemand() {
        return materialDemand;
    }

    public void setMaterialDemand(EntityMaterialDemand materialDemand) {
        this.materialDemand = materialDemand;
    }

    public EntityInventoryItem getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(EntityInventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }
    
}

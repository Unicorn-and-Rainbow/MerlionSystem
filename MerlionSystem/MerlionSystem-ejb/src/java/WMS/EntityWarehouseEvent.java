/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package WMS;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityWarehouseEvent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long warehouseEventID;
    @OneToMany
    private Set<EntityInventoryItem> inventoryItem = new HashSet<>();
    @OneToOne
    private EntityWarehouseOrder warehouseOrder;
    @OneToOne
    private EntityLocationUnit locationUnit;


    public EntityWarehouseEvent() {
        this.setWarehouseEventID(System.nanoTime());
    }

    public Long getWarehouseEventID() {
        return warehouseEventID;
    }

    public void setWarehouseEventID(Long warehouseEventID) {
        this.warehouseEventID = warehouseEventID;
    }

    public Set<EntityInventoryItem> getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(Set<EntityInventoryItem> inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    public EntityWarehouseOrder getWarehouseOrder() {
        return warehouseOrder;
    }

    public void setWarehouseOrder(EntityWarehouseOrder warehouseOrder) {
        this.warehouseOrder = warehouseOrder;
    }

    public EntityLocationUnit getLocationUnit() {
        return locationUnit;
    }

    public void setLocationUnit(EntityLocationUnit locationUnit) {
        this.locationUnit = locationUnit;
    }

}

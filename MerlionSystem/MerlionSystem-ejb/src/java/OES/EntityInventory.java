/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OES;

import WMS.EntityLocationUnit;
import WMS.EntityWarehouse;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityInventory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private long inventoryID;
    @ManyToOne
    private EntityProduct product;
    @OneToOne
    private EntityWarehouse warehouse;
    @OneToMany(mappedBy = "inventory")
    private Set<EntityLocationUnit> locationUnit = new HashSet<>();

    private String warehouseAddress;

    public EntityInventory() {
        this.setInventoryID(System.nanoTime());
    }

    public long getInventoryID() {
        return inventoryID;
    }

    public void setInventoryID(long inventoryID) {
        this.inventoryID = inventoryID;
    }

    public EntityProduct getProduct() {
        return product;
    }

    public void setProduct(EntityProduct product) {
        this.product = product;
    }

    public EntityWarehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(EntityWarehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Set<EntityLocationUnit> getLocationUnit() {
        return locationUnit;
    }

    public void setLocationUnit(Set<EntityLocationUnit> locationUnit) {
        this.locationUnit = locationUnit;
    }

    public String getWarehouseAddress() {
        return warehouseAddress;
    }

    public void setWarehouseAddress(String warehouseAddress) {
        this.warehouseAddress = warehouseAddress;
    }

}

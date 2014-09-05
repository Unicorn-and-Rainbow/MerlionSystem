/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package WMS;

import OES.EntityOrderItem;
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
public class EntityLocationUnit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long locationUnitID;
    @OneToMany
    private Set<EntityInventoryItem> inventoryItem = new HashSet<>();


    public EntityLocationUnit() {
        this.setLocationUnitID(System.nanoTime());
    }

    public Long getLocationUnitID() {
        return locationUnitID;
    }

    public void setLocationUnitID(Long locationUnitID) {
        this.locationUnitID = locationUnitID;
    }

    public Set<EntityInventoryItem> getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(Set<EntityInventoryItem> inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

}

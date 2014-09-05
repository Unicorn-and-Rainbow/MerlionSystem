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
public class EntityInventoryItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long inventoryItemID;
    @OneToMany
    private Set<EntityAlarm> alarm = new HashSet<>();

    public EntityInventoryItem() {
        this.setInventoryItemID(System.nanoTime());
    }

    public Long getInventoryItemID() {
        return inventoryItemID;
    }

    public void setInventoryItemID(Long inventoryItemID) {
        this.inventoryItemID = inventoryItemID;
    }

    public Set<EntityAlarm> getAlarm() {
        return alarm;
    }

    public void setAlarm(Set<EntityAlarm> alarm) {
        this.alarm = alarm;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package WMS;

import CRM.EntityServiceOrder;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityWarehouseOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long warehouseOrderID;
    @OneToOne
    private EntityWarehouseEvent warehouseEvent;
    @ManyToOne
    private EntityServiceOrder serviceOrder;


    public EntityWarehouseOrder() {
        this.setWarehouseOrderID(System.nanoTime());
    }

    public Long getWarehouseOrderID() {
        return warehouseOrderID;
    }

    public void setWarehouseOrderID(Long warehouseOrderID) {
        this.warehouseOrderID = warehouseOrderID;
    }

    public EntityWarehouseEvent getWarehouseEvent() {
        return warehouseEvent;
    }

    public void setWarehouseEvent(EntityWarehouseEvent warehouseEvent) {
        this.warehouseEvent = warehouseEvent;
    }

}

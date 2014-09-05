/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TMS;

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
public class EntityTransportationOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long transportationOrder;
    @ManyToOne
    private EntityServiceOrder serviceOrder;
    @OneToOne
    private EntityTransportationSchedule transportationSchedule;

    public EntityTransportationOrder() {
        this.setTransportationOrder(System.nanoTime());
    }

    public Long getTransportationOrder() {
        return transportationOrder;
    }

    public void setTransportationOrder(Long transportationOrder) {
        this.transportationOrder = transportationOrder;
    }

    public EntityServiceOrder getServiceOrder() {
        return serviceOrder;
    }

    public void setServiceOrder(EntityServiceOrder serviceOrder) {
        this.serviceOrder = serviceOrder;
    }

    public EntityTransportationSchedule getTransportationSchedule() {
        return transportationSchedule;
    }

    public void setTransportationSchedule(EntityTransportationSchedule transportationSchedule) {
        this.transportationSchedule = transportationSchedule;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TMS;

import CRM.EntityTransportationService;
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
public class EntityTransportationEvent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long transportationEventID;
    @OneToOne
    private EntityTransportationAsset transportationAsset;
    @ManyToOne
    private EntityTransportationService transportationService;

    public EntityTransportationEvent() {
        this.setTransportationEventID(System.nanoTime());
    }

    public Long getTransportationEventID() {
        return transportationEventID;
    }

    public void setTransportationEventID(Long transportationEventID) {
        this.transportationEventID = transportationEventID;
    }

    public EntityTransportationAsset getTransportationAsset() {
        return transportationAsset;
    }

    public void setTransportationAsset(EntityTransportationAsset transportationAsset) {
        this.transportationAsset = transportationAsset;
    }

    public EntityTransportationService getTransportationService() {
        return transportationService;
    }

    public void setTransportationService(EntityTransportationService transportationService) {
        this.transportationService = transportationService;
    }

}

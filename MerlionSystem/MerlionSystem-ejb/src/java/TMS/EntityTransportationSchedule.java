/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TMS;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityTransportationSchedule implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long transportationScheduleID;
    @OneToOne
    private EntityKPI kpi;

    public EntityTransportationSchedule() {
        this.setTransportationScheduleID(System.nanoTime());
    }

    public Long getTransportationScheduleID() {
        return transportationScheduleID;
    }

    public void setTransportationScheduleID(Long transportationScheduleID) {
        this.transportationScheduleID = transportationScheduleID;
    }

    public EntityKPI getKpi() {
        return kpi;
    }

    public void setKpi(EntityKPI kpi) {
        this.kpi = kpi;
    }
    
}

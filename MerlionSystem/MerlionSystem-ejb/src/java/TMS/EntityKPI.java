/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TMS;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityKPI implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long kpiID;

    public EntityKPI() {
        this.setKpiID(System.nanoTime());
    }

    public Long getKpiID() {
        return kpiID;
    }

    public void setKpiID(Long kpiID) {
        this.kpiID = kpiID;
    }

}

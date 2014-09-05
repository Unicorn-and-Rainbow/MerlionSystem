/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package WMS;

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
public class EntityAlarm implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long alarmID;

    public EntityAlarm() {
        this.setAlarmID(System.nanoTime());
    }

    public Long getAlarmID() {
        return alarmID;
    }

    public void setAlarmID(Long alarmID) {
        this.alarmID = alarmID;
    }

}

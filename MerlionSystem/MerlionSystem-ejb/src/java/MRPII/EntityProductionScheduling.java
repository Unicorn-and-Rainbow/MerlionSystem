/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MRPII;

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
public class EntityProductionScheduling implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long productionSchedulingID;

    public EntityProductionScheduling() {
        this.setProductionSchedulingID(System.nanoTime());
    }

    public Long getProductionSchedulingID() {
        return productionSchedulingID;
    }

    public void setProductionSchedulingID(Long productionSchedulingID) {
        this.productionSchedulingID = productionSchedulingID;
    }
    
}

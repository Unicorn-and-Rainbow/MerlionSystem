/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MRPII;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityMaterial implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long materialID;

    public EntityMaterial() {
        this.setMaterialID(System.nanoTime());
    }

    public Long getMaterialID() {
        return materialID;
    }

    public void setMaterialID(Long materialID) {
        this.materialID = materialID;
    }
    
}

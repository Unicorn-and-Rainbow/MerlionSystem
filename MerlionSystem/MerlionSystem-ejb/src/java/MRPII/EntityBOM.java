/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MRPII;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityBOM implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long bOMID;
    @OneToMany
    private Set<EntityMaterial> material = new HashSet<>();
    @ManyToMany
    private Set<EntityMaterialDemand> materialDemand = new HashSet<>();

    public EntityBOM() {
        this.setbOMID(System.nanoTime());
    }

    public Long getbOMID() {
        return bOMID;
    }

    public void setbOMID(Long bOMID) {
        this.bOMID = bOMID;
    }

    public Set<EntityMaterial> getMaterial() {
        return material;
    }

    public void setMaterial(Set<EntityMaterial> material) {
        this.material = material;
    }

    public Set<EntityMaterialDemand> getMaterialDemand() {
        return materialDemand;
    }

    public void setMaterialDemand(Set<EntityMaterialDemand> materialDemand) {
        this.materialDemand = materialDemand;
    }
    
}

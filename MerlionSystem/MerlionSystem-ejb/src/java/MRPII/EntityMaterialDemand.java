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
public class EntityMaterialDemand implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long materialDemandID;
    @ManyToMany(mappedBy="MaterialDemand")
    private Set<EntityBOM> bom = new HashSet<>();
    @OneToMany
    private Set<EntityProductionScheduling> productionScheduling = new HashSet<>();

    public EntityMaterialDemand() {
        this.setMaterialDemandID(System.nanoTime());
    }

    public Long getMaterialDemandID() {
        return materialDemandID;
    }

    public void setMaterialDemandID(Long materialDemandID) {
        this.materialDemandID = materialDemandID;
    }

    public Set<EntityBOM> getBom() {
        return bom;
    }

    public void setBom(Set<EntityBOM> bom) {
        this.bom = bom;
    }

    public Set<EntityProductionScheduling> getProductionScheduling() {
        return productionScheduling;
    }

    public void setProductionScheduling(Set<EntityProductionScheduling> productionScheduling) {
        this.productionScheduling = productionScheduling;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package WMS;

import MRPII.EntityMaterial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityWarehouse implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long warehouseID;
    @OneToMany
    private Set<EntityMaterial> material = new HashSet<>();
    @OneToMany
    private Set<EntityLocationUnit> locationUnit = new HashSet<>();

    public EntityWarehouse() {
        this.setWarehouseID(System.nanoTime());
    }

    public Long getWarehouseID() {
        return warehouseID;
    }

    public void setWarehouseID(Long warehouseID) {
        this.warehouseID = warehouseID;
    }

    public Set<EntityMaterial> getMaterial() {
        return material;
    }

    public void setMaterial(Set<EntityMaterial> material) {
        this.material = material;
    }

    public Set<EntityLocationUnit> getLocationUnit() {
        return locationUnit;
    }

    public void setLocationUnit(Set<EntityLocationUnit> locationUnit) {
        this.locationUnit = locationUnit;
    }

}

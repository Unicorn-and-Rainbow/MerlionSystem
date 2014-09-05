/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package WMS;

import MRPII.EntityMaterial;
import OES.EntityProduct;
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
public class EntityPurchaseRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long purchaseRequestID;
    @OneToMany
    private Set<EntityRFQ> rfq = new HashSet<>();
    @OneToMany
    private Set<EntityMaterial> material = new HashSet<>();
    @OneToMany
    private Set<EntityProduct> product = new HashSet<>();

    public EntityPurchaseRequest() {
        this.setPurchaseRequestID(System.nanoTime());
    }

    public Long getPurchaseRequestID() {
        return purchaseRequestID;
    }

    public void setPurchaseRequestID(Long purchaseRequestID) {
        this.purchaseRequestID = purchaseRequestID;
    }

    public Set<EntityRFQ> getRfq() {
        return rfq;
    }

    public void setRfq(Set<EntityRFQ> rfq) {
        this.rfq = rfq;
    }

    public Set<EntityMaterial> getMaterial() {
        return material;
    }

    public void setMaterial(Set<EntityMaterial> material) {
        this.material = material;
    }

}

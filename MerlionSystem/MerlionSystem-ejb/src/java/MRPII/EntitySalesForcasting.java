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
import javax.persistence.OneToMany;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntitySalesForcasting implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long salesForcastingID;
    @OneToMany
    private Set<EntityProductsDemand> productDemand = new HashSet<>();
    
    public EntitySalesForcasting() {
        this.setSalesForcastingID(System.nanoTime());
    }

    public Long getSalesForcastingID() {
        return salesForcastingID;
    }

    public void setSalesForcastingID(Long salesForcastingID) {
        this.salesForcastingID = salesForcastingID;
    }

    public Set<EntityProductsDemand> getProductDemand() {
        return productDemand;
    }

    public void setProductDemand(Set<EntityProductsDemand> productDemand) {
        this.productDemand = productDemand;
    }

}

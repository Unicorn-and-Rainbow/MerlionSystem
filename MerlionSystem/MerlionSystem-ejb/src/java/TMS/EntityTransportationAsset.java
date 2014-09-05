/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TMS;

import CommonInfrastructure.EntityUser;
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
public class EntityTransportationAsset implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long transportationAsset;
    @OneToMany
    private Set<EntityUser> user = new HashSet<>();

    public EntityTransportationAsset() {
        this.setTransportationAsset(System.nanoTime());
    }

    public Long getTransportationAsset() {
        return transportationAsset;
    }

    public void setTransportationAsset(Long transportationAsset) {
        this.transportationAsset = transportationAsset;
    }

    public Set<EntityUser> getUser() {
        return user;
    }

    public void setUser(Set<EntityUser> user) {
        this.user = user;
    }

}

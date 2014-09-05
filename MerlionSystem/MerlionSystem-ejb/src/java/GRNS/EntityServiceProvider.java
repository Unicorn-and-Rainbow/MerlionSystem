/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GRNS;

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
public class EntityServiceProvider implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long serviceProviderID;

    public EntityServiceProvider() {
        this.setServiceProviderID(System.nanoTime());
    }

    public Long getServiceProviderID() {
        return serviceProviderID;
    }

    public void setServiceProviderID(Long serviceProviderID) {
        this.serviceProviderID = serviceProviderID;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TMS;

import CRM.EntityServiceRequest;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityInternalServiceRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long internalSourceRequestID;
    @OneToOne(mappedBy="internalServiceRequest")
    private EntityServiceRequest serviceRequest;

    public EntityInternalServiceRequest() {
        this.setInternalSourceRequestID(System.nanoTime());
    }

    public Long getInternalSourceRequestID() {
        return internalSourceRequestID;
    }

    public void setInternalSourceRequestID(Long internalSourceRequestID) {
        this.internalSourceRequestID = internalSourceRequestID;
    }

    public EntityServiceRequest getServiceRequest() {
        return serviceRequest;
    }

    public void setServiceRequest(EntityServiceRequest serviceRequest) {
        this.serviceRequest = serviceRequest;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRM;

import TMS.EntityInternalServiceRequest;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityServiceRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long ServiceRequestID;
    @OneToOne
    private EntityInternalServiceRequest internalServiceRequest;
    
    public Long getServiceRequestID() {
        return ServiceRequestID;
    }

    public void setServiceRequestID(Long ServiceRequestID) {
        this.ServiceRequestID = ServiceRequestID;
    }

    public EntityInternalServiceRequest getInternalServiceRequest() {
        return internalServiceRequest;
    }

    public void setInternalServiceRequest(EntityInternalServiceRequest internalServiceRequest) {
        this.internalServiceRequest = internalServiceRequest;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GRNS;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityServiceAgreement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long serviceAgreementID;

    public EntityServiceAgreement() {
        this.setServiceAgreementID(System.nanoTime());
    }

    public Long getServiceAgreementID() {
        return serviceAgreementID;
    }

    public void setServiceAgreementID(Long serviceAgreementID) {
        this.serviceAgreementID = serviceAgreementID;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GRNS;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityBidding implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long biddingID;
    @OneToOne
    private EntityServiceAgreement serviceAgreement;

    public EntityBidding() {
        this.setBiddingID(System.nanoTime());
    }

    public Long getBiddingID() {
        return biddingID;
    }

    public void setBiddingID(Long biddingID) {
        this.biddingID = biddingID;
    }

    public EntityServiceAgreement getServiceAgreement() {
        return serviceAgreement;
    }

    public void setServiceAgreement(EntityServiceAgreement serviceAgreement) {
        this.serviceAgreement = serviceAgreement;
    }

}

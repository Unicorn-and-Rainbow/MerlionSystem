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
public class EntityAggregatedRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long aggregatedRequestID;
    @OneToOne
    private EntityBidding bidding;


    public EntityAggregatedRequest() {
        this.setAggregatedRequestID(System.nanoTime());
    }

    public Long getAggregatedRequestID() {
        return aggregatedRequestID;
    }

    public void setAggregatedRequestID(Long aggregatedRequestID) {
        this.aggregatedRequestID = aggregatedRequestID;
    }

    public EntityBidding getBidding() {
        return bidding;
    }

    public void setBidding(EntityBidding bidding) {
        this.bidding = bidding;
    }

}

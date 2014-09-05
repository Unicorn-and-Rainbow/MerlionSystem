/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package WMS;

import OES.EntitySalesQuotation;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityRFQ implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long rFQID;
    @OneToOne
    private EntitySalesQuotation salesQuotation;


    public EntityRFQ() {
        this.setrFQID(System.nanoTime());
    }

    public Long getrFQID() {
        return rFQID;
    }

    public void setrFQID(Long rFQID) {
        this.rFQID = rFQID;
    }

    public EntitySalesQuotation getSalesquotation() {
        return salesQuotation;
    }

    public void setSalesquotation(EntitySalesQuotation salesquotation) {
        this.salesQuotation = salesquotation;
    }

}

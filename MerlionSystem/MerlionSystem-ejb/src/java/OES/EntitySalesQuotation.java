/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OES;

import CommonInfrastructure.EntityCompany;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntitySalesQuotation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long salesQuotationID;
    @OneToOne(mappedBy = "salesQuotation")
    private EntityRFQ rfq;
    @OneToOne(mappedBy = "salesQuotation")
    private EntityPurchaseOrder purchaseOrder;
    @ManyToMany(mappedBy = "salesQuotation")
    private Set<EntityCompany> company = new HashSet<>();
    @OneToMany(mappedBy="salesQuotation")
    private Set<EntityLineItem> lineItem = new HashSet<>();

    public EntitySalesQuotation() {
        this.setSalesQuotationID(System.nanoTime());
    }

    
    public Long getSalesQuotationID() {
        return salesQuotationID;
    }

    public void setSalesQuotationID(Long salesQuotationID) {
        this.salesQuotationID = salesQuotationID;
    }

    public EntityRFQ getRfq() {
        return rfq;
    }

    public void setRfq(EntityRFQ rfq) {
        this.rfq = rfq;
    }

    public EntityPurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(EntityPurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public Set<EntityCompany> getCompany() {
        return company;
    }

    public void setCompany(Set<EntityCompany> company) {
        this.company = company;
    }

    public Set<EntityLineItem> getLineItem() {
        return lineItem;
    }

    public void setLineItem(Set<EntityLineItem> lineItem) {
        this.lineItem = lineItem;
    }

    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OES;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityLineItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private long lineItemID;
    @OneToOne(mappedBy="lineItem")
    private EntityRFQ rfq;
    @ManyToOne
    private EntitySalesOrder salesOrder;
    @ManyToOne
    private EntityPurchaseOrder purchaseOrder;
    @ManyToOne
    private EntitySalesQuotation salesQuotation;
    @OneToOne
    private EntityProduct product;
    @OneToMany(mappedBy="lineItem")
    private Set<EntityTransportationServiceEntry> transportationServiceEntry = new HashSet<>();
    @OneToMany(mappedBy="lineItem")
    private Set<EntityWarehouseServiceEntry> warehouseServiceEntry = new HashSet<>();
    @ManyToOne
    private EntityBackOrder backOrder;
    
    
    
    
    public EntityLineItem() {
        this.setLineItemID(System.nanoTime());
    }

    public long getLineItemID() {
        return lineItemID;
    }

    public void setLineItemID(long lineItemID) {
        this.lineItemID = lineItemID;
    }

    public EntityRFQ getRfq() {
        return rfq;
    }

    public void setRfq(EntityRFQ rfq) {
        this.rfq = rfq;
    }

    public EntitySalesOrder getSalesOrder() {
        return salesOrder;
    }

    public void setSalesOrder(EntitySalesOrder salesOrder) {
        this.salesOrder = salesOrder;
    }

    public EntityPurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(EntityPurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public EntitySalesQuotation getSalesQuotation() {
        return salesQuotation;
    }

    public void setSalesQuotation(EntitySalesQuotation salesQuotation) {
        this.salesQuotation = salesQuotation;
    }

    public EntityProduct getProduct() {
        return product;
    }

    public void setProduct(EntityProduct product) {
        this.product = product;
    }

    public Set<EntityTransportationServiceEntry> getTransportationServiceEntry() {
        return transportationServiceEntry;
    }

    public void setTransportationServiceEntry(Set<EntityTransportationServiceEntry> transportationServiceEntry) {
        this.transportationServiceEntry = transportationServiceEntry;
    }

    public Set<EntityWarehouseServiceEntry> getWarehouseServiceEntry() {
        return warehouseServiceEntry;
    }

    public void setWarehouseServiceEntry(Set<EntityWarehouseServiceEntry> warehouseServiceEntry) {
        this.warehouseServiceEntry = warehouseServiceEntry;
    }

    public EntityBackOrder getBackOrder() {
        return backOrder;
    }

    public void setBackOrder(EntityBackOrder backOrder) {
        this.backOrder = backOrder;
    }
    
}

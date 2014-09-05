/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package WMS;

import OES.EntityProduct;
import OES.EntitySalesOrder;
import OES.EntitySalesQuotation;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityPurchaseOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long purchaseOrderID;
    @OneToOne(mappedBy="PurchaseOrder")
    private EntitySalesOrder salesOrder;
    @OneToOne
    private EntitySalesQuotation salesQuotation;
    @OneToOne
    private EntityPurchaseRequest purchaseRequest;
    @OneToOne
    private EntityProduct product;
    @ManyToOne
    private EntitySupplier supplier;


    public EntityPurchaseOrder() {
        this.setPurchaseOrderID(System.nanoTime());
    }

    public Long getPurchaseOrderID() {
        return purchaseOrderID;
    }

    public void setPurchaseOrderID(Long purchaseOrderID) {
        this.purchaseOrderID = purchaseOrderID;
    }

    public EntitySalesOrder getSalesOrder() {
        return salesOrder;
    }

    public void setSalesOrder(EntitySalesOrder salesOrder) {
        this.salesOrder = salesOrder;
    }

    public EntitySalesQuotation getSalesQuotation() {
        return salesQuotation;
    }

    public void setSalesQuotation(EntitySalesQuotation salesQuotation) {
        this.salesQuotation = salesQuotation;
    }

    public EntityPurchaseRequest getPurchaseRequest() {
        return purchaseRequest;
    }

    public void setPurchaseRequest(EntityPurchaseRequest purchaseRequest) {
        this.purchaseRequest = purchaseRequest;
    }

    public EntityProduct getProduct() {
        return product;
    }

    public void setProduct(EntityProduct product) {
        this.product = product;
    }

    public EntitySupplier getSupplier() {
        return supplier;
    }

    public void setSupplier(EntitySupplier supplier) {
        this.supplier = supplier;
    }
    
}

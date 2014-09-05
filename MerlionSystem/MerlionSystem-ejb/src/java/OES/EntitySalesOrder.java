/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OES;

import MRPII.EntitySalesForcasting;
import WMS.EntityPurchaseOrder;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntitySalesOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long salesOrderID;
    //private Long poNumber; (???)
    //private Date poDate; (???)
    private String salesOrderShippingTerm;
    private String salesOrderShippingPriorityOption;
    private String salesOrderStatus;
    @OneToOne
    private EntitySalesQuotation salesQuotation;
    @OneToMany
    private Set<EntityOrderItem> orderItem = new HashSet<>();
    @OneToMany
    private Set<EntityBackOrder> backOrder = new HashSet<>();
    @OneToOne
    private EntityReceipt productReceipt;
    @OneToOne
    private EntityProductInvoice productInvoice;
    @OneToOne
    private EntityPurchaseOrder purchaseOrder;
    @OneToMany
    private Set<EntitySalesForcasting> salesForcasting = new HashSet<>();

    public EntitySalesOrder() {
        this.setSalesOrderID(System.nanoTime());
    }

    public void createSalesOrder(String salesOrderShippingTerm, String salesOrderShippingPriorityOption, String salesOrderStatus) {
        this.salesOrderShippingTerm = salesOrderShippingTerm;
        this.salesOrderShippingPriorityOption = salesOrderShippingPriorityOption;
        this.salesOrderStatus = salesOrderStatus;
    }

    public Long getSalesOrderID() {
        return salesOrderID;
    }

    public void setSalesOrderID(Long salesOrderID) {
        this.salesOrderID = salesOrderID;
    }

    public String getSalesOrderShippingTerm() {
        return salesOrderShippingTerm;
    }

    public void setSalesOrderShippingTerm(String salesOrderShippingTerm) {
        this.salesOrderShippingTerm = salesOrderShippingTerm;
    }

    public String getSalesOrderShippingPriorityOption() {
        return salesOrderShippingPriorityOption;
    }

    public void setSalesOrderShippingPriorityOption(String salesOrderShippingPriorityOption) {
        this.salesOrderShippingPriorityOption = salesOrderShippingPriorityOption;
    }

    public String getSalesOrderStatus() {
        return salesOrderStatus;
    }

    public void setSalesOrderStatus(String salesOrderStatus) {
        this.salesOrderStatus = salesOrderStatus;
    }

    public EntitySalesQuotation getSalesQuotation() {
        return salesQuotation;
    }

    public void setSalesQuotation(EntitySalesQuotation salesQuotation) {
        this.salesQuotation = salesQuotation;
    }

    public Set<EntityOrderItem> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(Set<EntityOrderItem> orderItem) {
        this.orderItem = orderItem;
    }

    public Set<EntityBackOrder> getBackOrder() {
        return backOrder;
    }

    public void setBackOrder(Set<EntityBackOrder> backOrder) {
        this.backOrder = backOrder;
    }

    public EntityReceipt getProductReceipt() {
        return productReceipt;
    }

    public void setProductReceipt(EntityReceipt productReceipt) {
        this.productReceipt = productReceipt;
    }

    public EntityProductInvoice getProductInvoice() {
        return productInvoice;
    }

    public void setProductInvoice(EntityProductInvoice productInvoice) {
        this.productInvoice = productInvoice;
    }

    public EntityPurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(EntityPurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public Set<EntitySalesForcasting> getSalesForcasting() {
        return salesForcasting;
    }

    public void setSalesForcasting(Set<EntitySalesForcasting> salesForcasting) {
        this.salesForcasting = salesForcasting;
    }

    

}

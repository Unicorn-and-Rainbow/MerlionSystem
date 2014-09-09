/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OES;

import CommonInfrastructure.EntityCompany;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntitySalesOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long salesOrderID;
    @ManyToMany(mappedBy="salesOrder")
    private Set<EntityCompany> company= new HashSet<>();
    @OneToMany(mappedBy="salesOrder")
    private Set<EntityLineItem> lineItem = new HashSet<>();
    @OneToOne
    private EntityPurchaseOrder purchaseOrder;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date salesOrderDate;
    private long purchasePartyID;
    private String purchasePartyName;
    private String billingAddress;
    private String shippingTerm;
    private String paymentTerm;
    private String shippingPriorityOption;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date requestedDeliveryDate;
    private double grandTotal;
    private String salesOrderStatus;

    public EntitySalesOrder() {
        this.setSalesOrderID(System.nanoTime());
    }
    
    public void createEntitySalesOrder() {
        
    }
    public Long getSalesOrderID() {
        return salesOrderID;
    }

    public void setSalesOrderID(Long salesOrderID) {
        this.salesOrderID = salesOrderID;
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

    public EntityPurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(EntityPurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public Date getSalesOrderDate() {
        return salesOrderDate;
    }

    public void setSalesOrderDate(Date salesOrderDate) {
        this.salesOrderDate = salesOrderDate;
    }

    public long getPurchasePartyID() {
        return purchasePartyID;
    }

    public void setPurchasePartyID(long purchasePartyID) {
        this.purchasePartyID = purchasePartyID;
    }

    public String getPurchasePartyName() {
        return purchasePartyName;
    }

    public void setPurchasePartyName(String purchasePartyName) {
        this.purchasePartyName = purchasePartyName;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getShippingTerm() {
        return shippingTerm;
    }

    public void setShippingTerm(String shippingTerm) {
        this.shippingTerm = shippingTerm;
    }

    public String getPaymentTerm() {
        return paymentTerm;
    }

    public void setPaymentTerm(String paymentTerm) {
        this.paymentTerm = paymentTerm;
    }

    public String getShippingPriorityOption() {
        return shippingPriorityOption;
    }

    public void setShippingPriorityOption(String shippingPriorityOption) {
        this.shippingPriorityOption = shippingPriorityOption;
    }

    public Date getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    public void setRequestedDeliveryDate(Date requestedDeliveryDate) {
        this.requestedDeliveryDate = requestedDeliveryDate;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getSalesOrderStatus() {
        return salesOrderStatus;
    }

    public void setSalesOrderStatus(String salesOrderStatus) {
        this.salesOrderStatus = salesOrderStatus;
    }

}

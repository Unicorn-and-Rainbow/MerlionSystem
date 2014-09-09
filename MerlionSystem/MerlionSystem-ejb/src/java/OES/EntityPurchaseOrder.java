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
public class EntityPurchaseOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long purchaseOrderID;
    @OneToOne(mappedBy="PurchaseOrder")
    private EntitySalesOrder salesOrder;
    @OneToOne
    private EntitySalesQuotation salesQuotation;
    @OneToOne
    private EntityProductInvoice productInvoice;
    @OneToMany(mappedBy="purchaseOrder")
    private Set<EntityLineItem> lineItem = new HashSet<>();
    @ManyToMany(mappedBy="purchaseOrder")
    private Set<EntityCompany> company = new HashSet<>();

    
    private long purchaseOrder;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date purchaseOrderDate;
    private long purchasePartyID;
    private String purchasePartyName;
    private long salesPartyID;
    private String salesPartyName;
    private String billingAddress;
    private String shippingTerm;
    private String paymentTerm;
    private String shippingPriorityOption;
    private double grandTotal;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date requestedDeliveryDate;
    private String purchaseOrderStatus;

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

    public Set<EntityLineItem> getLineItem() {
        return lineItem;
    }

    public void setLineItem(Set<EntityLineItem> lineItem) {
        this.lineItem = lineItem;
    }

    public Set<EntityCompany> getCompany() {
        return company;
    }

    public void setCompany(Set<EntityCompany> company) {
        this.company = company;
    }

    public EntityProductInvoice getProductInvoice() {
        return productInvoice;
    }

    public void setProductInvoice(EntityProductInvoice productInvoice) {
        this.productInvoice = productInvoice;
    }

    public long getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(long purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public Date getPurchaseOrderDate() {
        return purchaseOrderDate;
    }

    public void setPurchaseOrderDate(Date purchaseOrderDate) {
        this.purchaseOrderDate = purchaseOrderDate;
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

    public long getSalesPartyID() {
        return salesPartyID;
    }

    public void setSalesPartyID(long salesPartyID) {
        this.salesPartyID = salesPartyID;
    }

    public String getSalesPartyName() {
        return salesPartyName;
    }

    public void setSalesPartyName(String salesPartyName) {
        this.salesPartyName = salesPartyName;
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

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public Date getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    public void setRequestedDeliveryDate(Date requestedDeliveryDate) {
        this.requestedDeliveryDate = requestedDeliveryDate;
    }

    public String getPurchaseOrderStatus() {
        return purchaseOrderStatus;
    }

    public void setPurchaseOrderStatus(String purchaseOrderStatus) {
        this.purchaseOrderStatus = purchaseOrderStatus;
    }

}

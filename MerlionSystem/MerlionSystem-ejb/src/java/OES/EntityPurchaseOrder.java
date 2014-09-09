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
    private String soldToParty;
    private String paymentTerm;
    private String shippingTerm;
    private String shippingPriorityOption;
    private String billingAddress;
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
	public String getSoldToParty() {
		return soldToParty;
	}
	public void setSoldToParty(String soldToParty) {
		this.soldToParty = soldToParty;
	}
	public String getPaymentTerm() {
		return paymentTerm;
	}
	public void setPaymentTerm(String paymentTerm) {
		this.paymentTerm = paymentTerm;
	}
	public String getShippingTerm() {
		return shippingTerm;
	}
	public void setShippingTerm(String shippingTerm) {
		this.shippingTerm = shippingTerm;
	}
	public String getShippingPriorityOption() {
		return shippingPriorityOption;
	}
	public void setShippingPriorityOption(String shippingPriorityOption) {
		this.shippingPriorityOption = shippingPriorityOption;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
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

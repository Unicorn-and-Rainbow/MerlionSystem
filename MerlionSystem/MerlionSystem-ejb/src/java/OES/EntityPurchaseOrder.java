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
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date requestedDeliveryDate;
    private double grandTotal;
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

}

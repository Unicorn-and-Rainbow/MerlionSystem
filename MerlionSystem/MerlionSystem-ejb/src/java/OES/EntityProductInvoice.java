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
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityProductInvoice implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long invoiceID;
    @ManyToMany(mappedBy="productInvoice")
    private Set<EntityCompany> company = new HashSet<>();
    @OneToOne(mappedBy="productInvoice")
    private EntityPurchaseOrder purchaseOrder;
    @OneToOne
    private EntityPaymentReceipt paymentReceipt;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date invoiceIssueDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date invoiceDueDate;
    private String billingAddress;
    private double grandTotal;
    private String invoiceStatus;

    public EntityProductInvoice() {
        this.setInvoiceID(System.nanoTime());
    }

    
    public Long getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(Long invoiceID) {
        this.invoiceID = invoiceID;
    }

    public Set<EntityCompany> getCompany() {
        return company;
    }

    public void setCompany(Set<EntityCompany> company) {
        this.company = company;
    }

    public EntityPurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(EntityPurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public EntityPaymentReceipt getPaymentReceipt() {
        return paymentReceipt;
    }

    public void setPaymentReceipt(EntityPaymentReceipt paymentReceipt) {
        this.paymentReceipt = paymentReceipt;
    }

}

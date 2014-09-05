/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OES;

import WMS.EntityRFQ;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntitySalesQuotation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long salesQuotationID;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date salesQuotationIssueDate;
    private Double salesQuotationGrandTotal;
    @OneToOne(mappedBy = "salesQuotation")
    private EntitySalesOrder salesOrder;
    @OneToOne(mappedBy = "salesQuotation")
    private EntityRFQ rfq;

    public EntitySalesQuotation() {
        this.salesOrder = new EntitySalesOrder();
    }

    public void createSalesQuotation(Date salesQuotationIssueDate, Double salesQuotationGrandTotal) {
        this.salesQuotationIssueDate = salesQuotationIssueDate;
        this.salesQuotationGrandTotal = salesQuotationGrandTotal;
    }
    
    public Long getSalesQuotationID() {
        return salesQuotationID;
    }

    public void setSalesQuotationID(Long salesQuotationID) {
        this.salesQuotationID = salesQuotationID;
    }

    public Date getSalesQuotationIssueDate() {
        return salesQuotationIssueDate;
    }

    public void setSalesQuotationIssueDate(Date salesQuotationIssueDate) {
        this.salesQuotationIssueDate = salesQuotationIssueDate;
    }

    public Double getSalesQuotationGrandTotal() {
        return salesQuotationGrandTotal;
    }

    public void setSalesQuotationGrandTotal(Double salesQuotationGrandTotal) {
        this.salesQuotationGrandTotal = salesQuotationGrandTotal;
    }

    public EntitySalesOrder getSalesOrder() {
        return salesOrder;
    }

    public void setSalesOrder(EntitySalesOrder salesOrder) {
        this.salesOrder = salesOrder;
    }

    public EntityRFQ getRfq() {
        return rfq;
    }

    public void setRfq(EntityRFQ rfq) {
        this.rfq = rfq;
    }

    

}

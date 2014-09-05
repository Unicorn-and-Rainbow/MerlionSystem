/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OES;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
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
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date invoiceDueDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date invoiceIssueDate;
    private Double invoiceGrandTotal;
    private String invoiceStatus;

    public EntityProductInvoice() {
        this.setInvoiceID(System.nanoTime());
    }

    public void createInvoice(Date invoiceDueDate, Date invoiceIssueDate, Double invoiceGrandTotal, String invoiceStatus) {
        this.invoiceDueDate = invoiceDueDate;
        this.invoiceIssueDate = invoiceIssueDate;
        this.invoiceGrandTotal = invoiceGrandTotal;
        this.invoiceStatus = invoiceStatus;
    }
    
    public Long getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(Long invoiceID) {
        this.invoiceID = invoiceID;
    }

    public Date getInvoiceDueDate() {
        return invoiceDueDate;
    }

    public void setInvoiceDueDate(Date invoiceDueDate) {
        this.invoiceDueDate = invoiceDueDate;
    }

    public Date getInvoiceIssueDate() {
        return invoiceIssueDate;
    }

    public void setInvoiceIssueDate(Date invoiceIssueDate) {
        this.invoiceIssueDate = invoiceIssueDate;
    }

    public Double getInvoiceGrandTotal() {
        return invoiceGrandTotal;
    }

    public void setInvoiceGrandTotal(Double invoiceGrandTotal) {
        this.invoiceGrandTotal = invoiceGrandTotal;
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

}

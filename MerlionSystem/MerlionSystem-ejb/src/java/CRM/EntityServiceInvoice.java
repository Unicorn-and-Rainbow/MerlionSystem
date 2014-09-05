/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRM;

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
public class EntityServiceInvoice implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long invoiceID;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date invoiceIssueDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date invoiceDueDate;
    private String invoiceStatus;
    private Double invoiceGrandTotal;

    public EntityServiceInvoice() {
        this.setInvoiceID(System.nanoTime());
    }

    public void createInvoice(Date invoiceDate, Date invoiceDueDate, String invoiceStatus, Double invoiceGrandTotal) {
        this.invoiceIssueDate = invoiceDate;
        this.invoiceStatus = invoiceStatus;
        this.invoiceGrandTotal = invoiceGrandTotal;
        this.invoiceDueDate = invoiceDueDate;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getInvoiceID() {
        return invoiceID;
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceID(Long invoiceID) {
        this.invoiceID = invoiceID;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public Date getInvoiceIssueDate() {
        return invoiceIssueDate;
    }

    public void setInvoiceIssueDate(Date invoiceIssueDate) {
        this.invoiceIssueDate = invoiceIssueDate;
    }

    public Date getInvoiceDueDate() {
        return invoiceDueDate;
    }

    public void setInvoiceDueDate(Date invoiceDueDate) {
        this.invoiceDueDate = invoiceDueDate;
    }

    public Double getInvoiceGrandTotal() {
        return invoiceGrandTotal;
    }

    public void setInvoiceGrandTotal(Double invoiceGrandTotal) {
        this.invoiceGrandTotal = invoiceGrandTotal;
    }
    
}

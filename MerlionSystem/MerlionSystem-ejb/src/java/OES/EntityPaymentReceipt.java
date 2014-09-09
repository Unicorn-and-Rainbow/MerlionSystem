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
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityPaymentReceipt implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long receiptID;
    @OneToOne(mappedBy="paymentReceipt")
    private EntityProductInvoice productInvoice;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date paymentDate;
    private double grandTotal;
    

    public EntityPaymentReceipt() {
        this.setReceiptID(System.nanoTime());
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getReceiptID() {
        return receiptID;
    }

    public void setReceiptID(Long receiptID) {
        this.receiptID = receiptID;
    }

    public EntityProductInvoice getProductInvoice() {
        return productInvoice;
    }

    public void setProductInvoice(EntityProductInvoice productInvoice) {
        this.productInvoice = productInvoice;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

}

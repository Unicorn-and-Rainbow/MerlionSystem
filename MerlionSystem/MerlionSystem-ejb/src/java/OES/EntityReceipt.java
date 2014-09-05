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
public class EntityReceipt implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long receiptID;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date receiptDate;
    private Double receiptGrandTotal;

    public EntityReceipt() {
        this.setReceiptID(System.nanoTime());
    }

    public void createReceipt(Date receiptDate, Double receiptGrandTotal) {
        this.receiptDate = receiptDate;
        this.receiptGrandTotal = receiptGrandTotal;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getReceiptID() {
        return receiptID;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptID(Long receiptID) {
        this.receiptID = receiptID;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public Double getReceiptGrandTotal() {
        return receiptGrandTotal;
    }

    public void setReceiptGrandTotal(Double receiptGrandTotal) {
        this.receiptGrandTotal = receiptGrandTotal;
    }

}

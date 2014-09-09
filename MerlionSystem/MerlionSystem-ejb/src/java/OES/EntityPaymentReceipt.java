/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OES;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

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

}

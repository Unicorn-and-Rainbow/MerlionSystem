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
public class EntityBackOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long backOrderID;    
    private Long backOrderProductID;
    private Integer backOrderQuantity;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date backOrderIssueDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date backOrderRequestedDeliveryDate;
    private String backOrderStatus;

    public EntityBackOrder() {
        this.setBackOrderID(System.nanoTime());
    }

    public void createBackOrder(Long backOrderProductID, Integer backOrderQuantity, Date backOrderIssueDate, Date backOrderRequestedDeliveryDate, String backOrderStatus) {
        this.backOrderProductID = backOrderProductID;
        this.backOrderQuantity = backOrderQuantity;
        this.backOrderIssueDate = backOrderIssueDate;
        this.backOrderRequestedDeliveryDate = backOrderRequestedDeliveryDate;
        this.backOrderStatus = backOrderStatus;
    }

    public Long getBackOrderID() {
        return backOrderID;
    }

    public void setBackOrderID(Long backOrderID) {
        this.backOrderID = backOrderID;
    }

    public Long getBackOrderProductID() {
        return backOrderProductID;
    }

    public void setBackOrderProductID(Long backOrderProductID) {
        this.backOrderProductID = backOrderProductID;
    }

    public Integer getBackOrderQuantity() {
        return backOrderQuantity;
    }

    public void setBackOrderQuantity(Integer backOrderQuantity) {
        this.backOrderQuantity = backOrderQuantity;
    }

    public Date getBackOrderIssueDate() {
        return backOrderIssueDate;
    }

    public void setBackOrderIssueDate(Date backOrderIssueDate) {
        this.backOrderIssueDate = backOrderIssueDate;
    }

    public Date getBackOrderRequestedDeliveryDate() {
        return backOrderRequestedDeliveryDate;
    }

    public void setBackOrderRequestedDeliveryDate(Date backOrderRequestedDeliveryDate) {
        this.backOrderRequestedDeliveryDate = backOrderRequestedDeliveryDate;
    }

    public String getBackOrderStatus() {
        return backOrderStatus;
    }

    public void setBackOrderStatus(String backOrderStatus) {
        this.backOrderStatus = backOrderStatus;
    }
    
}

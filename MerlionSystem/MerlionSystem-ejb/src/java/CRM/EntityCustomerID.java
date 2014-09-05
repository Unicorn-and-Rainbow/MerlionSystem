/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRM;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityCustomerID implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long customerID;

    public EntityCustomerID() {
        this.setCustomerID(System.nanoTime());
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

}

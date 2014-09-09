/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRM;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author yuna
 */
@Entity
public class EntityWarehouseServiceEntry extends AbstractServiceEntry {
    private String serviceLocation;

    public EntityWarehouseServiceEntry() {
    }

    public EntityWarehouseServiceEntry(Long serviceEntryID, Long serviceEntryCreatorHR, String serviceType, Date serviceStartDate, Date serviceEndDate, double serviceProductSize, double serviceProductWeight, double serviceProductQty, double serviceCost, double servicePrice ,String serviceLocation) {
        this.setServiceEntryID(serviceEntryID);
        this.setServiceEntryCreatorHR(serviceEntryCreatorHR);
        this.setServiceType(serviceType);
        this.setServiceStartDate(serviceStartDate);
        this.setServiceEndDate(serviceEndDate);
        this.setServiceProductSize(serviceProductSize);
        this.setServiceProductWeight(serviceProductWeight);
        this.setServiceProductQty(serviceProductQty);
        this.setServiceCost(serviceCost);
        this.setServicePrice(servicePrice);
        this.serviceLocation = serviceLocation;
    }

    public String getServiceLocation() {
        return serviceLocation;
    }

    public void setServiceLocation(String serviceLocation) {
        this.serviceLocation = serviceLocation;
    }
    
    
    
}

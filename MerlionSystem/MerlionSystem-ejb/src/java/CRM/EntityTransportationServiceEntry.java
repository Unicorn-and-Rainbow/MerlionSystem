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
public class EntityTransportationServiceEntry extends AbstractServiceEntry {
    private String serviceOrrigin;
    private String serviceDestination;

    public EntityTransportationServiceEntry() {
    }

    public EntityTransportationServiceEntry(Long serviceEntryID, Long serviceEntryCreatorHR, String serviceType, Date serviceStartDate, Date serviceEndDate, double serviceProductSize, double serviceProductWeight, double serviceProductQty, double serviceCost, double servicePrice, String serviceOrrigin, String serviceDestination) {
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
        this.serviceOrrigin = serviceOrrigin;
        this.serviceDestination = serviceDestination;
    }

    public String getServiceOrrigin() {
        return serviceOrrigin;
    }

    public void setServiceOrrigin(String serviceOrrigin) {
        this.serviceOrrigin = serviceOrrigin;
    }

    public String getServiceDestination() {
        return serviceDestination;
    }

    public void setServiceDestination(String serviceDestination) {
        this.serviceDestination = serviceDestination;
    }
    
    
    
}

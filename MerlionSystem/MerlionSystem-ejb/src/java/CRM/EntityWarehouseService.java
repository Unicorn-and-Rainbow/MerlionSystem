/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRM;

import javax.persistence.Entity;

@Entity
public class EntityWarehouseService extends AbstractService {
    private String warehouseServiceLocation;
    private String warehouseServiceUnit;
    
    
    public EntityWarehouseService() {
        this.setServiceID(System.nanoTime());
    }

    public void createWarehouseService(String serviceName, String serviceDescription, 
            String serviceType, String warehouseServiceLocation, 
            String warehouseServiceUnit) {
        this.setServiceName(serviceName);
        this.setServiceDescription(serviceDescription);
        this.setServiceType(serviceType);
        this.warehouseServiceLocation = warehouseServiceLocation;
        this.warehouseServiceUnit = warehouseServiceUnit;
    }

    public String getWarehouseServiceLocation() {
        return warehouseServiceLocation;
    }

    public String getWarehouseServiceUnit() {
        return warehouseServiceUnit;
    }

    public void setWarehouseServiceLocation(String warehouseServiceLocation) {
        this.warehouseServiceLocation = warehouseServiceLocation;
    }

    public void setWarehouseServiceUnit(String warehouseServiceUnit) {
        this.warehouseServiceUnit = warehouseServiceUnit;
    }
    
}

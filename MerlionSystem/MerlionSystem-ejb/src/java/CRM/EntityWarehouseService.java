/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRM;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author yuna
 */
@Entity
public class EntityWarehouseService extends AbstractService {
    private String serviceLocation;
    private double serviceMinUnit;
    private double serviceMaxUnit;
    private double servicePerUnitPerDayCost;
    private double servicePerUnitPerDayPrice;

    public EntityWarehouseService() {
    }

    public EntityWarehouseService(Long serviceID, String serviceName, String serviceType, String serviceDescription, String serviceRemark,String serviceLocation, double serviceMinUnit, double serviceMaxUnit, double servicePerUnitPerDayCost, double servicePerUnitPerDayPrice) {
        this.setServiceID (serviceID);
        this.setServiceName (serviceName);
        this.setServiceType (serviceType);
        this.setServiceDescription (serviceDescription);
        this.setServiceRemark (serviceRemark);
        this.serviceLocation = serviceLocation;
        this.serviceMinUnit = serviceMinUnit;
        this.serviceMaxUnit = serviceMaxUnit;
        this.servicePerUnitPerDayCost = servicePerUnitPerDayCost;
        this.servicePerUnitPerDayPrice = servicePerUnitPerDayPrice;
    }

    public String getServiceLocation() {
        return serviceLocation;
    }

    public void setServiceLocation(String serviceLocation) {
        this.serviceLocation = serviceLocation;
    }

    public double getServiceMinUnit() {
        return serviceMinUnit;
    }

    public void setServiceMinUnit(double serviceMinUnit) {
        this.serviceMinUnit = serviceMinUnit;
    }

    public double getServiceMaxUnit() {
        return serviceMaxUnit;
    }

    public void setServiceMaxUnit(double serviceMaxUnit) {
        this.serviceMaxUnit = serviceMaxUnit;
    }

    public double getServicePerUnitPerDayCost() {
        return servicePerUnitPerDayCost;
    }

    public void setServicePerUnitPerDayCost(double servicePerUnitPerDayCost) {
        this.servicePerUnitPerDayCost = servicePerUnitPerDayCost;
    }

    public double getServicePerUnitPerDayPrice() {
        return servicePerUnitPerDayPrice;
    }

    public void setServicePerUnitPerDayPrice(double servicePerUnitPerDayPrice) {
        this.servicePerUnitPerDayPrice = servicePerUnitPerDayPrice;
    }
        
}

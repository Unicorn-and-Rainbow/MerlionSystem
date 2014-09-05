/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRM;

import TMS.EntityTransportationEvent;
import java.sql.Time;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class EntityTransportService extends AbstractService  {
    private String transportServiceStartPoint;
    private String transportServiceEndPoint;
    private Time transportServiceStartTime;
    private Time transportServiceEndTime;
    private double transportServiceDistance;
    private double transportServiceCost;
    @OneToMany(mappedBy="transportationService")
    private Set<EntityTransportationEvent> transportationEvent = new HashSet<>();

    public EntityTransportService() {
        this.setServiceID(System.nanoTime());
    }

    public EntityTransportService(String serviceName, String serviceDescription, 
            String serviceType, String transportServiceStartPoint, 
            String transportServiceEndPoint, Time transportServiceStartTime, 
            Time transportServiceEndTime, double transportServiceDistance, 
            double transportServiceCost) {
        this.setServiceName(serviceName);
        this.setServiceDescription(serviceDescription);
        this.setServiceType(serviceType);
        this.transportServiceStartPoint = transportServiceStartPoint;
        this.transportServiceEndPoint = transportServiceEndPoint;
        this.transportServiceStartTime = transportServiceStartTime;
        this.transportServiceEndTime = transportServiceEndTime;
        this.transportServiceDistance = transportServiceDistance;
        this.transportServiceCost = transportServiceCost;
    }

    public String getTransportServiceStartPoint() {
        return transportServiceStartPoint;
    }

    public void setTransportServiceStartPoint(String transportServiceStartPoint) {
        this.transportServiceStartPoint = transportServiceStartPoint;
    }

    public String getTransportServiceEndPoint() {
        return transportServiceEndPoint;
    }

    public void setTransportServiceEndPoint(String transportServiceEndPoint) {
        this.transportServiceEndPoint = transportServiceEndPoint;
    }

    public Time getTransportServiceStartTime() {
        return transportServiceStartTime;
    }

    public void setTransportServiceStartTime(Time transportServiceStartTime) {
        this.transportServiceStartTime = transportServiceStartTime;
    }

    public Time getTransportServiceEndTime() {
        return transportServiceEndTime;
    }

    public void setTransportServiceEndTime(Time transportServiceEndTime) {
        this.transportServiceEndTime = transportServiceEndTime;
    }

    public double getTransportServiceDistance() {
        return transportServiceDistance;
    }

    public void setTransportServiceDistance(double transportServiceDistance) {
        this.transportServiceDistance = transportServiceDistance;
    }

    public double getTransportServiceCost() {
        return transportServiceCost;
    }

    public void setTransportServiceCost(double transportServiceCost) {
        this.transportServiceCost = transportServiceCost;
    }

    public Set<EntityTransportationEvent> getTransportationEvent() {
        return transportationEvent;
    }

    public void setTransportationEvent(Set<EntityTransportationEvent> transportationEvent) {
        this.transportationEvent = transportationEvent;
    }

}

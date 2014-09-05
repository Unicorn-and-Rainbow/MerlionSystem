/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRM;

import TMS.EntityTransportationOrder;
import WMS.EntityWarehouseOrder;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityServiceOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long orderID;
    private String orderType;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date orderDate;
    private String orderDescription;
    private String orderStatus;
    @OneToMany(mappedBy="serviceOrder")
    private Set<EntityTransportationOrder> transportationOrder = new HashSet<>();
    @OneToMany(mappedBy="serviceOrder")
    private Set<EntityWarehouseOrder> warehouseOrder = new HashSet<>();

    
    public EntityServiceOrder() {
       this.setOrderID(System.nanoTime());
    }

    public void createServiceOrder(String orderType, Date orderDate, 
            String orderDescription, String orderStatus) {
        this.orderType = orderType;
        this.orderDate = orderDate;
        this.orderDescription = orderDescription;
        this.orderStatus = orderStatus;
    }
    

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getOrderID() {
        return orderID;
    }

    public String getOrderType() {
        return orderType;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Set<EntityTransportationOrder> getTransportationOrder() {
        return transportationOrder;
    }

    public void setTransportationOrder(Set<EntityTransportationOrder> transportationOrder) {
        this.transportationOrder = transportationOrder;
    }

    public Set<EntityWarehouseOrder> getWarehouseOrder() {
        return warehouseOrder;
    }

    public void setWarehouseOrder(Set<EntityWarehouseOrder> warehouseOrder) {
        this.warehouseOrder = warehouseOrder;
    }
    
}

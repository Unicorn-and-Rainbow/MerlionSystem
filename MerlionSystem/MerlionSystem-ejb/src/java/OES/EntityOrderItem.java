/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OES;

import TMS.EntityTransportationOrder;
import WMS.EntityInventoryItem;
import WMS.EntityWarehouseOrder;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityOrderItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long orderItemID;
    private Long orderItemInventoryID;
    private Integer orderItemQuantity;
    private Double orderItemPrice;
    @OneToOne
    private EntityTransportationOrder transportationOrder;
    @OneToOne
    private EntityWarehouseOrder warehouseOrder;
    @ManyToOne
    private EntityProduct product;
    @OneToMany
    private Set<EntityInventoryItem> inventoryItem = new HashSet<>();

    
    public EntityOrderItem() {
        this.setOrderItemID(System.nanoTime());
    }

    public void createOrderItem(Long orderItemInventoryID, Integer orderItemQuantity, Double orderItemPrice) {
        this.orderItemInventoryID = orderItemInventoryID;
        this.orderItemQuantity = orderItemQuantity;
        this.orderItemPrice = orderItemPrice;
    }

    public Long getOrderItemID() {
        return orderItemID;
    }

    public void setOrderItemID(Long orderItemID) {
        this.orderItemID = orderItemID;
    }

    public Long getOrderItemInventoryID() {
        return orderItemInventoryID;
    }

    public void setOrderItemInventoryID(Long orderItemInventoryID) {
        this.orderItemInventoryID = orderItemInventoryID;
    }

    public Integer getOrderItemQuantity() {
        return orderItemQuantity;
    }

    public void setOrderItemQuantity(Integer orderItemQuantity) {
        this.orderItemQuantity = orderItemQuantity;
    }

    public Double getOrderItemPrice() {
        return orderItemPrice;
    }

    public void setOrderItemPrice(Double orderItemPrice) {
        this.orderItemPrice = orderItemPrice;
    }

    public EntityTransportationOrder getTransportationOrder() {
        return transportationOrder;
    }

    public void setTransportationOrder(EntityTransportationOrder transportationOrder) {
        this.transportationOrder = transportationOrder;
    }

    public EntityWarehouseOrder getWarehouseOrder() {
        return warehouseOrder;
    }

    public void setWarehouseOrder(EntityWarehouseOrder warehouseOrder) {
        this.warehouseOrder = warehouseOrder;
    }

    public EntityProduct getProduct() {
        return product;
    }

    public void setProduct(EntityProduct product) {
        this.product = product;
    }
    
}

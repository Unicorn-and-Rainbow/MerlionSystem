/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OES;

import CommonInfrastructure.EntityCompany;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntitySalesOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long salesOrderID;
    @ManyToMany(mappedBy="salesOrder")
    private Set<EntityCompany> company= new HashSet<>();
    @OneToMany(mappedBy="salesOrder")
    private Set<EntityLineItem> lineItem = new HashSet<>();
    @OneToOne
    private EntityPurchaseOrder purchaseOrder;

    public EntitySalesOrder() {
        this.setSalesOrderID(System.nanoTime());
    }

    public Long getSalesOrderID() {
        return salesOrderID;
    }

    public void setSalesOrderID(Long salesOrderID) {
        this.salesOrderID = salesOrderID;
    }

    public Set<EntityCompany> getCompany() {
        return company;
    }

    public void setCompany(Set<EntityCompany> company) {
        this.company = company;
    }

    public Set<EntityLineItem> getLineItem() {
        return lineItem;
    }

    public void setLineItem(Set<EntityLineItem> lineItem) {
        this.lineItem = lineItem;
    }

    public EntityPurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(EntityPurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

}

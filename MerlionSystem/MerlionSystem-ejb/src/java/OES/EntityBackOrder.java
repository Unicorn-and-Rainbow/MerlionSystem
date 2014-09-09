/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OES;

import CommonInfrastructure.EntityCompany;
import MRPII.EntityOperationPlan;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
    @OneToMany (mappedBy="backOrder")
    private Set<EntityLineItem> lineItem = new HashSet<>();
    @ManyToOne
    private EntityOperationPlan operationPlan;
    @ManyToOne
    private EntityCompany company;

    public EntityBackOrder() {
        this.setBackOrderID(System.nanoTime());
    }

    public Long getBackOrderID() {
        return backOrderID;
    }

    public void setBackOrderID(Long backOrderID) {
        this.backOrderID = backOrderID;
    }

    public Set<EntityLineItem> getLineItem() {
        return lineItem;
    }

    public void setLineItem(Set<EntityLineItem> lineItem) {
        this.lineItem = lineItem;
    }

    public EntityOperationPlan getOperationPlan() {
        return operationPlan;
    }

    public void setOperationPlan(EntityOperationPlan operationPlan) {
        this.operationPlan = operationPlan;
    }

    public EntityCompany getCompany() {
        return company;
    }

    public void setCompany(EntityCompany company) {
        this.company = company;
    }
    
}

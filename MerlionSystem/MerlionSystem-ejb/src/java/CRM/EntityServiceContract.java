/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRM;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityServiceContract implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long ContractID;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date contractSignedDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date contractExpiredDate;
    private String contractStatus;
    private String contractDescription;
    private Long contractCustomerID;
    private double contractPrice;
    
    @OneToMany
    private Set<EntityServiceOrder> order = new HashSet<>();
    @OneToOne
    private EntityServiceInvoice invoice;
    @OneToOne
    private EntityServiceReceipt receipt;

    public EntityServiceContract() {
        this.setContractID(System.nanoTime());
    }

    
    public void createServiceContract(Date contractSignedDate, Date contractExpiredDate,
            String contractStatus, String contractDescription, Long contractCustomerID, 
            double contractPrice) {
        this.contractSignedDate = contractSignedDate;
        this.contractExpiredDate = contractExpiredDate;
        this.contractStatus = contractStatus;
        this.contractDescription = contractDescription;
        this.contractCustomerID = contractCustomerID;
        this.contractPrice = contractPrice;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getContractID() {
        return ContractID;
    }

    public Date getContractSignedDate() {
        return contractSignedDate;
    }

    public Date getContractExpiredDate() {
        return contractExpiredDate;
    }

    public String getContractStatus() {
        return contractStatus;
    }

    public String getContractDescription() {
        return contractDescription;
    }

    public Long getContractCustomerID() {
        return contractCustomerID;
    }

    public double getContractPrice() {
        return contractPrice;
    }

    public Set<EntityServiceOrder> getContract() {
        return order;
    }

    public EntityServiceInvoice getInvoice() {
        return invoice;
    }

    public EntityServiceReceipt getReceipt() {
        return receipt;
    }

    public void setContractID(Long ContractID) {
        this.ContractID = ContractID;
    }

    public void setContractSignedDate(Date contractSignedDate) {
        this.contractSignedDate = contractSignedDate;
    }

    public void setContractExpiredDate(Date contractExpiredDate) {
        this.contractExpiredDate = contractExpiredDate;
    }

    public void setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus;
    }

    public void setContractDescription(String contractDescription) {
        this.contractDescription = contractDescription;
    }

    public void setContractCustomerID(Long contractCustomerID) {
        this.contractCustomerID = contractCustomerID;
    }

    public void setContractPrice(double contractPrice) {
        this.contractPrice = contractPrice;
    }

    public void setContract(Set<EntityServiceOrder> contract) {
        this.order = contract;
    }

    public void setInvoice(EntityServiceInvoice invoice) {
        this.invoice = invoice;
    }

    public void setReceipt(EntityServiceReceipt receipt) {
        this.receipt = receipt;
    }
    
    
}

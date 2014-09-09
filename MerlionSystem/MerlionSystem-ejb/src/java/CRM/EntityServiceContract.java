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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author yuna
 */
@Entity
public class EntityServiceContract implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long serviceContactID;
    @ManyToOne
    private EntityCompany company;
    @OneToMany(mappedBy="serviceContract")
    private Set<AbstractServiceEntry> abstractServiceEntry= new HashSet<AbstractServiceEntry>();
    @OneToOne
    private EntityServiceOrder serviceOrder;
    @OneToOne
    private EntityServiceQuotation serviceQuotation;
    @OneToOne
    private EntityServiceInvoice serviceInvoice;
    
    private Date serviceContactDate;
    private String serviceContactDescription;
    private String serviceContractReference;
    private Long serviceContractCreatorHR;
    private Long serviceContactOwnerID;
    private String serviceContactOwnerName;
    private String serviceContactOwnerRegistrationNo;
    private String serviceContactOwnerAddress;
    private String serviceContactOwnerAddressCity;
    private String serviceContactOwnerAddressCountry;
    private String serviceContactOwnerAddressZip;
    private Long serviceContactReceiverID;
    private String serviceContactReceiverName;
    private String serviceContactReceiverRegistrationNo;
    private String serviceContactReceiverAddress;
    private String serviceContactReceiverAddressCity;
    private String serviceContactReceiverAddressCountry;
    private String serviceContactReceiverAddressZip;
    private String serviceContactStatus;

    public EntityServiceContract() {
    }

    public EntityServiceContract(Long serviceContactID, EntityCompany company, EntityServiceOrder serviceOrder, EntityServiceQuotation serviceQuotation, EntityServiceInvoice serviceInvoice, Date serviceContactDate, String serviceContactDescription, String serviceContractReference, Long serviceContractCreatorHR, Long serviceContactOwnerID, String serviceContactOwnerName, String serviceContactOwnerRegistrationNo, String serviceContactOwnerAddress, String serviceContactOwnerAddressCity, String serviceContactOwnerAddressCountry, String serviceContactOwnerAddressZip, Long serviceContactReceiverID, String serviceContactReceiverName, String serviceContactReceiverRegistrationNo, String serviceContactReceiverAddress, String serviceContactReceiverAddressCity, String serviceContactReceiverAddressCountry, String serviceContactReceiverAddressZip, String serviceContactStatus) {
        this.serviceContactID = serviceContactID;
        this.company = company;
        this.serviceOrder = serviceOrder;
        this.serviceQuotation = serviceQuotation;
        this.serviceInvoice = serviceInvoice;
        this.serviceContactDate = serviceContactDate;
        this.serviceContactDescription = serviceContactDescription;
        this.serviceContractReference = serviceContractReference;
        this.serviceContractCreatorHR = serviceContractCreatorHR;
        this.serviceContactOwnerID = serviceContactOwnerID;
        this.serviceContactOwnerName = serviceContactOwnerName;
        this.serviceContactOwnerRegistrationNo = serviceContactOwnerRegistrationNo;
        this.serviceContactOwnerAddress = serviceContactOwnerAddress;
        this.serviceContactOwnerAddressCity = serviceContactOwnerAddressCity;
        this.serviceContactOwnerAddressCountry = serviceContactOwnerAddressCountry;
        this.serviceContactOwnerAddressZip = serviceContactOwnerAddressZip;
        this.serviceContactReceiverID = serviceContactReceiverID;
        this.serviceContactReceiverName = serviceContactReceiverName;
        this.serviceContactReceiverRegistrationNo = serviceContactReceiverRegistrationNo;
        this.serviceContactReceiverAddress = serviceContactReceiverAddress;
        this.serviceContactReceiverAddressCity = serviceContactReceiverAddressCity;
        this.serviceContactReceiverAddressCountry = serviceContactReceiverAddressCountry;
        this.serviceContactReceiverAddressZip = serviceContactReceiverAddressZip;
        this.serviceContactStatus = serviceContactStatus;
    }

    
    
    public Long getServiceContactID() {
        return serviceContactID;
    }

    public void setServiceContactID(Long serviceContactID) {
        this.serviceContactID = serviceContactID;
    }

    public Date getServiceContactDate() {
        return serviceContactDate;
    }

    public void setServiceContactDate(Date serviceContactDate) {
        this.serviceContactDate = serviceContactDate;
    }

    public String getServiceContactDescription() {
        return serviceContactDescription;
    }

    public void setServiceContactDescription(String serviceContactDescription) {
        this.serviceContactDescription = serviceContactDescription;
    }

    public String getServiceContractReference() {
        return serviceContractReference;
    }

    public void setServiceContractReference(String serviceContractReference) {
        this.serviceContractReference = serviceContractReference;
    }

    public Long getServiceContractCreatorHR() {
        return serviceContractCreatorHR;
    }

    public void setServiceContractCreatorHR(Long serviceContractCreatorHR) {
        this.serviceContractCreatorHR = serviceContractCreatorHR;
    }

    public Long getServiceContactOwnerID() {
        return serviceContactOwnerID;
    }

    public void setServiceContactOwnerID(Long serviceContactOwnerID) {
        this.serviceContactOwnerID = serviceContactOwnerID;
    }

    public String getServiceContactOwnerName() {
        return serviceContactOwnerName;
    }

    public void setServiceContactOwnerName(String serviceContactOwnerName) {
        this.serviceContactOwnerName = serviceContactOwnerName;
    }

    public String getServiceContactOwnerRegistrationNo() {
        return serviceContactOwnerRegistrationNo;
    }

    public void setServiceContactOwnerRegistrationNo(String serviceContactOwnerRegistrationNo) {
        this.serviceContactOwnerRegistrationNo = serviceContactOwnerRegistrationNo;
    }

    public String getServiceContactOwnerAddress() {
        return serviceContactOwnerAddress;
    }

    public void setServiceContactOwnerAddress(String serviceContactOwnerAddress) {
        this.serviceContactOwnerAddress = serviceContactOwnerAddress;
    }

    public String getServiceContactOwnerAddressCity() {
        return serviceContactOwnerAddressCity;
    }

    public void setServiceContactOwnerAddressCity(String serviceContactOwnerAddressCity) {
        this.serviceContactOwnerAddressCity = serviceContactOwnerAddressCity;
    }

    public String getServiceContactOwnerAddressCountry() {
        return serviceContactOwnerAddressCountry;
    }

    public void setServiceContactOwnerAddressCountry(String serviceContactOwnerAddressCountry) {
        this.serviceContactOwnerAddressCountry = serviceContactOwnerAddressCountry;
    }

    public String getServiceContactOwnerAddressZip() {
        return serviceContactOwnerAddressZip;
    }

    public void setServiceContactOwnerAddressZip(String serviceContactOwnerAddressZip) {
        this.serviceContactOwnerAddressZip = serviceContactOwnerAddressZip;
    }

    public Long getServiceContactReceiverID() {
        return serviceContactReceiverID;
    }

    public void setServiceContactReceiverID(Long serviceContactReceiverID) {
        this.serviceContactReceiverID = serviceContactReceiverID;
    }

    public String getServiceContactReceiverName() {
        return serviceContactReceiverName;
    }

    public void setServiceContactReceiverName(String serviceContactReceiverName) {
        this.serviceContactReceiverName = serviceContactReceiverName;
    }

    public String getServiceContactReceiverRegistrationNo() {
        return serviceContactReceiverRegistrationNo;
    }

    public void setServiceContactReceiverRegistrationNo(String serviceContactReceiverRegistrationNo) {
        this.serviceContactReceiverRegistrationNo = serviceContactReceiverRegistrationNo;
    }

    public String getServiceContactReceiverAddress() {
        return serviceContactReceiverAddress;
    }

    public void setServiceContactReceiverAddress(String serviceContactReceiverAddress) {
        this.serviceContactReceiverAddress = serviceContactReceiverAddress;
    }

    public String getServiceContactReceiverAddressCity() {
        return serviceContactReceiverAddressCity;
    }

    public void setServiceContactReceiverAddressCity(String serviceContactReceiverAddressCity) {
        this.serviceContactReceiverAddressCity = serviceContactReceiverAddressCity;
    }

    public String getServiceContactReceiverAddressCountry() {
        return serviceContactReceiverAddressCountry;
    }

    public void setServiceContactReceiverAddressCountry(String serviceContactReceiverAddressCountry) {
        this.serviceContactReceiverAddressCountry = serviceContactReceiverAddressCountry;
    }

    public String getServiceContactReceiverAddressZip() {
        return serviceContactReceiverAddressZip;
    }

    public void setServiceContactReceiverAddressZip(String serviceContactReceiverAddressZip) {
        this.serviceContactReceiverAddressZip = serviceContactReceiverAddressZip;
    }

    public String getServiceContactStatus() {
        return serviceContactStatus;
    }

    public void setServiceContactStatus(String serviceContactStatus) {
        this.serviceContactStatus = serviceContactStatus;
    }

    public EntityCompany getCompany() {
        return company;
    }

    public void setCompany(EntityCompany company) {
        this.company = company;
    }

    public Set<AbstractServiceEntry> getAbstractServiceEntry() {
        return abstractServiceEntry;
    }

    public void setAbstractServiceEntry(Set<AbstractServiceEntry> abstractServiceEntry) {
        this.abstractServiceEntry = abstractServiceEntry;
    }

    public EntityServiceOrder getServiceOrder() {
        return serviceOrder;
    }

    public void setServiceOrder(EntityServiceOrder serviceOrder) {
        this.serviceOrder = serviceOrder;
    }

    public EntityServiceQuotation getServiceQuotation() {
        return serviceQuotation;
    }

    public void setServiceQuotation(EntityServiceQuotation serviceQuotation) {
        this.serviceQuotation = serviceQuotation;
    }

    public EntityServiceInvoice getServiceInvoice() {
        return serviceInvoice;
    }

    public void setServiceInvoice(EntityServiceInvoice serviceInvoice) {
        this.serviceInvoice = serviceInvoice;
    }

    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serviceContactID != null ? serviceContactID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the serviceContactID fields are not set
        if (!(object instanceof EntityServiceContract)) {
            return false;
        }
        EntityServiceContract other = (EntityServiceContract) object;
        if ((this.serviceContactID == null && other.serviceContactID != null) || (this.serviceContactID != null && !this.serviceContactID.equals(other.serviceContactID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CRM.EntityServiceContract[ id=" + serviceContactID + " ]";
    }
    
}

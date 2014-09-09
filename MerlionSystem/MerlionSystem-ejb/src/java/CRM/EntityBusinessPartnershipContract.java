/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRM;

import CommonInfrastructure.EntityCompany;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author yuna
 */
@Entity
public class EntityBusinessPartnershipContract implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long businessContactID;
    @ManyToOne
    private EntityCompany company;
    
    private Date businessContactDate;
    private String businessContactDescription;
    private String businessContractReference;
    private Long businessContractCreatorHR;
    private Long businessContactOwnerID;
    private String businessContactOwnerName;
    private String businessContactOwnerRegistrationNo;
    private String businessContactOwnerAddress;
    private String businessContactOwnerAddressCity;
    private String businessContactOwnerAddressCountry;
    private String businessContactOwnerAddressZip;
    private Long businessContactReceiverID;
    private String businessContactReceiverName;
    private String businessContactReceiverRegistrationNo;
    private String businessContactReceiverAddress;
    private String businessContactReceiverAddressCity;
    private String businessContactReceiverAddressCountry;
    private String businessContactReceiverAddressZip;
    private String businessContactStatus;

    public EntityBusinessPartnershipContract() {
    }

    public EntityBusinessPartnershipContract(Long businessContactID, EntityCompany company, Date businessContactDate, String businessContactDescription, String businessContractReference, Long businessContractCreatorHR, Long businessContactOwnerID, String businessContactOwnerName, String businessContactOwnerRegistrationNo, String businessContactOwnerAddress, String businessContactOwnerAddressCity, String businessContactOwnerAddressCountry, String businessContactOwnerAddressZip, Long businessContactReceiverID, String businessContactReceiverName, String businessContactReceiverRegistrationNo, String businessContactReceiverAddress, String businessContactReceiverAddressCity, String businessContactReceiverAddressCountry, String businessContactReceiverAddressZip, String businessContactStatus) {
        this.businessContactID = businessContactID;
        this.company = company;
        this.businessContactDate = businessContactDate;
        this.businessContactDescription = businessContactDescription;
        this.businessContractReference = businessContractReference;
        this.businessContractCreatorHR = businessContractCreatorHR;
        this.businessContactOwnerID = businessContactOwnerID;
        this.businessContactOwnerName = businessContactOwnerName;
        this.businessContactOwnerRegistrationNo = businessContactOwnerRegistrationNo;
        this.businessContactOwnerAddress = businessContactOwnerAddress;
        this.businessContactOwnerAddressCity = businessContactOwnerAddressCity;
        this.businessContactOwnerAddressCountry = businessContactOwnerAddressCountry;
        this.businessContactOwnerAddressZip = businessContactOwnerAddressZip;
        this.businessContactReceiverID = businessContactReceiverID;
        this.businessContactReceiverName = businessContactReceiverName;
        this.businessContactReceiverRegistrationNo = businessContactReceiverRegistrationNo;
        this.businessContactReceiverAddress = businessContactReceiverAddress;
        this.businessContactReceiverAddressCity = businessContactReceiverAddressCity;
        this.businessContactReceiverAddressCountry = businessContactReceiverAddressCountry;
        this.businessContactReceiverAddressZip = businessContactReceiverAddressZip;
        this.businessContactStatus = businessContactStatus;
    }

    public Long getBusinessContactID() {
        return businessContactID;
    }

    public void setBusinessContactID(Long businessContactID) {
        this.businessContactID = businessContactID;
    }

    public Date getBusinessContactDate() {
        return businessContactDate;
    }

    public void setBusinessContactDate(Date businessContactDate) {
        this.businessContactDate = businessContactDate;
    }

    public String getBusinessContactDescription() {
        return businessContactDescription;
    }

    public void setBusinessContactDescription(String businessContactDescription) {
        this.businessContactDescription = businessContactDescription;
    }

    public String getBusinessContractReference() {
        return businessContractReference;
    }

    public void setBusinessContractReference(String businessContractReference) {
        this.businessContractReference = businessContractReference;
    }

    public Long getBusinessContractCreatorHR() {
        return businessContractCreatorHR;
    }

    public void setBusinessContractCreatorHR(Long businessContractCreatorHR) {
        this.businessContractCreatorHR = businessContractCreatorHR;
    }

    public Long getBusinessContactOwnerID() {
        return businessContactOwnerID;
    }

    public void setBusinessContactOwnerID(Long businessContactOwnerID) {
        this.businessContactOwnerID = businessContactOwnerID;
    }

    public String getBusinessContactOwnerName() {
        return businessContactOwnerName;
    }

    public void setBusinessContactOwnerName(String businessContactOwnerName) {
        this.businessContactOwnerName = businessContactOwnerName;
    }

    public String getBusinessContactOwnerRegistrationNo() {
        return businessContactOwnerRegistrationNo;
    }

    public void setBusinessContactOwnerRegistrationNo(String businessContactOwnerRegistrationNo) {
        this.businessContactOwnerRegistrationNo = businessContactOwnerRegistrationNo;
    }

    public String getBusinessContactOwnerAddress() {
        return businessContactOwnerAddress;
    }

    public void setBusinessContactOwnerAddress(String businessContactOwnerAddress) {
        this.businessContactOwnerAddress = businessContactOwnerAddress;
    }

    public String getBusinessContactOwnerAddressCity() {
        return businessContactOwnerAddressCity;
    }

    public void setBusinessContactOwnerAddressCity(String businessContactOwnerAddressCity) {
        this.businessContactOwnerAddressCity = businessContactOwnerAddressCity;
    }

    public String getBusinessContactOwnerAddressCountry() {
        return businessContactOwnerAddressCountry;
    }

    public void setBusinessContactOwnerAddressCountry(String businessContactOwnerAddressCountry) {
        this.businessContactOwnerAddressCountry = businessContactOwnerAddressCountry;
    }

    public String getBusinessContactOwnerAddressZip() {
        return businessContactOwnerAddressZip;
    }

    public void setBusinessContactOwnerAddressZip(String businessContactOwnerAddressZip) {
        this.businessContactOwnerAddressZip = businessContactOwnerAddressZip;
    }

    public Long getBusinessContactReceiverID() {
        return businessContactReceiverID;
    }

    public void setBusinessContactReceiverID(Long businessContactReceiverID) {
        this.businessContactReceiverID = businessContactReceiverID;
    }

    public String getBusinessContactReceiverName() {
        return businessContactReceiverName;
    }

    public void setBusinessContactReceiverName(String businessContactReceiverName) {
        this.businessContactReceiverName = businessContactReceiverName;
    }

    public String getBusinessContactReceiverRegistrationNo() {
        return businessContactReceiverRegistrationNo;
    }

    public void setBusinessContactReceiverRegistrationNo(String businessContactReceiverRegistrationNo) {
        this.businessContactReceiverRegistrationNo = businessContactReceiverRegistrationNo;
    }

    public String getBusinessContactReceiverAddress() {
        return businessContactReceiverAddress;
    }

    public void setBusinessContactReceiverAddress(String businessContactReceiverAddress) {
        this.businessContactReceiverAddress = businessContactReceiverAddress;
    }

    public String getBusinessContactReceiverAddressCity() {
        return businessContactReceiverAddressCity;
    }

    public void setBusinessContactReceiverAddressCity(String businessContactReceiverAddressCity) {
        this.businessContactReceiverAddressCity = businessContactReceiverAddressCity;
    }

    public String getBusinessContactReceiverAddressCountry() {
        return businessContactReceiverAddressCountry;
    }

    public void setBusinessContactReceiverAddressCountry(String businessContactReceiverAddressCountry) {
        this.businessContactReceiverAddressCountry = businessContactReceiverAddressCountry;
    }

    public String getBusinessContactReceiverAddressZip() {
        return businessContactReceiverAddressZip;
    }

    public void setBusinessContactReceiverAddressZip(String businessContactReceiverAddressZip) {
        this.businessContactReceiverAddressZip = businessContactReceiverAddressZip;
    }

    public String getBusinessContactStatus() {
        return businessContactStatus;
    }

    public void setBusinessContactStatus(String businessContactStatus) {
        this.businessContactStatus = businessContactStatus;
    }

    public EntityCompany getCompany() {
        return company;
    }

    public void setCompany(EntityCompany company) {
        this.company = company;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (businessContactID != null ? businessContactID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the businessContactID fields are not set
        if (!(object instanceof EntityBusinessPartnershipContract)) {
            return false;
        }
        EntityBusinessPartnershipContract other = (EntityBusinessPartnershipContract) object;
        if ((this.businessContactID == null && other.businessContactID != null) || (this.businessContactID != null && !this.businessContactID.equals(other.businessContactID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CRM.EntityBusinessPartnershipContract[ id=" + businessContactID + " ]";
    }
    
}

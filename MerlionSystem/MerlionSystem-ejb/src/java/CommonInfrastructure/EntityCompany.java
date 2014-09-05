/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CommonInfrastructure;

import CRM.EntityQuotation;
import CRM.EntityServiceCatalog;
import CRM.EntityServiceContract;
import CRM.EntityServiceRequest;
import GRNS.EntityAggregatedRequest;
import GRNS.EntityServiceProvider;
import GRNS.EntityServiceRequester;
import MRPII.EntityMaterial;
import OES.EntityProductCatalog;
import OES.EntitySalesOrder;
import OES.EntitySalesQuotation;
import TMS.EntityInternalServiceRequest;
import TMS.EntityTransportationAsset;
import TMS.EntityTransportationOrder;
import WMS.EntityPurchaseOrder;
import WMS.EntityWarehouse;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityCompany implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long companyID;
    private String companyName;
    private String companyAddress;
    private String companyBillingAddress;
    private String companyContact;
    private String companyEmail;
    private String companyType;
    
    @OneToMany(cascade={CascadeType.ALL}, mappedBy="Company")
    private Set<EntityUser> user = new HashSet<>();
    @OneToMany
    private Set<EntityServiceContract> contract = new HashSet<>();
    @OneToMany
    private Set<EntityServiceCatalog> catalog = new HashSet<>();
    @OneToMany
    private Set<EntityQuotation> quotation = new HashSet<>();
    @OneToMany
    private Set<EntitySalesQuotation> salesQuotation = new HashSet<>();
    @OneToMany
    private Set<EntityProductCatalog> productCatalog = new HashSet<>();
    @OneToMany
    private Set<EntitySalesOrder> salesOrder = new HashSet<>();
    @OneToMany
    private Set<EntityPurchaseOrder> purchaseOrder = new HashSet<>();
    @OneToMany
    private Set<EntityMaterial> material = new HashSet<>();
    @OneToMany
    private Set<EntityInternalServiceRequest> internalSourceRequest = new HashSet<>();
    @OneToMany
    private Set<EntityTransportationOrder> transportationOrder = new HashSet<>();
    @OneToMany
    private Set<EntityTransportationAsset> transportationAsset = new HashSet<>();
    @OneToMany
    private Set<EntityWarehouse> warehouse = new HashSet<>();
    @OneToMany
    private Set<EntityServiceProvider> serviceProvider = new HashSet<>();
    @OneToMany
    private Set<EntityServiceRequester> serviceRequester = new HashSet<>();
    @OneToMany
    private Set<EntityAggregatedRequest> aggregatedRequest = new HashSet<>();
    @OneToMany
    private Set<EntityServiceRequest> serviceRequest = new HashSet<>();


    public EntityCompany(){
        this.setCompanyID(System.nanoTime());
    }
    
    public void createCompany(String companyName, String companyAddress, 
            String companyBillingAddress, String companyContact, 
            String companyEmail, String companyType){
        this.setCompanyAddress(companyAddress);
        this.setCompanyBillingAddress(companyBillingAddress);
        this.setCompanyContact(companyContact);
        this.setCompanyEmail(companyEmail);
        this.setCompanyName(companyName);
        this.setCompanyType(companyType);
    }
    
    public void setCompanyID(Long companyID) {
        this.companyID = companyID;
    }

    public void setUser(Set<EntityUser> user) {
        this.user = user;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public void setCompanyBillingAddress(String companyBillingAddress) {
        this.companyBillingAddress = companyBillingAddress;
    }

    public void setCompanyContact(String companyContact) {
        this.companyContact = companyContact;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getCompanyID() {
        return companyID;
    }

    public Set<EntityUser> getUser() {
        return user;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public String getCompanyBillingAddress() {
        return companyBillingAddress;
    }

    public String getCompanyContact() {
        return companyContact;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public String getCompanyType() {
        return companyType;
    }

    public Set<EntityServiceContract> getContract() {
        return contract;
    }

    public void setContract(Set<EntityServiceContract> contract) {
        this.contract = contract;
    }

    public Set<EntityServiceCatalog> getCatalog() {
        return catalog;
    }

    public void setCatalog(Set<EntityServiceCatalog> catalog) {
        this.catalog = catalog;
    }

    public Set<EntityQuotation> getQuotation() {
        return quotation;
    }

    public void setQuotation(Set<EntityQuotation> quotation) {
        this.quotation = quotation;
    }

    public Set<EntitySalesQuotation> getSalesQuotation() {
        return salesQuotation;
    }

    public void setSalesQuotation(Set<EntitySalesQuotation> salesQuotation) {
        this.salesQuotation = salesQuotation;
    }

    public Set<EntityProductCatalog> getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(Set<EntityProductCatalog> productCatalog) {
        this.productCatalog = productCatalog;
    }

    public Set<EntitySalesOrder> getSalesOrder() {
        return salesOrder;
    }

    public void setSalesOrder(Set<EntitySalesOrder> salesOrder) {
        this.salesOrder = salesOrder;
    }

    public Set<EntityMaterial> getMaterial() {
        return material;
    }

    public void setMaterial(Set<EntityMaterial> material) {
        this.material = material;
    }

    public Set<EntityInternalServiceRequest> getInternalSourceRequest() {
        return internalSourceRequest;
    }

    public void setInternalSourceRequest(Set<EntityInternalServiceRequest> internalSourceRequest) {
        this.internalSourceRequest = internalSourceRequest;
    }

    public Set<EntityTransportationOrder> getTrnasportationOrder() {
        return transportationOrder;
    }

    public void setTrnasportationOrder(Set<EntityTransportationOrder> trnasportationOrder) {
        this.transportationOrder = trnasportationOrder;
    }

    public Set<EntityTransportationAsset> getTransportationAsset() {
        return transportationAsset;
    }

    public void setTransportationAsset(Set<EntityTransportationAsset> transportationAsset) {
        this.transportationAsset = transportationAsset;
    }

    public Set<EntityWarehouse> getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Set<EntityWarehouse> warehouse) {
        this.warehouse = warehouse;
    }

    public Set<EntityServiceProvider> getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(Set<EntityServiceProvider> serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public Set<EntityServiceRequester> getServiceRequester() {
        return serviceRequester;
    }

    public void setServiceRequester(Set<EntityServiceRequester> serviceRequester) {
        this.serviceRequester = serviceRequester;
    }

    public Set<EntityAggregatedRequest> getAggregatedRequest() {
        return aggregatedRequest;
    }

    public void setAggregatedRequest(Set<EntityAggregatedRequest> aggregatedRequest) {
        this.aggregatedRequest = aggregatedRequest;
    }

    public Set<EntityPurchaseOrder> getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(Set<EntityPurchaseOrder> purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public Set<EntityTransportationOrder> getTransportationOrder() {
        return transportationOrder;
    }

    public void setTransportationOrder(Set<EntityTransportationOrder> transportationOrder) {
        this.transportationOrder = transportationOrder;
    }

    public Set<EntityServiceRequest> getServiceRequest() {
        return serviceRequest;
    }

    public void setServiceRequest(Set<EntityServiceRequest> serviceRequest) {
        this.serviceRequest = serviceRequest;
    }
  
    
}

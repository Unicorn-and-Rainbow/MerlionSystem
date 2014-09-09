/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OES;

import CommonInfrastructure.EntityCompany;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityRFQ implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private long rfqDocumentID;
    @OneToOne
    private EntitySalesQuotation salesQuotation;
    @OneToOne
    private EntityLineItem lineItem;
    @ManyToMany(mappedBy = "rfq")
    private Set<EntityCompany> company = new HashSet<>();

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date rfqDate;
    private long supplierID;
    private long buyerID;
    private long productID;
    private String productName;
    private String productDescription;
    private double productQty;

    public EntityRFQ() {
        this.setRfqDocumentID(System.nanoTime());
    }

    public long getRfqDocumentID() {
        return rfqDocumentID;
    }

    public void setRfqDocumentID(long rfqDocumentID) {
        this.rfqDocumentID = rfqDocumentID;
    }

    public EntitySalesQuotation getSalesQuotation() {
        return salesQuotation;
    }

    public void setSalesQuotation(EntitySalesQuotation salesQuotation) {
        this.salesQuotation = salesQuotation;
    }

    public EntityLineItem getLineItem() {
        return lineItem;
    }

    public void setLineItem(EntityLineItem lineItem) {
        this.lineItem = lineItem;
    }

    public Set<EntityCompany> getCompany() {
        return company;
    }

    public void setCompany(Set<EntityCompany> company) {
        this.company = company;
    }

    public Date getRfqDate() {
        return rfqDate;
    }

    public void setRfqDate(Date rfqDate) {
        this.rfqDate = rfqDate;
    }

    public long getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(long supplierID) {
        this.supplierID = supplierID;
    }

    public long getBuyerID() {
        return buyerID;
    }

    public void setBuyerID(long buyerID) {
        this.buyerID = buyerID;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductQty() {
        return productQty;
    }

    public void setProductQty(double productQty) {
        this.productQty = productQty;
    }
}

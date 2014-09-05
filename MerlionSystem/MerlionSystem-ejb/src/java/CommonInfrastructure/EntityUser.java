/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CommonInfrastructure;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityUser implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long userID;
    private String userFirstName;
    private String userLastName;
    private String userAddress;
    @Temporal(value = TemporalType.DATE)
    private Date userDateOfBirth;
    private String userContactNumber;
    private String userAccount;
    private String userPassword;
    private String userEmail;
    @ManyToOne
    private EntityCompany company;
    @OneToMany
    private Set<EntityRole> role = new HashSet<>();
    
    public void EntityUser(){
        setUserID(System.nanoTime());
    }

    public void createUser(String userFirstName, String userLastName, String userAddress,
            Date userDateOfBirth, String userContactNumber, String userAccount, 
            String userPassword, String userEmail, EntityCompany company) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userAddress = userAddress;
        this.userDateOfBirth = userDateOfBirth;
        this.userContactNumber = userContactNumber;
        this.userAccount = userAccount;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.company = company;
    }
    

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Date getUserDateOfBirth() {
        return userDateOfBirth;
    }

    public void setUserDateOfBirth(Date userDateOfBirth) {
        this.userDateOfBirth = userDateOfBirth;
    }

    public String getUserContactNumber() {
        return userContactNumber;
    }

    public void setUserContactNumber(String userContactNumber) {
        this.userContactNumber = userContactNumber;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public EntityCompany getCompany() {
        return company;
    }

    public void setCompany(EntityCompany company) {
        this.company = company;
    }

    public Set<EntityRole> getRole() {
        return role;
    }

    public void setRole(Set<EntityRole> role) {
        this.role = role;
    }

}

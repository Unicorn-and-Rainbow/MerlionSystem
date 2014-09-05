/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb;


/**
 *
 * @author phuongtung
 */
public interface CommonInfrastructureManagerRemote {

    public void createCompany(String companyName, String companyAddress,
            String companyBillingAddress, String companyContact,
            String companyEmail, String companyType);
    public void createUser(String userFirstName, String userLastName, String userAddress, 
            String dateOfBirth, String userContactNumber, String userAccount, 
            String userPassword, String userEmail, Long companyID);
    public boolean checkUser(String account, String password);
}

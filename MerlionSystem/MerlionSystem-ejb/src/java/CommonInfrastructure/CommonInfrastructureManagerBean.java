/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommonInfrastructure;

import ejb.CommonInfrastructureManagerRemote;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author phuongtung
 */
@Stateful
public class CommonInfrastructureManagerBean implements CommonInfrastructureManagerRemote {

    @PersistenceContext
    EntityManager em;
    private EntityUser user;
    private EntityCompany company;
    Set<EntityUser> userlist;

    @Override
    public void createUser(String userFirstName, String userLastName, String userAddress,
            String dateOfBirth, String userContactNumber, String userAccount, 
            String userPassword, String userEmail, Long companyID) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        try {
            Date date = sdf.parse(dateOfBirth);
            user = new EntityUser();

            user.createUser(userFirstName, userLastName, userAddress, date, 
                    userContactNumber, userAccount, userPassword, userEmail, company);
            System.out.println("user id: "+user.getUserID());
            Query q = em.createQuery("SELECT c FROM Company c");
            for (Object o : q.getResultList()) {
                EntityCompany c = (EntityCompany) o;
                System.out.println("id: "+c.getCompanyID());
                if (Objects.equals(c.getCompanyID(), companyID)) {
                    company = c;
                    break;
                } else {
                    company = null;
                }
            }
            user.setCompany(company);
            em.persist(user);
            userlist = company.getUser();
            userlist.add(user);
            company.setUser(userlist);

        } catch (ParseException ex) {
            Logger.getLogger(CommonInfrastructureManagerBean.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    @Override
    public boolean checkUser(String account, String password){
         Query q = em.createQuery("SELECT p FROM User p");
         for (Object o: q.getResultList()){
             EntityUser p = (EntityUser)o;
             if (p.getUserAccount().equals(account)&&p.getUserPassword().equals(password))
                 return true;
         }
         return false;
    }

    

    @Override
    public void createCompany(String companyName, String companyAddress,
            String companyBillingAddress, String companyContact,
            String companyEmail, String companyType) {
        company = new EntityCompany();
        company.createCompany(companyName, companyAddress, companyBillingAddress,
                companyContact, companyEmail, companyType);
        userlist = new HashSet<>();
        company.setUser(userlist);
        em.persist(company);
    }
}

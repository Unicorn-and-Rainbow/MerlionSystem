/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CommonInfrastructure;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author phuongtung
 */
@Entity
public class EntityRole implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long roleID;
    private String roleName;

    public EntityRole() {
        this.setRoleID(System.nanoTime());
    }

    public void createRole(String roleName) {
        this.roleName = roleName;
    }
    
    public Long getRoleID() {
        return roleID;
    }

    public void setRoleID(Long roleID) {
        this.roleID = roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    

}

package org.academiadecodigo.codezillas.resumeRest.domainModel.role;

import org.academiadecodigo.codezillas.resumeRest.domainModel.AbstractModel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
public class Role extends AbstractModel {

    @ManyToOne(
        optional = false,
        fetch = FetchType.LAZY,
        cascade = CascadeType.ALL
    )
    RoleLevel roleLevel;

    @ManyToOne(
        optional = false,
        fetch = FetchType.LAZY,
        cascade = CascadeType.ALL
    )
    RoleCategory roleCategory;

    @ManyToOne(
        optional = false,
        fetch = FetchType.LAZY,
        cascade = CascadeType.ALL
    )
    RoleSubCategory roleSubCategory;

    public RoleLevel getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(RoleLevel roleLevel) {
        this.roleLevel = roleLevel;
    }

    public RoleCategory getRoleCategory() {
        return roleCategory;
    }

    public void setRoleCategory(RoleCategory roleCategory) {
        this.roleCategory = roleCategory;
    }

    public RoleSubCategory getRoleSubCategory() {
        return roleSubCategory;
    }

    public void setRoleSubCategory(RoleSubCategory roleSubCategory) {
        this.roleSubCategory = roleSubCategory;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleLevel=" + roleLevel +
                ", roleCategory=" + roleCategory +
                ", roleSubCategory=" + roleSubCategory +
                "} " + super.toString();
    }
}

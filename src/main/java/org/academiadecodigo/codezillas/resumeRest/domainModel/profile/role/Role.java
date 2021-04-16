package org.academiadecodigo.codezillas.resumeRest.domainModel.profile.role;

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
    Level level;

    @ManyToOne(
        optional = false,
        fetch = FetchType.LAZY,
        cascade = CascadeType.ALL
    )
    Category category;

    @ManyToOne(
        optional = false,
        fetch = FetchType.LAZY,
        cascade = CascadeType.ALL
    )
    SubCategory subCategory;

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    @Override
    public String toString() {
        return "Role{" +
                "level=" + level +
                ", category=" + category +
                ", subCategory=" + subCategory +
                "} " + super.toString();
    }
}

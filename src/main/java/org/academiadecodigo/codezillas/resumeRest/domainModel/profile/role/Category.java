package org.academiadecodigo.codezillas.resumeRest.domainModel.profile.role;

import org.academiadecodigo.codezillas.resumeRest.domainModel.AbstractModel;

import javax.persistence.Entity;

@Entity
public class Category extends AbstractModel {

    private String categoryName;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                "} " + super.toString();
    }
}

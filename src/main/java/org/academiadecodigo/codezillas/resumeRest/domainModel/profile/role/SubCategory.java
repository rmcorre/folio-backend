package org.academiadecodigo.codezillas.resumeRest.domainModel.profile.role;

import org.academiadecodigo.codezillas.resumeRest.domainModel.AbstractModel;

import javax.persistence.Entity;

@Entity
public class SubCategory extends AbstractModel {

    private String subCategoryName;

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    @Override
    public String toString() {
        return "SubCategory{" +
                "subCategoryName='" + subCategoryName + '\'' +
                "} " + super.toString();
    }
}

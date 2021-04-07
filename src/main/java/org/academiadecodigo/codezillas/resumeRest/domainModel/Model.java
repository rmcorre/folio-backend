package org.academiadecodigo.codezillas.resumeRest.domainModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public interface Model {

    int getId();

    void setId(int id);
}

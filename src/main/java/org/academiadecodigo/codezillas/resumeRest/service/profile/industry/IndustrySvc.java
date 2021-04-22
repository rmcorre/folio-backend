package org.academiadecodigo.codezillas.resumeRest.service.profile.industry;

import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.industry.Industry;

import java.util.List;

public interface IndustrySvc {

    List<Industry> getIndustries();

    Industry getIndustry(Integer id);
}

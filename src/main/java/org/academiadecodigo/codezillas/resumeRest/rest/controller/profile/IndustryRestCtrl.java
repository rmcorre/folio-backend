package org.academiadecodigo.codezillas.resumeRest.rest.controller.profile;

import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.industry.Industry;
import org.academiadecodigo.codezillas.resumeRest.service.profile.industry.IndustrySvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class IndustryRestCtrl {

    private IndustrySvc industrySvc;

    @Autowired
    public IndustryRestCtrl(IndustrySvc industrySvc) {
        this.industrySvc = industrySvc;
    }

    @GetMapping("/industries")
    public List<Industry> getIndustries() {
        return industrySvc.getIndustries();
    }

    @GetMapping("/industries/{id}")
    public Industry getIndustry(@PathVariable Integer id) {
        return industrySvc.getIndustry(id);
    }
}

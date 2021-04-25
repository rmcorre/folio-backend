package org.academiadecodigo.codezillas.resumeRest.rest.controller.profile;

import org.academiadecodigo.codezillas.resumeRest.domain.profile.summary.Summary;
import org.academiadecodigo.codezillas.resumeRest.service.profile.summary.SummarySvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/")
public class SummaryRestCtrl {

    private final SummarySvc summarySvc;

    @Autowired
    public SummaryRestCtrl(SummarySvc summarySvc) {
        this.summarySvc = summarySvc;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/summaries")
    public Set<Summary> getSummaries() {
        return new HashSet<>(summarySvc.getSummaries());
    }
}

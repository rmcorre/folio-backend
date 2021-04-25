package org.academiadecodigo.codezillas.resumeRest.service.profile.summary;

import org.academiadecodigo.codezillas.resumeRest.repository.profile.SummaryJpaRepository;
import org.academiadecodigo.codezillas.resumeRest.domain.profile.summary.Summary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SummarySvcImpl implements SummarySvc {

    private final SummaryJpaRepository summaryJpaRepository;

    @Autowired
    public SummarySvcImpl(SummaryJpaRepository summaryJpaRepository) {
        this.summaryJpaRepository = summaryJpaRepository;
    }

    @Override
    public List<Summary> getSummaries() {
        return summaryJpaRepository.findAll();
    }
}

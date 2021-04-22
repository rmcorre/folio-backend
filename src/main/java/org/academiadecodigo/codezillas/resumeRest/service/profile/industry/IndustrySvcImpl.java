package org.academiadecodigo.codezillas.resumeRest.service.profile.industry;

import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.industry.Industry;
import org.academiadecodigo.codezillas.resumeRest.repository.profile.IndustryJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class IndustrySvcImpl implements IndustrySvc {

    private final IndustryJpaRepository industryJpaRepository;

    @Autowired
    public IndustrySvcImpl(IndustryJpaRepository industryJpaRepository) {
        this.industryJpaRepository = industryJpaRepository;
    }

    @Override
    public List<Industry> getIndustries() {
        return industryJpaRepository.findAll();
    }

    @Override
    public Industry getIndustry(Integer id) {

        Optional<Industry> result = industryJpaRepository.findById(id);

        Industry industry = null;
        if (result.isPresent()) {
            industry = result.get();
        }

        return industry;
    }
}

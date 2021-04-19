package org.academiadecodigo.codezillas.resumeRest.service.profile.toolGroup;

import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.tool.ToolGroup;
import org.academiadecodigo.codezillas.resumeRest.repository.profile.ToolGroupJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ToolGroupSvcImpl implements ToolGroupSvc {

    private final ToolGroupJpaRepository toolGroupJpaRepository;

    @Autowired
    public ToolGroupSvcImpl(ToolGroupJpaRepository toolGroupJpaRepository) {
        this.toolGroupJpaRepository = toolGroupJpaRepository;
    }

    public ToolGroupJpaRepository getToolGroupJpaRepository() {
        return toolGroupJpaRepository;
    }

    @Override
    public List<ToolGroup> getToolGroups() {
        return toolGroupJpaRepository.findAll();
    }

    @Override
    public ToolGroup getToolGroup(Integer id) {

        Optional<ToolGroup> result = toolGroupJpaRepository.findById(id);

        ToolGroup toolGroup = null;
        if (result.isPresent()) {
            toolGroup = result.get();
        }

        return toolGroup;
    }

    @Override
    public String toString() {
        return "ToolGroupSvcImpl{" +
                "toolGroupJpaRepository=" + toolGroupJpaRepository +
                '}';
    }
}

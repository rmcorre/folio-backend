package org.academiadecodigo.codezillas.resumeRest.service.level;

import org.academiadecodigo.codezillas.resumeRest.repository.LevelJpaRepository;
import org.academiadecodigo.codezillas.resumeRest.domainModel.level.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Service
@Transactional
public class LevelSvcImpl implements LevelSvc {

    private final LevelJpaRepository levelJpaRepository;

    @Autowired
    public LevelSvcImpl(LevelJpaRepository levelJpaRepository) {
        this.levelJpaRepository = levelJpaRepository;
    }

    @Override
    public Set<Level> getLevels() {
        return new HashSet<>(levelJpaRepository.findAll());
    }

    @Override
    public Level getLevel(Integer id) {
        return levelJpaRepository.getOne(id);
    }
}

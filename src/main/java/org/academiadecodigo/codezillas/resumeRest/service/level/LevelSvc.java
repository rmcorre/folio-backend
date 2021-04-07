package org.academiadecodigo.codezillas.resumeRest.service.level;

import org.academiadecodigo.codezillas.resumeRest.domainModel.level.Level;

import java.util.Set;

public interface LevelSvc {

    Set<Level> getLevels();

    Level getLevel(Integer id);
}

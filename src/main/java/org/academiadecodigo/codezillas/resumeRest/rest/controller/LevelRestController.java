package org.academiadecodigo.codezillas.resumeRest.rest.controller;

import org.academiadecodigo.codezillas.resumeRest.domainModel.level.Level;
import org.academiadecodigo.codezillas.resumeRest.service.level.LevelSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api")
public class LevelRestController {

    private final LevelSvc levelSvc;

    @Autowired
    public LevelRestController(LevelSvc levelSvc) {
        this.levelSvc = levelSvc;
    }

    @GetMapping("/levels")
    public Set<Level> getLevels() {
        return levelSvc.getLevels();
    }

    @GetMapping("/levels/{id}")
    public Level getLevel(@PathVariable Integer id) {
        return levelSvc.getLevel(id);
    }
}

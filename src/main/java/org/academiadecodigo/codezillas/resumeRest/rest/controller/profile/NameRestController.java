package org.academiadecodigo.codezillas.resumeRest.rest.controller.profile;

import org.academiadecodigo.codezillas.resumeRest.domain.profile.identity.Identity;
import org.academiadecodigo.codezillas.resumeRest.domain.profile.identity.name.Name;
import org.academiadecodigo.codezillas.resumeRest.rest.controller.profile.exeption.NameNotFoundException;
import org.academiadecodigo.codezillas.resumeRest.service.profile.name.NameSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/")
public class NameRestController {

    private final NameSvc nameSvc;

    @Autowired
    public NameRestController(NameSvc nameSvc) {
        this.nameSvc = nameSvc;
    }

    @GetMapping("/names")
    public Set<Name> getNames() {
        return nameSvc.getNames();
    }

    @GetMapping("/names/{id}")
    public Name getName(@PathVariable Integer id) {

        // remember:
        // if an entity is not found in the database
        // the method returns null.
        // What jackson will do for null objects,
        // is return an empty body
        // Therefore instead of an empty response,
        // We want a 404 and an error message

        // There will also be a ugly exception (type mismatch)
        // if text is entered instead of an integer.
        // This should also be handled with an exception handler
        Name name = nameSvc.getName(id);

        if (name == null) {
            throw new NameNotFoundException("Name id " + id + " not found");
        }

        // Happy path
        return name;
    }

    @GetMapping("/names/{id}/identities")
    public Set<Identity> getNameIdentities(@PathVariable Integer id) {
        return nameSvc.getName(id).getIdentities();
    }

}

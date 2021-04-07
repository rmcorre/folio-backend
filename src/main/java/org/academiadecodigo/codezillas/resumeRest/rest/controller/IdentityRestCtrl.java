package org.academiadecodigo.codezillas.resumeRest.rest.controller;

import org.academiadecodigo.codezillas.resumeRest.domainModel.identity.Identity;
import org.academiadecodigo.codezillas.resumeRest.service.identity.IdentitySvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/")
@SessionAttributes({"identity"})
public class IdentityRestCtrl {

    private final IdentitySvc identitySvc;

    @Autowired
    public IdentityRestCtrl(IdentitySvc identitySvc) {
        this.identitySvc = identitySvc;
    }

//    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/identities")
    public Set<Identity> getIdentities() {
        return identitySvc.getIdentities();
    }

//    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/identities/{id}")
    public Identity getIdentity(@PathVariable int id) {
        return identitySvc.getIdentity(id);
    }


//
//    @GetMapping("/create")
//    public String createForm(Model domainModel) {
//
//        Identity identity = new Identity();
//        domainModel.addAttribute("identity", identity);
//
//        return "identity/create";
//    }

//    @PutMapping("/saveAndRedirectToIdentityList/{id}")
//    public Identity saveAndRedirectToIdentityList(
//            @RequestBody Identity identity, @PathVariable Integer id, HttpSession httpSession) {
//
//            return identityRepository.findById(id)
//                    .map(identity1 -> {
//                        identity1.setFirstName(identity.getFirstName());
//                        identity1.setLastName(identity.getLastName());
//                        return identityRepository.save(identity1);
//                    })
//                    .orElseGet(() -> {
//                        identity.setId(id);
//                        return identityRepository.save(identity);
//                    });


//        Integer id = identity.getId();
//        System.out.println("######################### id = " + id);
//
//        Identity savedIdentity = identitySvc.saveOrUpdate(identity);

//        String activeName;

//        if (identity.getActive()) {
//
//            // Get current active Identity
//            Active currentActive = activeDAO.findByEntity("Identity");
//
//            // Change active field in Identity to false
//            Identity formerActiveIdentity = identityDAO.find(currentActive.getEntityId());
//            formerActiveIdentity.setActive(false);
//
//
//            // Make saved Identity active
//            Active active = activeDAO.findByEntity("Identity");
//            active.setEntityId(savedIdentity.getId());
//            Active savedActive = activeDAO.saveOrUpdate(active);
//
//            // Create first name and last name string from active Identity
//            Identity activeIdentity = identityDAO.find(savedActive.getEntityId());
//            activeName = activeIdentity.getFirstName() + " " + activeIdentity.getLastName();
//
//            // Add active name to httpSession
//            httpSession.setAttribute("activeName", activeName);
//        }

//        return savedIdentity;
//    }
}

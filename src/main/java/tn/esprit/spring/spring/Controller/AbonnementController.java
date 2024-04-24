package tn.esprit.spring.spring.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.spring.Entity.Abonnement;
import tn.esprit.spring.spring.Entity.TypeAbonnement;
import tn.esprit.spring.spring.Interface.IAbonnementService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/Abonnement")
public class AbonnementController {
    IAbonnementService abonnementService;

    @GetMapping("/getSubscriptionByType/{type}")
    public Set<Abonnement> getSubscriptionByType(@PathVariable("type") TypeAbonnement type) {
        return abonnementService.getSubscriptionByType(type);
    }
    @GetMapping("/retrieveSubscriptions")
    public void retrieveSubscriptions() {
        abonnementService.retrieveSubscriptions();
    }
}

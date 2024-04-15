package tn.esprit.spring.spring.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.spring.Entity.Inscription;
import tn.esprit.spring.spring.Interface.IinscriptionService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Inscription")

public class InscriptionController {

    IinscriptionService iinscriptionService;

    @GetMapping("/retrieveCours/{idCours}")
    public List<Inscription> retrieveCours(@PathVariable("idCours") long idCours) {
        return iinscriptionService.retrieveCours(idCours);
    }
    @PostMapping("/addRegistrationAndAssignToSkier/{idSkieur}")
    public Inscription addRegistrationAndAssignToSkier(@RequestBody Inscription inscription, @PathVariable("idSkieur") long idSkieur) {
        return iinscriptionService.addRegistrationAndAssignToSkier(inscription, idSkieur);
    }
}

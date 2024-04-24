package tn.esprit.spring.spring.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.spring.Entity.Moniteur;
import tn.esprit.spring.spring.Interface.IMoniteurService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Moniteur")
public class MoniteurController {
    IMoniteurService moniteurService;
    @GetMapping("/retrieveAllMoniteurs")
    public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurService.retrieveAllMoniteurs();
    }
    @PostMapping("/addMoniteur")
    public Moniteur addMoniteur(@RequestBody Moniteur moniteur) {
        return moniteurService.addMoniteur(moniteur);
    }
    @PutMapping("/updateMoniteur")
    public Moniteur updateMoniteur(@RequestBody Moniteur moniteur) {
        return moniteurService.updateMoniteur(moniteur);
    }
    @GetMapping("/retrieveMoniteur/{numMoniteur}")
    public Moniteur retrieveMoniteur(@PathVariable("numMoniteur") Long numMoniteur) {
        return moniteurService.retrieveMoniteur(numMoniteur);
    }
}

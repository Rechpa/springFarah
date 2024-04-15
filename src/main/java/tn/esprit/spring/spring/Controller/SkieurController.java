package tn.esprit.spring.spring.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.spring.Entity.Skieur;
import tn.esprit.spring.spring.Interface.ISkieurService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Skieur")
public class SkieurController {
    ISkieurService skieurService;
@GetMapping(
        "/retrieveAllSkieurs")
    public List<Skieur> retrieveAllSkieurs() {
        return skieurService.retrieveAllSkieurs();
    }
@PostMapping("/addSkieur")
    public Skieur addSkieur(@RequestBody Skieur skieur) {
        return skieurService.addSkieur(skieur);
    }
@GetMapping("/removeSkieur/{numSkieur}")
    public void removeSkieur(@PathVariable("numSkieur") Long numSkieur) {
        skieurService.removeSkieur(numSkieur);
    }
@GetMapping("/retrieveSkieur/{numSkieur}")
    public Skieur retrieveSkieur(@PathVariable("numSkieur") Long numSkieur) {
        return skieurService.retrieveSkieur(numSkieur);
    }
}

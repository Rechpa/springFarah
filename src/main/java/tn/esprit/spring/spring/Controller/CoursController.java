package tn.esprit.spring.spring.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.spring.Entity.Cours;
import tn.esprit.spring.spring.Interface.ICoursService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Cours")
public class CoursController {
    ICoursService coursService;
@GetMapping("/retrieveAllCourses")
    public List<Cours> retrieveAllCourses() {
        return coursService.retrieveAllCourses();
    }

    @PostMapping("/addCours")

    public Cours addCours(@RequestBody Cours cours) {
        return coursService.addCours(cours);
    }
@PutMapping("/updateCours")
    public Cours updateCours( @RequestBody Cours cours) {
        return coursService.updateCours(cours);
    }
@GetMapping("/retieveCours/{numCours}")
    public Cours retrieveCours(@PathVariable("numCours") Long numCours) {
        return coursService.retrieveCours(numCours);
    }
@GetMapping("/findIns/{numCours}")
    public Cours findIns(@PathVariable("numCours") Long idInscription) {
        return coursService.findIns(idInscription);
    }
}

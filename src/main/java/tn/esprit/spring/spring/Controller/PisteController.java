package tn.esprit.spring.spring.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.spring.Entity.Piste;
import tn.esprit.spring.spring.Interface.IPisteService;

import java.util.List;

@Tag(name= "Piste")
// SWAGGER est un outil de documentation
@RestController
@AllArgsConstructor
@RequestMapping("/Piste")
public class PisteController {


    IPisteService pisteService;
    @Operation(description = "Retrieve All Pistes")
    @GetMapping("/retrieveAllPistes")

    public List<Piste> retrieveAllPistes() {
        return pisteService.retrieveAllPistes();
    }
@PostMapping("/AddPiste")
    public Piste addPiste(@RequestBody Piste piste) {
        return pisteService.addPiste(piste);
    }

    @PutMapping("/UpdatePiste")
    public Piste updatePiste(@RequestBody Piste piste) {
        return pisteService.updatePiste(piste);
    }

@GetMapping("/GetPiste/{numPiste}")
    public Piste retrievePiste(@PathVariable("numPiste") Long numPiste) {
        return pisteService.retrievePiste(numPiste);
    }

@GetMapping("/retrieveBySkieur/{idSkieur}")
    public List<Piste> retrieveBySkieur(@PathVariable("idSkieur") long idSkieur) {
        return pisteService.retrieveBySkieur(idSkieur);
    }
}

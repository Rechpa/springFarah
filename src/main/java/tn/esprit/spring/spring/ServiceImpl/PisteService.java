package tn.esprit.spring.spring.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.spring.Entity.Piste;
import tn.esprit.spring.spring.Interface.IPisteService;
import tn.esprit.spring.spring.Repository.PisteRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class PisteService implements IPisteService {

    PisteRepository pisteRepository;
    @Override
    public List<Piste> retrieveAllPistes() {
        return pisteRepository.findAll();
    }

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return pisteRepository.findById(numPiste).orElse(null);
    }

    @Override
    public List<Piste> retrieveBySkieur(long idSkieur) {
        return pisteRepository.findByListskiIdSkieur(idSkieur);
    }
}

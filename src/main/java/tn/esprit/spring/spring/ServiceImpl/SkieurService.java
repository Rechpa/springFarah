package tn.esprit.spring.spring.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.spring.Entity.Skieur;
import tn.esprit.spring.spring.Interface.ISkieurService;
import tn.esprit.spring.spring.Repository.SkieurRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class SkieurService implements ISkieurService {
    SkieurRepository skieurRepository;
    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public void removeSkieur(Long numSkieur) {
        skieurRepository.deleteById(numSkieur);

    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
        return skieurRepository.findById(numSkieur).orElse(null);
    }
}

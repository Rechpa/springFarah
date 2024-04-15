package tn.esprit.spring.spring.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.spring.Entity.Inscription;
import tn.esprit.spring.spring.Entity.Skieur;
import tn.esprit.spring.spring.Interface.ISkieurService;
import tn.esprit.spring.spring.Interface.IinscriptionService;
import tn.esprit.spring.spring.Repository.InscriptionRepository;
import tn.esprit.spring.spring.Repository.SkieurRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class InscriptionService implements IinscriptionService {
    InscriptionRepository inscriptionRepository;
    SkieurRepository skieurRepository;
    @Override
    public List<Inscription> retrieveCours(long idCours) {
        return inscriptionRepository.findByCIdCours(idCours);
    }

    @Override
    public Inscription addRegistrationAndAssignToSkier(Inscription inscription, long idSkieur) {
        Skieur skieur = skieurRepository.findById(idSkieur).orElse(null);
        inscription.setSki(skieur);
        return inscriptionRepository.save(inscription);
    }
}

package tn.esprit.spring.spring.Interface;
import tn.esprit.spring.spring.Entity.Skieur;

import java.util.List;
public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();
    Skieur addSkieur(Skieur skieur);
    void removeSkieur (Long numSkieur);
    Skieur retrieveSkieur (Long numSkieur);

}

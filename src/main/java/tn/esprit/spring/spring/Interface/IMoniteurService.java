package tn.esprit.spring.spring.Interface;
import tn.esprit.spring.spring.Entity.Moniteur;

import java.util.List;
public interface IMoniteurService {
    List<Moniteur> retrieveAllMoniteurs();
    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur updateMoniteur (Moniteur moniteur);
    Moniteur retrieveMoniteur (Long numMoniteur);
}

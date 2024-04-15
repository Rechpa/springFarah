package tn.esprit.spring.spring.Interface;

import tn.esprit.spring.spring.Entity.Inscription;

import java.util.List;

public interface IinscriptionService {
    List<Inscription> retrieveCours(long idCours);

    Inscription addRegistrationAndAssignToSkier(Inscription inscription, long idSkieur);

}

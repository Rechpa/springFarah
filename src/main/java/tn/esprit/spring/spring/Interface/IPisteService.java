package tn.esprit.spring.spring.Interface;
import tn.esprit.spring.spring.Entity.Piste;

import java.util.List;
public interface IPisteService {
    List<Piste> retrieveAllPistes();
    Piste addPiste(Piste piste);
    Piste updatePiste (Piste piste);
    Piste retrievePiste (Long numPiste);
    List<Piste> retrieveBySkieur(long idSkieur);
}

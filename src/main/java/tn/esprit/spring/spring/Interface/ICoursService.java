package tn.esprit.spring.spring.Interface;

import tn.esprit.spring.spring.Entity.Cours;
import java.util.List;
public interface ICoursService {
    List<Cours> retrieveAllCourses();
    Cours addCours(Cours cours);
    Cours updateCours (Cours cours);
    Cours retrieveCours (Long numCours);
    Cours findIns (Long idInscription);
}

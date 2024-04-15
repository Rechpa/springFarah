package tn.esprit.spring.spring.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import tn.esprit.spring.spring.Entity.Cours;
import tn.esprit.spring.spring.Interface.ICoursService;
import tn.esprit.spring.spring.Repository.CoursRepository;

import java.util.List;
import java.util.function.Function;

@Service
@AllArgsConstructor
public class CoursService implements ICoursService {

    CoursRepository coursRepository;
    @Override
    public List<Cours> retrieveAllCourses() {
        return coursRepository.findAll();
    }

    @Override
    public Cours addCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours retrieveCours(Long numCours) {
        return coursRepository.findById(numCours).orElse(null);
    }

    @Override
    public Cours findIns(Long idInscription) {
        return coursRepository.findByInsIdInscription(idInscription);
    }
}

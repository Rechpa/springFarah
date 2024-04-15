package tn.esprit.spring.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.spring.Entity.Skieur;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur,Long> {

    List<Skieur> findByLpisteIdPiste(long idPiste);
}

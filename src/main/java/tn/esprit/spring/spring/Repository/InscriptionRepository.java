package tn.esprit.spring.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.spring.Entity.Inscription;

import java.util.List;

public interface InscriptionRepository extends JpaRepository<Inscription,Long> {
    List<Inscription> findByCIdCours(long idCours );
}

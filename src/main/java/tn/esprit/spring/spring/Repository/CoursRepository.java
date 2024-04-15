package tn.esprit.spring.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.spring.Entity.Cours;

public interface CoursRepository extends JpaRepository<Cours,Long> {
Cours findByInsIdInscription(long idInscription);
}

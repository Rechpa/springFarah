package tn.esprit.spring.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.spring.spring.Entity.Piste;

import java.util.List;

public interface PisteRepository extends JpaRepository<Piste,Long> {
    List<Piste> findByListskiIdSkieur(long idSkieur);

    List<Piste> findByListskiNomSLikeAndListskiInscriIdInscription(String nomS, long idInscription);

    List<Piste> findByListskiNomSLike(String nomS);
}

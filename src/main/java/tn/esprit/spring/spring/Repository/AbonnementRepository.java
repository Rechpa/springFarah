package tn.esprit.spring.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.spring.spring.Entity.Abonnement;
import tn.esprit.spring.spring.Entity.TypeAbonnement;

import java.util.List;
import java.util.Set;

public interface AbonnementRepository extends JpaRepository<Abonnement,Long> {

    @Query("select a from Abonnement a where a.dateFin < current date")
    List<Abonnement> getSubscriptionByDate();


    Set<Abonnement> findByTypeAbonOrderByDateDebut(TypeAbonnement typeAbonnement);

}

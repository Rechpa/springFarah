package tn.esprit.spring.spring.Interface;

import tn.esprit.spring.spring.Entity.Abonnement;
import tn.esprit.spring.spring.Entity.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface IAbonnementService {
    Set<Abonnement> getSubscriptionByType(TypeAbonnement type);

    void retrieveSubscriptions();

}

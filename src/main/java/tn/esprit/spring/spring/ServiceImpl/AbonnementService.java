package tn.esprit.spring.spring.ServiceImpl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.spring.Entity.Abonnement;
import tn.esprit.spring.spring.Entity.Skieur;
import tn.esprit.spring.spring.Entity.TypeAbonnement;
import tn.esprit.spring.spring.Interface.IAbonnementService;
import tn.esprit.spring.spring.Repository.AbonnementRepository;
import tn.esprit.spring.spring.Repository.SkieurRepository;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Service
@AllArgsConstructor
@Slf4j
public class AbonnementService implements IAbonnementService {

    AbonnementRepository abonnementRepository;
    SkieurRepository skieurRepository;
    @Override
    public Set<Abonnement> getSubscriptionByType(TypeAbonnement type) {
        return abonnementRepository.findByTypeAbonOrderByDateDebut(type);
    }

    @Override
    public void retrieveSubscriptions() {

        List<Abonnement> list = new ArrayList<>();
        list = abonnementRepository.getSubscriptionByDate();

        List<Abonnement> list2 = new ArrayList<>();
        for (Abonnement a : list) {
             // Skieur skieur = skieurRepository.findBy(a);
            long differenceInDays = ChronoUnit.DAYS.between(a.getDateFin(),LocalDate.now());
            if (differenceInDays > 7){
                list2.add(a);
                System.out.println(a);
                 // log.info(a.getIdAbon() + "|" + a.getDateFin().toString()  + "|" + skieur.getNomS()  + "|" + skieur.getPrenomS() );
            }

        }

    }
}

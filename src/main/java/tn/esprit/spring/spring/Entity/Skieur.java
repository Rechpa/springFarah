package tn.esprit.spring.spring.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idSkieur;
    String nomS;
    String prenomS;
    LocalDate dateNaissance;
    String ville;

    @ToString.Exclude
    @OneToOne
    Abonnement abon;

    @ToString.Exclude
    @ManyToMany (mappedBy = "listski")
    List<Piste> lpiste;

    @ToString.Exclude
    @OneToMany (mappedBy = "ski")
    Set<Inscription> inscri;
}

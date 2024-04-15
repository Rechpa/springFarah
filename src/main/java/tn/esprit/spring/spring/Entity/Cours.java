package tn.esprit.spring.spring.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idCours;
    int niveau;
    TypeCours typecours;
    Support support;
    float prix;
    int creneau;

    @ToString.Exclude
    @OneToMany (mappedBy = "c")
    Set<Inscription> ins;
}

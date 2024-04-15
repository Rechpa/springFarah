package tn.esprit.spring.spring.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idPiste;
    @Enumerated(EnumType.STRING)
    Couleur couleur;
    String nomPiste;
    int longueur;
    int  pente;

    @ToString.Exclude
    @ManyToMany
    List<Skieur> listski;
}

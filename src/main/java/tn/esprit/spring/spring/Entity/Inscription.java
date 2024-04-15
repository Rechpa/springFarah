package tn.esprit.spring.spring.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idInscription;
    int numSemaine;

    @ToString.Exclude
    @ManyToOne
            @JsonIgnore
    Skieur ski;

    @ToString.Exclude
    @ManyToOne
    @JsonIgnore
    Cours c;
}

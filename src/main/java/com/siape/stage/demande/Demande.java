package com.siape.stage.demande;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table

public class Demande {
    @Id
    @SequenceGenerator(name = "demande_sequence",sequenceName = "demande_sequence",allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "demande_sequence"
    )
    private Long id;
    private Long cin;
    private String nom;
    private String prenom;
    private String email;
    private String cv;
    private String sujet;

    public Demande(Long cin, String nom, String prenom, String email, String cv, String sujet) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.cv = cv;
        this.sujet = sujet;
    }
}

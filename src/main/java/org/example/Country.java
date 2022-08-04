package org.example;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="COUNTRIES")
@Getter
@Setter
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToOne
    private Capital capital;
}

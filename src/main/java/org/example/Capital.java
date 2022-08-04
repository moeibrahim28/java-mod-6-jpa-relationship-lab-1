package org.example;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="CAPITALS")
@Getter
@Setter
public class Capital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToOne(mappedBy = "capital",cascade = CascadeType.REMOVE)
    private Country country;

}

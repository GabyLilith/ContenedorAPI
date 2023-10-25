package com.example.icecream.modelos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "icecream")
public class Icecream {

    @Getter
    @Setter
    @Column(name = "id") @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter @Setter @Column(name = "flavor")
    private String flavor;
}

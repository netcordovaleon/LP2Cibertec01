package com.cibertec.springproject.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

//ESTRUCTURAS
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Name;
    private int Age;
    private String Color;
    private boolean Status;
    @ManyToOne
    @JoinColumn(name="client_id")
    private Client client;
    @ManyToOne
    @JoinColumn(name="breed_id")
    private Breed breed;
}

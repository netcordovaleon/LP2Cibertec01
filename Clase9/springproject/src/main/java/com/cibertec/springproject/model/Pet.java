package com.cibertec.springproject.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;

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
    private double Weight;
    @Column(nullable = true)
    private  double Height;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client Client;
}

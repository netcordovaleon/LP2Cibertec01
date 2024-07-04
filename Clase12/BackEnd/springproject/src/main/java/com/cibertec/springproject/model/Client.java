package com.cibertec.springproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String DocumentType;
    private String DocumentNumber;
    private String LastName;
    private boolean Status;
    @OneToMany(mappedBy="client")
    private Set<Pet> pets;
}

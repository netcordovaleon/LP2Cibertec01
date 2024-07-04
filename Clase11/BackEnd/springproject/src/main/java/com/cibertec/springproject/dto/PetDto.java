package com.cibertec.springproject.dto;

import lombok.*;

import java.util.Optional;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PetDto {
    private Optional<Integer> Id;
    private String Name;
    private int Age;
    private String Color;
    private boolean Status;
    private int BreedId;
}

package com.cibertec.springproject.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PetDTO {
    private int Id;
    private String Name;
    private int Age;
    private String Color;
    private boolean Status;
    private double Weight;
    private double Height;
}

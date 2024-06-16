package com.cibertec.springproject.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class ClientAndPetDTO {
    private ClientDTO ClientDto;
    private List<PetDTO> PetsDto;
}

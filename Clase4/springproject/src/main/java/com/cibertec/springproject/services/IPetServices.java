package com.cibertec.springproject.services;

import com.cibertec.springproject.model.Pet;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IPetServices {
    List<Pet> GetAllPets();
    Pet SavePet(Pet entity);
    List<Pet> SearchPets(String name);
}

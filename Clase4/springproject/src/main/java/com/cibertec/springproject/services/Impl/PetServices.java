package com.cibertec.springproject.services.Impl;

import com.cibertec.springproject.model.Pet;
import com.cibertec.springproject.services.IPetServices;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetServices implements IPetServices {

    @Override
    public List<Pet> GetAllPets() {
        List<Pet> petsList = new ArrayList<>();
        petsList.add(new Pet(1, "Lucy", 2));
        petsList.add(new Pet(2, "Bethobeen", 6));
        return petsList;
    }

    @Override
    public Pet SavePet(Pet entity) {
        return null;
    }

    @Override
    public List<Pet> SearchPets(String name) {
        return null;
    }
}

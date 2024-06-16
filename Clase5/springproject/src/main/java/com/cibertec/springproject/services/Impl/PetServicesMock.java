package com.cibertec.springproject.services.Impl;

import com.cibertec.springproject.model.Pet;
import com.cibertec.springproject.services.IPetServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("PetServicesMock")
public class PetServicesMock implements IPetServices {


    @Override
    public List<Pet> GetAllPets() {
        List<Pet> listPets = new ArrayList<>();
        Pet objpet = new Pet();
        objpet.setId(1);
        objpet.setName("Mascota Mock");
        listPets.add(objpet);
        return listPets;
    }

    @Override
    public Pet SavePet(Pet entity) {
        return null;
    }

    @Override
    public Pet FindPetById(int id) {
        return null;
    }

    @Override
    public List<Pet> SearchPets(String name) {
        return List.of();
    }
}

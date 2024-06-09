package com.cibertec.springproject.services.Impl;

import com.cibertec.springproject.model.Pet;
import com.cibertec.springproject.repository.IPetRepository;
import com.cibertec.springproject.services.IPetServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// LOGICA DE NEGOCIO (VALIDACIONES; CONVERTIR OBJETOS, PROCESAR INFORMACION)
@Service
public class PetServices implements IPetServices {

    IPetRepository _petRepository;

    @Autowired
    public PetServices(IPetRepository petRepository) {
        _petRepository = petRepository;
    }


    @Override
    public List<Pet> GetAllPets() {
        return _petRepository.findAll();
    }

    @Override
    public Pet SavePet(Pet entity) {
        Pet petSaved = _petRepository.save(entity);
        return petSaved;
    }

    @Override
    public Pet FindPetById(int id) {
        Optional<Pet> rowInDB = _petRepository.findById(id);
        if (rowInDB.isPresent())
            return rowInDB.get();
        else
            return new Pet();
    }

    @Override
    public List<Pet> SearchPets(String name) {
        return null;
    }
}

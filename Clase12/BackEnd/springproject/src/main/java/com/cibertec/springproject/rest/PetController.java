package com.cibertec.springproject.rest;


import com.cibertec.springproject.model.Pet;
import com.cibertec.springproject.services.IPetServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// PRINCIPAL (LO QUE SE EXPONE)
@RestController
public class PetController {

    IPetServices petServices;

    @Autowired
    public PetController(IPetServices petServices) {
        this.petServices=petServices;
    }

    @GetMapping("/pets")
    public List<Pet> getAll() {
        return petServices.GetAllPets();
    }

    @GetMapping("/pet/{id}")
    public Pet getAll(@PathVariable int id) {
        return petServices.FindPetById(id);
    }

    @PostMapping("/pet")
    public Pet savePet(@RequestBody Pet entity) {
        return petServices.SavePet(entity);
    }


    @PostMapping("/test")
    public String Test() {
        return "Message From Docker";
    }

}

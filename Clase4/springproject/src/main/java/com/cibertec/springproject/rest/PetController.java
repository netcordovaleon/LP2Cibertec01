package com.cibertec.springproject.rest;


import com.cibertec.springproject.model.Pet;
import com.cibertec.springproject.services.IPetServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

}
